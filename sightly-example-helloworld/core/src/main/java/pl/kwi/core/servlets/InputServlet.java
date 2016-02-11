package pl.kwi.core.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

@Component(immediate=true, metatype=false, label="INPUT SERVLET")
@Service
@Properties(value = {
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.methods", value={"POST"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.resourceTypes", value={"sling/servlet/default"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.selectors", value={"INPUT"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.extensions", value={"html"})
})
public class InputServlet extends SlingAllMethodsServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("---HERE");
		
//		String errorMessage = getErrorMessage(request);
//		if(errorMessage != null) {
//			String currentPagePath = request.getParameter("currentPagePath");
//			String path = request.getResourceResolver().map(currentPagePath);
//			response.sendRedirect(path + ".html" + errorMessage);
//			return;
//		}
//		
//		String path = null;
//		
//		try {
//			
//			String submitTarget = request.getParameter("submitTarget");
//			path = request.getResourceResolver().map(submitTarget) + ".html";
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//		
//		String name = request.getParameter("name");
//		response.sendRedirect(path + "?name=" + name);
		
	}
	
	/**
	 * Method gets error field name.
	 * 
	 * @param request object SlingHttpServletRequest with request from browser
	 * @return object String with error field name
	 */
	protected static String getErrorMessage(SlingHttpServletRequest request) {
				
		StringBuilder sb = new StringBuilder();		
		
		String name = request.getParameter("name");
		// TODO
		//if(StringUtils.isBlank(name)) {
		if (name == null || "".equals(name)) {	
			sb.append("?errorField=name");
			return sb.toString();
		}
		
		return null;
		
	}

}
