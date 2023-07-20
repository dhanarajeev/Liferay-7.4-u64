package com.lr.revisited.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeLocalServiceUtil;
import com.lr.revisted.service.employeeService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;

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
    public void deleteemployee(ActionRequest actionRequest,
                               ActionResponse actionResponse) throws IOException, PortalException {
        employeeLocalServiceUtil.deleteemployee( ParamUtil.getLong( actionRequest,
                                                                    "employeeId"));
    }
    private employeeService _employeeService;

    @Reference(unbind = "-")
    protected void setemployeeService(employeeService employeeService) {
        _employeeService = employeeService;
    }
}
