package pl.kwi.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import com.day.cq.wcm.api.PageManager;


@Model(adaptables=Resource.class)
public class OutputBackModel {
		
	
	@Inject
	private String textBack;
	
	@Inject
	private String backHint;
	
	@Inject @Default
	private String backTarget;
	
	@SlingObject
	private Resource resource;
	
	private boolean backTargetEmpty;
	
	
	@PostConstruct
	public void init() {
		
		backTargetEmpty = false;
		
		if("".equals(backTarget)) {
			backTargetEmpty = true;			
			backTarget = resource.getResourceResolver().adaptTo(PageManager.class).getContainingPage(resource).getPath();
		}
		
		backTarget = resource.getResourceResolver().map(backTarget);
		
	}
	
	
	public String getTextBack() {
		return textBack;
	}

	public String getBackHint() {
		return backHint;
	}

	public String getBackTarget() {
		return backTarget;
	}

	public boolean isBackTargetEmpty() {		
		return backTargetEmpty;
	}
	
	
}
