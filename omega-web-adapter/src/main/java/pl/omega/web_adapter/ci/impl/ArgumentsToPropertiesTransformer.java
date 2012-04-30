package pl.omega.web_adapter.ci.impl;

import pl.omega.model.OmegaPage;
import pl.omega.model.Properties;
import pl.omega.model.objects.CrystalMine;
import pl.omega.model.objects.DeuteriumMine;
import pl.omega.model.objects.FusionPowerPlant;
import pl.omega.model.objects.MetalMine;
import pl.omega.model.objects.SolarPowerPlant;

public class ArgumentsToPropertiesTransformer {

	public Properties transform(OmegaPage pageToView, Class clazz) {
		if (pageToView.equals(OmegaPage.RESOURCES)) 
			return resourcesPageTransformer(clazz);
		throw new RuntimeException("invalid omega page or not implemented yet");
	}

	private Properties resourcesPageTransformer(Class clazz) {
		Properties p = createStandardProperties();
		resourcesMapClassToProperty(p, clazz);
		return p;
	}

	private void resourcesMapClassToProperty(Properties p, Class clazz) {
		if (clazz.equals(MetalMine.class)) {
			p.put("type", "1");
		}
		else if (clazz.equals(CrystalMine.class)) {
			p.put("type", "2");
		}
		else if (clazz.equals(DeuteriumMine.class)) {
			p.put("type", "3");
		}
		else if (clazz.equals(SolarPowerPlant.class)) {
			p.put("type", "4");
		}
		else if (clazz.equals(FusionPowerPlant.class)) {
			p.put("type", "12");
		}
		// TODO Adam Puchalski - Apr 30, 2012 - o discuss how to solve this problem... seems like a refactoring is to be done...
		// TODO Adam Puchalski - Apr 30, 2012 - mapping of building-id is being done here and in the Xpaths...
	}

	private Properties createStandardProperties() {
		Properties p = new Properties();
		p.put("modus", "1");
		p.put("menge", "1");
		return p;
	}

}
