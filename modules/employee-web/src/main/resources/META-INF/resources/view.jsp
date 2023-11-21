<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<p>
	<b><liferay-ui:message key="employeecontroller.caption"/></b>

	Hi this is rajeev
</p>
<portlet:renderURL var="createEditRender">
<portlet:param name="mvcRenderCommandName" value="/create/edit"/>

</portlet:renderURL>

<a href="${createEditRender}" >Create Employee </a>



<liferay-ui:search-container delta="20" emptyResultsMessage="no-entries-were-found" total="${totalemployees}">
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
            <a href="${editRender}"class="edit-employee"><i class="fas fa-edit"></i> Edit </a>
      </liferay-ui:search-container-column-text>

 <liferay-ui:search-container-column-text name="Delete">
 <portlet:actionURL var="deleteURL">
 <portlet:param name="mvcActionCommandName" value="/deleteemployee" />
 <portlet:param name='employeeId' value='${employee.employeeId()}' />
 </portlet:actionURL>
 <a href="${deleteURL}"class="delete-employee"> <i class="fas fa-trash"></i>Delete</a>
  </liferay-ui:search-container-column-text>

   </liferay-ui:search-container-row>
   <liferay-ui:search-iterator />
 </liferay-ui:search-container>

<script>
    // Attach event handler to the Delete buttons
    var deleteButtons = document.querySelectorAll('.delete-employee');
    deleteButtons.forEach(function(button) {
        button.addEventListener('click', function(event) {
            event.preventDefault();
            if (confirm('Are you sure you want to delete this employee?')) {
                window.location.href = button.getAttribute('href');
            }
        });
    });
    var deleteButtons = document.querySelectorAll('.edit-employee');
        deleteButtons.forEach(function(button) {
            button.addEventListener('click', function(event) {
                event.preventDefault();
                if (confirm('Are you sure you want to edit this employee?')) {
                    window.location.href = button.getAttribute('href');
                }
            });
        });
</script>
