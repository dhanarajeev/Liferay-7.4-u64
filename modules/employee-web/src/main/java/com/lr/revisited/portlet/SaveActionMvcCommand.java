package com.lr.revisited.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeLocalServiceUtil;
import com.lr.revisted.service.employeeService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.io.IOException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + employeeControllerPortletKeys.EMPLOYEECONTROLLER,
                "mvc.command.name=saveEmployee",
                "mvc.command.name=/deleteemployee"
        },
        service = MVCActionCommand.class)
public class SaveActionMvcCommand extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

       String name = ParamUtil.get( actionRequest, "name", "");
       long phoneNumber = Long.parseLong ( ParamUtil.get( actionRequest, "phoneNumber", "") );
       String email = ParamUtil.get( actionRequest, "email", "");
        String address = ParamUtil.get( actionRequest, "address", "");

        System.out.println ( name + "-" + phoneNumber + "-" + email + "-" + address );

        _employeeService.addemployee ( name , phoneNumber , email , address );
        System.out.println( "SaveActionMvcCommand.doProcessAction()" );
    }
/*

        String action = ParamUtil.getString ( actionRequest, "action" );
        if ("edit".equals ( action )) {
            return handleEditemployee ( actionRequest, actionResponse );
        } else {
            return handleAddemployee ( actionRequest, actionResponse );
        }
    }

    private boolean handleAddemployee(ActionRequest actionRequest, ActionResponse actionResponse) {
        String name = ParamUtil.get( actionRequest, "name", "");
        long phoneNumber = Long.parseLong ( ParamUtil.get( actionRequest, "phoneNumber", "") );
        String email = ParamUtil.get( actionRequest, "email", "");
        String address = ParamUtil.get( actionRequest, "address", "");

        employeeLocalServiceUtil.addemployee ( name,phoneNumber,email,address );
        SessionMessages.add ( actionRequest, "employeeAdded" );
        actionResponse.setRenderParameter ( "mvcRenderCommandName", "/view" );
        return true;
    }

    private boolean handleEditemployee(ActionRequest actionRequest, ActionResponse actionResponse) {
        String name = ParamUtil.get( actionRequest, "name", "");
        long phoneNumber = Long.parseLong ( ParamUtil.get( actionRequest, "phoneNumber", "") );
        String email = ParamUtil.get( actionRequest, "email", "");
        String address = ParamUtil.get( actionRequest, "address", "");

        employeeLocalServiceUtil.updateemployee ( name,phoneNumber,email,address );
        SessionMessages.add ( actionRequest, "employeeUpdated" );
        actionResponse.setRenderParameter ( "mvcRenderCommandName", "/view" );
        return true;
    }

     public void deleteemployee(ActionRequest actionRequest,
                                ActionResponse actionResponse) throws AMRuntimeException.IOException, PortalException {
         employeeLocalServiceUtil.deleteemployee( ParamUtil.getLong( actionRequest, "employeeId"));
         actionResponse.setRenderParameter("mvcRenderCommandName", "/view");
     }

     */
 public void deleteemployee(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
       // long employeeId = ParamUtil.getLong( actionRequest, "employeeId");
     long employeeId = Long.parseLong(actionRequest.getParameter("employeeId"));
        employeeLocalServiceUtil.deleteemployee ( employeeId );

        actionResponse.setRenderParameter("mvcActionCommandName", "delete");
        System.out.println("Deleteemployee");
    }

   private employeeService _employeeService;

    @Reference(unbind = "-")
    protected void setemployeeService(employeeService employeeService)
    {
        _employeeService = employeeService;
    }
}
