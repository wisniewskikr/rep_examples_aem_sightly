package pl.kwi.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;


@Model(adaptables=SlingHttpServletRequest.class)
public class InputContentModel{
		
	
	@Inject @Via("resource")
	private String textName;

	@Inject @Via("resource")
	private String nameErrorMessage;
	
	@Inject @Via("resource")
	private String nameDescription;
	
	@SlingObject
	protected SlingHttpServletRequest request;
	
	private String errorField;
	
	
	@PostConstruct
	public void init() {		
		errorField = request.getParameter("errorField");
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

	public String getErrorField() {
		return errorField;
	}

		
}
