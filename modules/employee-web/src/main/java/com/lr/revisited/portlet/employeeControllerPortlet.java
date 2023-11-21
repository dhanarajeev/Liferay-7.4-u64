package com.lr.revisited.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeLocalServiceUtil;
import com.lr.revisted.service.employeeService;
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
		"javax.portlet.display-name=employeeController",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + employeeControllerPortletKeys.EMPLOYEECONTROLLER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class employeeControllerPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		System.out.println ( "EmployeeControllerPortlet.doView() -->" );

		int delta = ParamUtil.getInteger(renderRequest , "delta");
		int cur = ParamUtil.getInteger ( renderRequest , "cur" );
		int from= delta * (cur - 1 ) + 1;
		int to = delta == 0 ? 10 : delta * cur;

		renderRequest.setAttribute ( "totalemployees", _employeeService.getEmployeesCount () );
		renderRequest.setAttribute ( "entries", _employeeService.getEmployees ( 0,20 ) );

		super.doView ( renderRequest, renderResponse );
	}

//	employeeLocalServiceUtil.deleteemployee(employeeId);
	public void deleteemployee(ActionRequest actionRequest,
							   ActionResponse actionResponse) throws IOException, PortalException {
            employeeLocalServiceUtil.deleteemployee( ParamUtil.getLong( actionRequest,
																		"employeeId"));
        }


	/*public void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
		long employeeId = ParamUtil.getLong( actionRequest, "employeeId");
		employeeLocalServiceUtil.deleteemployee ( employeeId );

		actionResponse.setRenderParameter("mvcRenderCommandName", "/view");
	}
*/

/*public void deleteemployee(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
	long employeeId = ParamUtil.getLong ( actionRequest, "employeeId" );

        List.removeIf(employee -> employee.getEmployeeId() == employeeId);

        actionResponse.setRenderParameter("mvcRenderCommandName", "/view");
}

 */

	private employeeService _employeeService;

	@Reference(unbind = "-")
	protected void setemployeeService(employeeService employeeService)
	{
		_employeeService = employeeService;
	}


}
