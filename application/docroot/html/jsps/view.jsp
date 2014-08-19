<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<h1>Liferay Mobile Phone CRUD Operations</h1>

<portlet:renderURL var="addMobilePhone">
<portlet:param name="mvcPath" value="/html/jsps/mobile_phone/add.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="updateMobilePhone">
<portlet:param name="mvcPath" value="/html/jsps/mobile_phone/edit.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="dislayMobilePhone">
<portlet:param name="mvcPath" value="/html/jsps/mobile_phone/display.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="deleteMobilePhone">
<portlet:param name="mvcPath" value="/html/jsps/mobile_phone/delete.jsp"/>
</portlet:renderURL>

<br/>

<a href="<%=addMobilePhone.toString()%>">Add Mobile Phone</a><br/>
<a href="<%=updateMobilePhone.toString()%>">Update Mobile Phone</a><br/>
<a href="<%=deleteMobilePhone.toString()%>">Delete Mobile Phone</a><br/>
<a href="<%=dislayMobilePhone.toString()%>">Display Mobile Phone Details</a><br/>
