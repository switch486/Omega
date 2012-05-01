package pl.omega.web_adapter.ci.impl;

import pl.omega.model.Properties;
import pl.omega.model.objects.ExecutableOmegaObject;

public class ArgumentsToPropertiesTransformer {

	public Properties transform(ExecutableOmegaObject object) {
		Properties p = createStandardProperties();
		resourcesMapClassToProperty(p, object);
		return p;
	}

	private void resourcesMapClassToProperty(Properties p, ExecutableOmegaObject object) {
			p.put("type", ""+object.referenceID);
	}

	private Properties createStandardProperties() {
		Properties p = new Properties();
		p.put("modus", "1");
		p.put("menge", "1");
		return p;
	}

}
