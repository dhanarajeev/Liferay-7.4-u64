<%@ include file="/init.jsp" %> <%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />

 <portlet:renderURL var="registrationURL">
    <portlet:param name="mvcRenderCommandName" value="/registration.jsp" />
</portlet:renderURL>
 <portlet:actionURL var="processPersonalInfoURL">
<portlet:param name="processPersonalInfo" value="/registration.jsp" />
</portlet:actionURL>
<!DOCTYPE html>
<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>
    <h2>Welcome</h2>
    <form action="<%= processPersonalInfoURL.toString() %>" method="post">
      Username: <input type="text" name="Email" /><br />
      Password: <input type="password" name="Password" /><br />
     <a href="/forgot.jsp"> <input type="submit" value="Forgot Password?"></a>
      <input type="submit" value="Login" /><br>

      <input type="submit" name="action" value="New Registration" >
    </form>

    <hr />

    <p>Have no account yet? </p>
    <!-- <a href="/registration.jsp"> New Registration </a> -->
 <!-- <a href="<portlet:renderURL portletMode="view" windowState="normal" />/personal">New Registration</a> -->
 <!-- <a href="/registration.jsp"><input type="submit" value="Registration"></a> --> <br>
<!-- <a href="<%= renderResponse.encodeURL("/registration.jsp") %>" > Go to Registration </a> -->
<!-- <a href="<%= processPersonalInfoURL %>"> New Registration</a> -->
 <a href="<portlet:actionURL name='PersonalInfoPortlet' />"> New Registration </a>
  </body>
</html>
