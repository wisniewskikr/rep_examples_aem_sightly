package pl.kwi.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables=Resource.class)
public class InputFormModel {
	
	
	@Inject
	private String submitTarget;
	

	public String getSubmitTarget() {
		return submitTarget;
	}
	public void setSubmitTarget(String submitTarget) {
		this.submitTarget = submitTarget;
	}
			
}
