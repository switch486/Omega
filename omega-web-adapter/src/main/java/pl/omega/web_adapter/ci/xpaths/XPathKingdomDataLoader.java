package pl.omega.web_adapter.ci.xpaths;

import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import pl.omega.model.Coordinates;
import pl.omega.model.Kingdom;
import pl.omega.model.OmegaPage;
import pl.omega.model.Planet;
import pl.omega.web_adapter.ci.Strategy;

public class XPathKingdomDataLoader {

	public Kingdom updateKingdomInfo(Kingdom k, Planet p, TagNode root,
			String pageBody, OmegaPage omegaPage, Strategy strategy) {
		if (omegaPage.equals(OmegaPage.OVERVIEW))
			return overviewKingdomUpdater(k, p, root, pageBody);
		if (omegaPage.equals(OmegaPage.RESOURCES))
			return resourcesKingdomUpdater(k, p, root, strategy);
		throw new RuntimeException("invalid omega page or not implemented yet");
	}

	private Kingdom resourcesKingdomUpdater(Kingdom k, Planet p, TagNode root,
			Strategy strategy) {
		parseDependingOnStrategy(k, p, root, strategy);

		updateResourcesPageSpecificInformation(p, root);
		return k;
	}

	private void updateResourcesPageSpecificInformation(Planet p, TagNode root) {
		p.getMetalMine().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceMetalXPath)));
		p.getCrystalMine().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceCrystalXPath)));
		p.getDeuteriumMine().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceDeuteriumXPath)));
		p.getSolarPowerPlant().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceSolarPowerPlantXPath)));
		p.getFusionPowerPlant().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceFusionPowerPlantXPath)));
		// TODO Adam Puchalski - Apr 24, 2012 - Solar Satelites here?
		p.getMetalWarehouse().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceMetalWarehouseXPath)));
		p.getCrystalWarehouse().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceCrystalWarehouseXPath)));
		p.getDeuteriumWarehouse().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceDeuteriumWarehouseXPath)));
		p.getMetalHideout().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceMetalHideoutXPath)));
		p.getCrystalHideout().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceCrystalHideoutXPath)));
		p.getDeuteriumHideout().setLevel(
				toStringThirdChild(evaluateXPath(root,
						ResourcesTabXPaths.resourceDeuteriumHideoutXPath)));
	}

	private void parseDependingOnStrategy(Kingdom k, Planet p, TagNode root,
			Strategy strategy) {
		if (strategy == Strategy.SINGLE_PAGE) {
			parseEagerly(k, p, root);
		}
	}

	private Kingdom overviewKingdomUpdater(Kingdom k, Planet p, TagNode root,
			String pageBody) {
		parseEagerly(k, p, root);

		updateOverviewPageSpecificInformation(k, pageBody);

		return k;
	}

	private void parseEagerly(Kingdom k, Planet p, TagNode root) {
		// The overview page is always parsed fully.
		Object[] metaData = evaluateXPath(root, OverviewTabXPaths.metaXPath);

		updateBasedOnMetadata(k, metaData);

		// in case the kingdom is new, the planet passed here will be null
		Planet planet = p == null ? k.getHomePlanet() : p;
		updateResourcesForPlanet(planet, root);

		updateThePlanetsInfo(k, root);
	}

	private void updateThePlanetsInfo(Kingdom k, TagNode root) {
		// TODO Adam Puchalski - Apr 19, 2012 - Dear God... so late....
		// refactor!
		// read all planets on the page, determine the HomePlanet, update home,
		// create the rest.
		// 4/4? check if it is relevant
		String planetCount = toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.planetCountXPath));
		Object[] planets = evaluateXPath(root, OverviewTabXPaths.planetsXPath);
		// setting dumy planet name.....
		for (Object o : planets) {
			TagNode t = (TagNode) o;
			String planetCode = t
					.getAttributeByName(OverviewTabXPaths.planetsAttributeHrefKey);
			planetCode = planetCode.substring(planetCode.indexOf("cp=") + 3);
			long planetID = Long.parseLong(planetCode);
			if (tagContainsValueForKey(t,
					OverviewTabXPaths.planetsAttributeClassKey,
					OverviewTabXPaths.planetsBuildingAtTheMomentValue)) {
				continue;
			}

			String base = t.getChildren().get(0).toString();
			String name = base.substring(0, base.indexOf("["));
			base = base.replace(name, "");
			name = name.trim();
			String[] b = base.split(" ");

			String coords = b[0].substring(0, b[0].lastIndexOf("]") + 1);
			int firstParenthesis = b[1].indexOf('(');
			int lastParenthesis = b[1].lastIndexOf(')');
			String[] fields = b[1].substring(firstParenthesis + 1,
					lastParenthesis).split("/");
			int usedFields = Integer.parseInt(fields[0]);
			int allFields = Integer.parseInt(fields[1]);
			String temperatureLow = b[2];
			String temperatureHigh = b[5];

			Planet p;
			if (k.getHomePlanet().getPlanetID() == planetID) {
				// update the Home Planet
				p = k.getHomePlanet();
			} else {
				// create and update colonies
				p = new Planet();
				p.setName(name);
				p.setCoordinates(new Coordinates(coords));

				k.addPlanet(p);
			}
			p.setTemperatureHigh(temperatureHigh);
			p.setTemperatureLow(temperatureLow);
			p.setUsedFields(usedFields);
			p.setAllFields(allFields);
		}
	}

	private void updateOverviewPageSpecificInformation(Kingdom k,
			String pageBody) {
		// TODO Adam Puchalski - Apr 19, 2012 - check if this is actually
		// needed!
		// TODO Adam Puchalski - Apr 18, 2012 - this place should be reworked...
		// a lot of mess is going on here -> possibility of an improvement
		int start = pageBody.indexOf("textContent[0] = ");
		int end = pageBody.indexOf("textDestination[0] = ");
		String[] webPageParts = pageBody.substring(start, end).split("\n");

		// TODO Adam Puchalski - Apr 18, 2012 - this information is parsed from
		// the right side of the webPage - all planets.
		// String planetSize = webPageParts[1];
		// int firstParenthesis = planetSize.indexOf('(');
		// int lastParenthesis = planetSize.lastIndexOf(')');
		// planetSize = planetSize.substring(firstParenthesis+1,
		// lastParenthesis);
		// planetSize = planetSize.replace("<span>", "").replace("<\\/span>",
		// "").replace("\\", "").replace(" ", "");
		// p.setPlanetSize(planetSize);
		//
		// //od -25 °C do 15 °C
		// String temperature = webPageParts[3];
		// // TODO Adam Puchalski - Apr 18, 2012 - the parsing can cause
		// problems on unis where the temperature format is different.
		// String[] temps = temperature.split(" ");
		// p.setTemperatureLow(temps[3]);
		// p.setTemperatureHigh(temps[6]);

		String score = webPageParts[7];
		int firstClosing = score.indexOf(">");
		int lastOpening = score.lastIndexOf("<");
		score = score.substring(firstClosing + 1, lastOpening).replace("(", "")
				.replace(")", "");
		String[] split = score.split(" ");

		k.setScore(split[0]);
		k.setPositionActuall(split[2]);
		k.setGamersActuall(split[4]);

	}

	private void updateResourcesForPlanet(Planet planet, TagNode root) {
		planet.setResMetal(toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.resourceMetalXPath)));
		planet.setResCristal(toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.resourceCrystalXPath)));
		planet.setResDeuterium(toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.resourceDeuteriumXPath)));
		planet.setResEnergy(toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.resourceEnergyXPath)));
		planet.setResDarkMatter(toStringFirstChild(evaluateXPath(root,
				OverviewTabXPaths.resourceDarkmatterXPath)));
	}

	private String toStringNthChild(Object[] evaluatedXPath, int n) {
		return ((TagNode) (evaluatedXPath[0])).getChildren().get(n).toString();
	}

	private String toStringFirstChild(Object[] evaluateXPath) {
		return toStringNthChild(evaluateXPath, 0);
	}

	private String toStringThirdChild(Object[] evaluateXPath) {
		return toStringNthChild(evaluateXPath, 2);
	}

	private void updateBasedOnMetadata(Kingdom k, Object[] metaData) {
		if (metaData != null) {
			Planet homePlanet = new Planet();
			for (Object o : metaData) {
				TagNode tag = (TagNode) o;
				if (tagContainsValueForKey(tag,
						OverviewTabXPaths.metaAttributeNameKey,
						OverviewTabXPaths.metaAttributeValueUniverseSpeed)) {
					k.setUniversumSpeed(metaAttributeGetContent(tag));
					continue;
				}
				if (tagContainsValueForKey(tag,
						OverviewTabXPaths.metaAttributeNameKey,
						OverviewTabXPaths.metaAttributeValueHomePlanetID)) {
					homePlanet.setPlanetID(metaAttributeGetContent(tag));
					continue;
				}
				if (tagContainsValueForKey(tag,
						OverviewTabXPaths.metaAttributeNameKey,
						OverviewTabXPaths.metaAttributeValueHomePlanetName)) {
					homePlanet.setName(metaAttributeGetContent(tag));
					continue;
				}
				if (tagContainsValueForKey(
						tag,
						OverviewTabXPaths.metaAttributeNameKey,
						OverviewTabXPaths.metaAttributeValueHomePlanetCoordinates)) {
					homePlanet.setCoordinates(new Coordinates(
							metaAttributeGetContent(tag)));
					continue;
				}
			}
			k.setHomePlanet(homePlanet);
		}
	}

	private String metaAttributeGetContent(TagNode tag) {
		return tag
				.getAttributeByName(OverviewTabXPaths.metaAttributeContentKey);
	}

	private boolean tagContainsValueForKey(TagNode tag, String key, String value) {
		String attributeByName = tag.getAttributeByName(key);
		if (attributeByName != null)
			return attributeByName.equals(value);
		else
			return false;
	}

	private Object[] evaluateXPath(TagNode root, String xPath) {
		try {
			return root.evaluateXPath(xPath);
		} catch (XPatherException e) {
			// TODO Adam Puchalski - Apr 17, 2012 - exceptionHandling
			e.printStackTrace();
		}
		return null;
	}

}
