package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables=Resource.class)
public class OutputImageModel {
		
	
	@Inject
	private String fileReference;

	
	public String getFileReference() {
		return fileReference;
	}
	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}	
	
	
}
