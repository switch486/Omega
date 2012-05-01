package pl.omega.web_adapter.ci.impl;

import pl.omega.model.Properties;
import pl.omega.model.objects.ExecutableOmegaObject;

public class ArgumentsToPropertiesTransformer {

	public Properties transform(ExecutableOmegaObject object, String token) {
		Properties p = createStandardProperties();
		mapClassToProperty(p, object);
		mapTokenToProperty(p, token);
		return p;
	}

	private void mapTokenToProperty(Properties p, String token) {
		p.put("token", token);
	}

	private void mapClassToProperty(Properties p, ExecutableOmegaObject object) {
		p.put("type", "" + object.referenceID);
	}

	private Properties createStandardProperties() {
		Properties p = new Properties();
		p.put("modus", "1");
		p.put("menge", "1");
		return p;
	}

}
