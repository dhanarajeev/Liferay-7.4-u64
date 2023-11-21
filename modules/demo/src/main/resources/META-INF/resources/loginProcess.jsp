<%@ include file="/init.jsp" %> <%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%
    String username = request.getParameter("email");
    String password = request.getParameter("password");

    Map<String, String> users = new HashMap<>();
    users.put("email1", "password1");
     users.put("email2", "password2");

        if (users.containsKey(username) && users.get(email).equals(password)) {
            // Authentication successful
            session.setAttribute("loggedInUser", username);
            response.sendRedirect("personalInformation.jsp");
        } else {
            // Authentication failed
            response.sendRedirect("view.jsp");
        }
    %>
