package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class)
public class InputSubmitModel {
		
	
	@Inject
	private String textSubmit;

	@Inject
	private String submitHint;
	
	
	public String getTextSubmit() {
		return textSubmit;
	}

	public String getSubmitHint() {
		return submitHint;
	}
	
		
}
