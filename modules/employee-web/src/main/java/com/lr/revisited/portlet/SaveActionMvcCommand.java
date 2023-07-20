package com.lr.revisited.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revisited.constants.employeeControllerPortletKeys;
import com.lr.revisted.service.employeeService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + employeeControllerPortletKeys.EMPLOYEECONTROLLER,
                "mvc.command.name=saveEmployee"
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

   private employeeService _employeeService;

    @Reference(unbind = "-")
    protected void setemployeeService(employeeService employeeService)
    {
        _employeeService = employeeService;
    }
}
