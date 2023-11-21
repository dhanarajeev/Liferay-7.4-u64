package com.lr.revisited.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + employeeControllerPortletKeys.EMPLOYEECONTROLLER,
                "mvc.command.name=/deleteemployee"
        },
        service = MVCActionCommand.class
)
public class DeleteEmployeeActionCommand implements MVCActionCommand {

    /* @Reference
     private employeeLocalService employeeLocalService;

     */
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        long employeeId = ParamUtil.getLong ( actionRequest, "employeeId" );
/*
        try {
            employeeLocalServiceUtil.deleteemployee ( employeeId );
            SessionMessages.add ( actionRequest, "employeeDeleted" );
        } catch (Exception e) {
            SessionErrors.add ( actionRequest, "errorDeletingEmployee" );
        }
        actionResponse.setRenderParameter ( "mvcRenderCommandName", "/create/edit" );
        return true;
    }
 */

    try{
        _employeeService.deleteemployee ( employeeId );
    }
    catch(PortalException e)
    {
        throw new PortletException ( e );
    }
    actionResponse.setRenderParameter ( "mvcRenderCommandName", "/create/edit" );
        System.out.println("Deleteemployee");
        return true;
    }

    private employeeService _employeeService;

    @Reference(unbind = "-")
    protected void setemployeeService(employeeService employeeService)
    {
        _employeeService = employeeService;
    }



}
