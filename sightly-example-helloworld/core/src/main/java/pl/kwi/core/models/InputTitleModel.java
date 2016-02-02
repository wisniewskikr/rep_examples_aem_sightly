package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables=Resource.class)
public class InputTitleModel {
	
	
	@Inject
	private String textHelloWorld;

	
	public String getTextHelloWorld() {
		return textHelloWorld;
	}
	
	
}
