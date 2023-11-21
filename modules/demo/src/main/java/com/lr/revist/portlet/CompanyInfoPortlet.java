package com.lr.revist.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revist.constants.LoginservletPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

@Component
        (
                immediate = true,
                property = {
                        "com.liferay.portlet.display-category=category.sample",
                        "com.liferay.portlet.header-portlet-css=/css/main.css",
                        "com.liferay.portlet.instanceable=true",
                        "javax.portlet.display-name=PersonalInfo",
                        "javax.portlet.init-param.template-path=/",
                        "javax.portlet.init-param.view-template=/company.jsp",
                        "javax.portlet.name=" + LoginservletPortletKeys.COMPANYINFO,
                        "javax.portlet.resource-bundle=content.Language",
                        "javax.portlet.security-role-ref=power-user,user"
                },
                service = Portlet.class
        )
public class CompanyInfoPortlet extends MVCPortlet {
    @Reference
    private CompanyLocalService companyLocalService;
    public CompanyInfoPortlet(CompanyLocalService companyLocalService) {
        this.companyLocalService = companyLocalService;
    }
   public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) {
        String companyName = ParamUtil.getString ( actionRequest, "companyName");
        long registrationId = ParamUtil.getLong ( actionRequest, "registrationId" );
        String email = ParamUtil.getString ( actionRequest, "email" );
        long taxId = ParamUtil.getLong ( actionRequest, "taxId" );
        long phoneNumber = ParamUtil.getLong ( actionRequest, "phoneNumber" );
        long gst = ParamUtil.getLong ( actionRequest, "gst" );
        String address = ParamUtil.getString ( actionRequest, "address" );

      /* Company company = (Company) companyLocalService.createCompany ( 1 );
       company.setCompanyName (companyName);
       company.setRegistrationId ( registrationId );
       company.setEmail ( email );
       company.setTaxId ( taxId );
       company.setPhoneNumber ( phoneNumber );
       company.setGst ( gst );
       company.setAddress ( address );



       actionResponse.setRenderParameter ( "jspPage", "/store.jsp" );
*/

   }

    public CompanyLocalService getCompanyLocalService() {
        return companyLocalService;
    }
}
