package com.lr.revist.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.goldisannew.model.Store;
import com.lr.goldisannew.service.StoreLocalService;
import com.lr.revist.constants.LoginservletPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=PersonalInfo",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/store.jsp",
                "javax.portlet.name=" + LoginservletPortletKeys.STOREINFO,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)

public class StoreInfoPortlet extends MVCPortlet {

    private StoreLocalService storeLocalService;
    public StoreInfoPortlet (StoreLocalService StoreLocalService)
    {

        this.storeLocalService = storeLocalService;
    }
    public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException{
       long branchId = ParamUtil.getLong ( actionRequest, "branchId" );
       String branchName = ParamUtil.getString ( actionRequest, "branchName" );
       String address = ParamUtil.getString( actionRequest, "address");
       long contactNumber = ParamUtil.getLong (actionRequest, "contactNumber");

       Store store = storeLocalService.createStore ( 0);
       store.setBranchId ( branchId );
       store.setBranchName ( branchName );
       store.setAddress ( address );
       store.setContactNumber ( contactNumber );

       store = storeLocalService.addStore ( store );
       actionResponse.setRenderParameter ( "jspPage", "/store.jsp" );

   }


}
