package com.lr.revisited.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + employeeControllerPortletKeys.EMPLOYEECONTROLLER,
                "mvc.command.name=/create/edit"
        }
)
public class CreateEditRenderMvcCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
      /*  long employeeId = ParamUtil.getLong(renderRequest, "employeeId");
        String name = ParamUtil.getString ( renderRequest, "name");
        long phoneNumber = ParamUtil.getLong(renderRequest, "phoneNumber");
        String email = ParamUtil.getString ( renderRequest, "email" );
        String address = ParamUtil.getString ( renderRequest, "address" );

        employee employee = employeeLocalServiceUtil.updateemployee (employeeId, name, phoneNumber, email, address );

        SessionMessages.add(renderRequest, "employeeUpdated");
        renderResponse.setProperty("mvcRenderCommandName", "/create/edit");
        return null;
    }
*/
        long employeeId = ParamUtil.getLong ( renderRequest, "employeeId", 0 );

        if(employeeId > 0){
            try {
                renderRequest.setAttribute ("employee", _employeeService.getEmployeeById ( employeeId ));
            } catch (PortalException e) {
                e.printStackTrace ();
            }

        }

        return "/edit.jsp";
    }
/*
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException
    {
    boolean editMode = Boolean.parseBoolean(renderRequest.getParameter("editMode"));

    if(editMode)
    {
    long employeeId = Long.parseLong(renderRequest.getParameter("employeeId"));
        employee employee = null;
        try {
            employee = employeeLocalServiceUtil.getemployee( employeeId);
        } catch (PortalException e) {
            throw new RuntimeException ( e );
        }

        renderRequest.setAttribute("employee", employee);
        }
    return "/create_edit.jsp";
    }
*/
    private employeeService _employeeService;

    @Reference(unbind = "-")
    protected void setemployeeService(employeeService employeeService) {
        _employeeService = employeeService;
    }
}
