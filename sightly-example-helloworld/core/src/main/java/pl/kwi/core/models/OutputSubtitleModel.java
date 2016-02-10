package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables=Resource.class)
public class OutputSubtitleModel {
	
	
	@Inject
	private String textPage;

	@Inject
	private String textOutput;

	
	public String getTextPage() {
		return textPage;
	}

	public String getTextOutput() {
		return textOutput;
	}
	
		
}
