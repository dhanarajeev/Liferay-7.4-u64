<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/init.jsp" %>
<portlet:defineObjects />

<%
    boolean editMode = ParamUtil.getBoolean(request, "editMode", false);
    employee employee = null;

    if (editMode) {
        long employeeId = ParamUtil.getLong(request, "employeeId");
        employee = employeeLocalServiceUtil.getemployee(employeeId);
    }
%>

<h1><%= editMode ? "Edit Employee" : "Add Employee" %></h1>
<form action="<portlet:actionURL />" method="post">
    <input type="hidden" name="editMode" value="<%= editMode %>" />
    <% if (editMode) { %>
        <input type="hidden" name="employeeId" value="<%= employee.getEmployeeById() %>" />
    <% } %>

     Name: <input type="text" name="name" value="<%= editMode ? HtmlUtil.escapeAttribute(employee.getName() : "" %>" /><br>
     PhoneNumber: <input type="number" name="phoneNumber" value="<%= editMode ? HtmlUtil.escapeAttribute(employee.getPhoneNumber()) : "" %>" /><br>
     Email: <input type="text" name="email" value="<%= editMode ? HtmlUtil.escapeAttribute(employee.getEmail()) : "" %>" /><br>
      Address: <input type="text" name="address" value="<%= editMode ? HtmlUtil.escapeAttribute(employee.getAddress()) : "" %>" /><br>
    <input type="submit" value="<%= editMode ? "Update Employee" : "Add Employee" %>" />
</form>
