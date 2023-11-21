package com.lr.revist.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.lr.revist.constants.LoginservletPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.*;
import java.io.IOException;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Loginservlet",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + LoginservletPortletKeys.NAVIGATIONINFO,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class NavigationPortlet extends MVCPortlet {
        public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
                super.render(renderRequest, renderResponse);
        }

      /*  public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException{
                String action = actionRequest.getParameter("action");

                if("goto_PersonalInfo".equals(action))
                {
                        actionResponse.setRenderParameter ( "jspPage", "/registration.jsp" );
                }
                else if("goto_CompanyInfo".equals(action))
                {
                        actionResponse.setRenderParameter ( "jspPage", "/company.jsp" );
                }
                else if("goto_StoreInfo".equals ( action ))
                {
                        actionResponse.setRenderParameter ( "jspPage", "/store.jsp" );
                }
                else
                {
                        super.processAction ( actionRequest, actionResponse );
                }
        }*/
      @ProcessAction(name = "PersonalInfoPortlet")
      public void PersonalInfoPortlet (ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
              actionResponse.sendRedirect ( "/registration.jsp" );


      }
}
