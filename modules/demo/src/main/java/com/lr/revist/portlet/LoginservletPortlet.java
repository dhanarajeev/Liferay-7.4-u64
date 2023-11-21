package com.lr.revist.portlet;

import com.liferay.goldisan.model.Personal;
import com.liferay.goldisan.service.PersonalLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.lr.goldisan.model.Company;
import com.lr.goldisan.service.CompanyLocalService;
import com.lr.goldisannew.model.Store;
import com.lr.goldisannew.service.StoreLocalService;
import com.lr.revist.constants.LoginservletPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;

/**
 * @author Arrays-Lp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Loginservlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LoginservletPortletKeys.LOGINSERVLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LoginservletPortlet extends MVCPortlet  {

	@Reference
	private PersonalLocalService personalLocalService;
	@Reference
	private CompanyLocalService companyLocalService;
	@Reference
	private StoreLocalService storeLocalService;
/*
	private String determineNextJSP(ActionRequest actionRequest) {
		// Retrieve the current step from a session attribute or request parameter
		String currentStep = (String) actionRequest.getPortletSession().getAttribute("currentStep");

		// Default to the first step (view.jsp) if no step is set
		if (currentStep == null) {
			return "view.jsp";
		}

		// Determine the next step based on the current step
		if ("view.jsp".equals(currentStep)) {
			// User is on the initial view.jsp page, so go to personal.jsp
			return "registration.jsp";
		} else if ("registration.jsp".equals(currentStep)) {
			// User is on the personal.jsp page, so go to company.jsp
			return "company.jsp";
		} else if ("company.jsp".equals(currentStep)) {
			// User is on the company.jsp page, so go to store.jsp
			return "store.jsp";
		} else if ("store.jsp".equals(currentStep)) {
			// User is on the store.jsp page, so go to success.jsp
			return "success.jsp";
		} else {
			// Default to view.jsp if an unknown step is encountered
			return "view.jsp";
		}
	}
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		String action = ParamUtil.getString( actionRequest, "action");

		if ("Next".equals(action)) {
			// Determine the next step
			String nextJSP = determineNextJSP(actionRequest);

			// Set the next step as the current step
			actionRequest.getPortletSession().setAttribute("currentStep", nextJSP);

			// Set the next JSP as a render parameter
			actionResponse.setRenderParameter("jspPage", nextJSP);
		}
	}
*/

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		String action = actionRequest.getParameter ( "action" );
		if ("submitPersonalInfo".equals ( action )){
			handlePersonalSubmission(actionRequest, actionResponse);
		}
		else if ("submitCompany".equals ( action ))
		{
			handleCompanySubmission(actionRequest, actionResponse);
		}
		else if ("submitStore".equals ( action ))
		{
			handleStoreSubmission(actionRequest, actionResponse);
		}
	}

	private void handleStoreSubmission(ActionRequest actionRequest, ActionResponse actionResponse) {
		long branchId = Long.parseLong ( actionRequest.getParameter ( "branchId" ) );
		String branchName = actionRequest.getParameter ( "branchName" );
		String address = actionRequest.getParameter ( "address" );
		String contactNumber = actionRequest.getParameter ( "contactNumber" );

		Store store = storeLocalService.addStore ( branchId, branchName, address, Long.parseLong ( contactNumber ) );
		actionRequest.setAttribute ( "storeId", store.getStoreId () );
		actionResponse.setRenderParameter ( "jspPage", "/store.jsp" );
	}

	private void handleCompanySubmission(ActionRequest actionRequest, ActionResponse actionResponse) {
		String companyName = actionRequest.getParameter ( "companyName" );
		long registrationId = Long.parseLong ( actionRequest.getParameter ( "registrationId" ) );
		String email = actionRequest.getParameter ("email");
		long taxId = Long.parseLong ( actionRequest.getParameter ( "taxId" ) );
		long phoneNumber = Long.parseLong ( actionRequest.getParameter ( "phoneNumber" ) );
		long gst = Long.parseLong ( actionRequest.getParameter ( "gst" ) );
		String address = actionRequest.getParameter ( "address" );


		Company company = companyLocalService.addCompany ( companyName, registrationId, email, taxId, phoneNumber, gst, address);
		actionRequest.setAttribute ( "companyId", company.getCompanyId() );
		actionResponse.setRenderParameter ( "jspPage","/company.jsp" );
	}


	private void handlePersonalSubmission(ActionRequest actionRequest, ActionResponse actionResponse) {
		String firstName = actionRequest.getParameter ( "firstName" );
		String lastName = actionRequest.getParameter ( "lastName" );
		String emailAddress = actionRequest.getParameter ( "email" );
		long phoneNumber = Long.parseLong ( actionRequest.getParameter ( "phoneNumber" ) );
		String createPassword = actionRequest.getParameter("createPassword");
		String confirmPassword = actionRequest.getParameter("confirmPassword");
		String address = actionRequest.getParameter("address");

		Personal personal = personalLocalService.addPersonal ( firstName, lastName, emailAddress, phoneNumber, createPassword, confirmPassword, address );

		actionRequest.setAttribute ( "personalId", personal.getPersonId () );
		actionResponse.setRenderParameter ( "jspPage", "/company.jsp" );
	}
	@Override
public void doView (RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException
{
	/*String jspPage = renderRequest.getParameter ( "jspPage" );
	if(jspPage == null)
	{
		jspPage = "/registration.jsp";
	}
	include(jspPage, renderRequest, renderResponse);*/
	System.out.println("this server is running");
	super.doView ( renderRequest, renderResponse );

}


	@ProcessAction(name = "PersonalInfoPortlet")
	public void PersonalInfoPortlet (ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		actionResponse.setRenderParameter ( "mvcRenderCommandName" +
													"","/registration.jsp" );
	}
	@ProcessAction ( name = "CompanyInfoPortlet" )
	public void CompanyInfoPortlet (ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException{
		actionResponse.sendRedirect ( "/company.jsp" );
	}

	@ProcessAction ( name = "StoreInfoPortlet" )
	public void StoreInfoPortlet ( ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException{
		actionResponse.sendRedirect ( "/store.jsp" );
	}
}

























