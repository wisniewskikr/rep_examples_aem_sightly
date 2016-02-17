package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;

import com.adobe.cq.sightly.WCMUse;


@Model(adaptables=SlingHttpServletRequest.class)
public class InputContentModel extends WCMUse{
		
	
	@Inject @Via("resource")
	private String textName;

	@Inject @Via("resource")
	private String nameErrorMessage;
	
	@Inject @Via("resource")
	private String nameDescription;
	
	private String currentPagePath;
	
	private String errorField;
	
	
	@Override
	public void activate() throws Exception {
		currentPagePath = getCurrentPage().getPath();
		errorField = getRequest().getParameter("errorField");
	}

	
	public String getTextName() {
		return textName;
	}

	public String getNameErrorMessage() {
		return nameErrorMessage;
	}

	public String getNameDescription() {
		return nameDescription;
	}

	public String getCurrentPagePath() {
		return currentPagePath;
	}

	public String getErrorField() {
		return errorField;
	}

		
}
