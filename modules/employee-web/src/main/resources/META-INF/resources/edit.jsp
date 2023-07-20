<%@ page import="com.lr.revisted.model.employee" %>
<%@ include file="/init.jsp" %>

<portlet:actionURL name="saveEmployee" var="saveEmployeeURL">

</portlet:actionURL>
<h1>Create/Edit Employee Details</h1>
<aui:form name="fm" action="${saveEmployeeURL}">

<aui:model-context bean="${employee}" model="<%= employee.class %>" />

<aui:input name="name"> </aui:input>
<aui:input name="phoneNumber"> </aui:input>
<aui:input name="email"> </aui:input>
<aui:input name="address"> </aui:input>

<aui:button-row>
    <aui:button cssClass="btn btn-primary" type="submit" />
</aui:button-row>

</aui:form>
