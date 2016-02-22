package pl.kwi.core.utils;

import org.apache.sling.api.resource.Resource;

import com.adobe.cq.sightly.WCMUse;

public class FormUtil extends WCMUse{
	
	private boolean componentExists;

	@Override
	public void activate() throws Exception {
		String componentPath = get("componentPath", String.class);
		Resource resource = getResource();
		
		Resource res = null;
		try {
			res = resource.getChild(componentPath);
		} catch (Exception e) {}
		
		if(res == null) {
			componentExists = false;
		}else {
			componentExists = true;
		}
		
	}

	public boolean isComponentExists() {
		return componentExists;
	}
		
	
	
//	private FormUtil() {}
//	
//	
//	/**
//	 * Method gets model with result - if component with specified name exists.
//	 * 
//	 * @param resource object <code>Resource</code> with resource from page
//	 * @param componentName object <code>String</code> with component`s name
//	 * @return object <code>FormUtilModel</code> with model of data from FromUtil
//	 */
//	public static FormUtilModel getModelWithResultComponentExist(Resource resource, String componentName) {
//				
//		Resource res = null;
//		try {
//			res = resource.getChild(componentName);
//		} catch (Exception e) {}
//		
//		if(res == null) {
//			return new FormUtilModel(false);
//		}else {
//			return new FormUtilModel(true);
//		}
//		
//	}

}
