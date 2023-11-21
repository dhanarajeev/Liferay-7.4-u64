package com.lr.goldisan.portlet;

import com.liferay.goldisan.model.Personal;
import com.liferay.goldisan.service.PersonalLocalServiceUtil;
import com.lr.goldisan.model.Company;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.lr.goldisan.service.CompanyLocalServiceUtil;
import com.lr.goldisan.constants.loginPortletKeys;
import com.lr.goldisannew.model.Store;
import com.lr.goldisannew.service.StoreLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

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
		"javax.portlet.display-name=login",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + loginPortletKeys.LOGIN,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class loginPortlet extends MVCPortlet {

	public void processPersonal(ActionRequest request, ActionResponse response)
			throws Exception {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailAddress = request.getParameter("emailAddress");
		long phoneNumber = Long.parseLong ( request.getParameter ( "phoneNumber" ) );
		String createPassword = request.getParameter ( "createPassword" );
		String conformPassword = request.getParameter("conformPassword");
		String address = request.getParameter ( "address" );



		Personal personal = PersonalLocalServiceUtil.createPersonal( firstName, lastName, emailAddress,
																  phoneNumber, createPassword, conformPassword, address);
		// Save personal data to the database (you need to implement this)
		//Registration registration = RegistrationLocalServiceUtil.addRegistration(firstName, lastName);

		// Redirect to the next step
		//sendRedirect ( request, response, "/company.jsp" );
		response.sendRedirect ( "/company.jsp" );
	}



	public void processCompany(ActionRequest request, ActionResponse response)
			throws Exception {
		String companyName = request.getParameter("companyName");
		long registrationId = Long.parseLong(request.getParameter("registrationId"));
		String email = request.getParameter ( "email" );
		long taxId = Long.parseLong(request.getParameter ( "taxId" ));
		long phoneNumber = Long.parseLong(request.getParameter ( "phoneNumber" ));
		long gst = Long.parseLong ( request.getParameter ( "gst" ) );
		String address = request.getParameter ( "address" );

		Company company = CompanyLocalServiceUtil.addCompany (companyName, registrationId, email, taxId, phoneNumber, gst, address );
		//sendRedirect ( request, response, "/store.jsp");
		response.sendRedirect ( "/store.jsp" );

		// Redirect to the next step
		//sendRedirect(request, response, "/store.jsp");
	}

	public void processStore(ActionRequest request, ActionResponse response)
			throws Exception {
		long branchId = Long.parseLong ( request.getParameter ("branchId") );
		String branchName = request.getParameter("branchName");
		String address = request.getParameter ( "address" );
		long contactNumber = Long.parseLong ( request.getParameter ( "contactNumber" ) );

		// Update the previously saved registration with store data (you need to implement this)

		Store store = StoreLocalServiceUtil.addStore ( branchId, branchName, address, contactNumber );

		///RegistrationLocalServiceUtil.updateRegistration(registration);
		response.sendRedirect ( "/view.jsp" );
		// Redirect to the thank you page (view.jsp)
		//sendRedirect(request, response, "/view.jsp");
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException, IOException {
		// You can handle rendering logic here if needed
		super.render(renderRequest, renderResponse);
	}
}
