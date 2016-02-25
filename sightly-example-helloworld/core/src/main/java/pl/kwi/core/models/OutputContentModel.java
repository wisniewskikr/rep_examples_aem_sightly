package pl.kwi.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;


@Model(adaptables=SlingHttpServletRequest.class)
public class OutputContentModel {
		
	
	@Inject @Via("resource")
	private String textHelloWorld;
	
	@SlingObject
	protected SlingHttpServletRequest request;
	
	private String name;
	
	
	@PostConstruct
	public void init() {
		name = request.getParameter("name");
	}
	
	
	public String getTextHelloWorld() {
		return textHelloWorld;
	}

	public String getName() {
		return name;
	}
	
	
}
