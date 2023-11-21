<%@ include file="/init.jsp" %>

<liferay-portlet:renderURL var="personalURL">
    <portlet:param name="mvcRenderCommandName" value="/your-portlet-name/processPersonal" />
</liferay-portlet:renderURL>

<a href="<%= personalURL %>">New Registration</a>


