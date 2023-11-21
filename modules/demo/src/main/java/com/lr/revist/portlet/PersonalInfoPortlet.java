package com.lr.revist.portlet;

import com.liferay.goldisan.service.PersonalLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.revist.constants.LoginservletPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=PersonalInfo",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/registration.jsp",
                "javax.portlet.name=" + LoginservletPortletKeys.PERSONALINFO,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class PersonalInfoPortlet extends MVCPortlet {
        @Reference
    private PersonalLocalService personalLocalService;


    public PersonalInfoPortlet(PersonalLocalService personalLocalService)
        {
                this.personalLocalService = personalLocalService;
        }
        public void processPersonalInfo(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
                String firstName = ParamUtil.getString( actionRequest, "firstName");
                String lastName = ParamUtil.getString ( actionRequest, "lastName" );
                String emailAddress = ParamUtil.getString ( actionRequest, "emailAddress" );
                Long phoneNumber = ParamUtil.getLong ( actionRequest, "phoneNumber" );
                String createPassword = ParamUtil.getString ( actionRequest,"createPassword" );
                String conformPassword = ParamUtil.getString ( actionRequest, "conformPassword" );
                String address = ParamUtil.getString ( actionRequest, "address");

            actionRequest.getPortletSession ().setAttribute ( "firstName", firstName );
            actionRequest.getPortletSession ().setAttribute ( "lastName", lastName );
           actionRequest.getPortletSession ().setAttribute ( "emailAddress", emailAddress );
           actionRequest.getPortletSession ().setAttribute ( "phoneNumber", phoneNumber );
         actionRequest.getPortletSession ().setAttribute ( "createPassword", createPassword );
            actionRequest.getPortletSession ().setAttribute ( "conformPassword", conformPassword );
           actionRequest.getPortletSession ().setAttribute ( "address", address );

            actionResponse.setRenderParameter("mvcPath", "/company.jsp");

               /* Personal personal = personalLocalService.createPersonal ( 0 );
                personal.setFirstName(firstName);
                personal.setLastName(lastName);
                personal.setEmailAddress ( emailAddress );
                personal.setPhoneNumber ( phoneNumber );
                personal.setCreatePassword ( createPassword );
                personal.setConformPassword ( conformPassword );
                personal.setAddress ( address );

                personal = personalLocalService.addPersonal ( personal );

                actionResponse.setRenderParameter ( "jspPage", "/company.jsp" );

                */
        }

}

