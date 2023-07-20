<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<p>
	<b><liferay-ui:message key="employeecontroller.caption"/></b>

	Hi this is rajeev
</p>
<portlet:renderURL var="createEditRender">
<portlet:param name="mvcRenderCommandName" value="/create/edit"/>

</portlet:renderURL>

<a href="${createEditRender}" >Create Employee </a>



<liferay-ui:search-container delta="10" emptyResultsMessage="no-entries-were-found" total="${totalemployees}">
 <liferay-ui:search-container-results results="${entries}" />
 <liferay-ui:search-container-row
 className="com.lr.revisted.model.employee"
 keyProperty="employeeId" modelVar="entry" escapedModel="<%=true%>">
 <liferay-ui:search-container-column-text property="name" />
  <liferay-ui:search-container-column-text property="phoneNumber" />
  <liferay-ui:search-container-column-text property="email" />
   <liferay-ui:search-container-column-text property="address" />

     <liferay-ui:search-container-column-text name="Update">
     <portlet:renderURL var="editRender">
        <portlet:param name="mvcRenderCommandName" value="/create/edit"/>
        <portlet:param name="employeeId" value="${entry.employeeId}"/>
      </portlet:renderURL>
            <a href="${editRender}"> Edit </a>
      </liferay-ui:search-container-column-text>

 <liferay-ui:search-container-column-text name="Delete">
 <portlet:actionURL var="deleteAction">
 <portlet:param name='employeeId' value='${employee.getemployeeId()}' />
 </portlet:actionURL>
 <a href="${deleteAction}"> DeleteEmployee </a>
  </liferay-ui:search-container-column-text>

   </liferay-ui:search-container-row>
   <liferay-ui:search-iterator />
 </liferay-ui:search-container>

