package pl.omega.web_adapter.ci.xpaths;

import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import pl.omega.model.Kingdom;
import pl.omega.model.OmegaPage;

public class XPathKingdomDataLoader {

	public Kingdom updateKingdom(Kingdom k, TagNode root, String omegaPage) {
		try {
			if (omegaPage.equals(OmegaPage.OVERVIEW))
				return overViewKingdomUpdater(k, root);
		} catch (XPatherException e) {

		}
		throw new RuntimeException("invalid omega page or not implemented yet");
	}

	private Kingdom overViewKingdomUpdater(Kingdom k, TagNode root)
			throws XPatherException {
		Object[] metaData = evaluateXPath(root, OverviewTabXPaths.metaXPath);

		if (metaData != null) {
			for (Object o : metaData) {
				TagNode tag = (TagNode) o;
				if (tagContainsValueForKey(tag,
						OverviewTabXPaths.metaAttributeNameKey,
						OverviewTabXPaths.metaAttributeValueUniverseSpeed)) {
					k.setUniversumSpeed(Integer.parseInt(tag
							.getAttributeByName(OverviewTabXPaths.metaAttributeContentKey)));
				}
			}
		}
		return k;
	}

	private boolean tagContainsValueForKey(TagNode tag, String key, String value) {
		String attributeByName = tag.getAttributeByName(key);
		if (attributeByName != null) 
			return attributeByName.equals(value);
		else return false;
	}

	private Object[] evaluateXPath(TagNode root, String xPath)
			throws XPatherException {
		try {
			return root.evaluateXPath(xPath);
		} catch (XPatherException e) {
			// TODO Adam Puchalski - Apr 17, 2012 - exceptionHandling
			e.printStackTrace();
		}
		return null;
	}

}
