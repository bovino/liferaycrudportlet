<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portlet.calendar.model.CalEvent"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="homeURL"></portlet:renderURL>

<portlet:actionURL var="addMobilePhoneActionURL" windowState="normal" name="addMobilePhone">
</portlet:actionURL>

<% if(SessionMessages.contains(renderRequest.getPortletSession(),"mobilePhone-add-success")){%>
<liferay-ui:success key="mobilephone-add-success" message="MobilePhone information have been added successfully." />
<%} %>

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"mobilePhone-add-error")){%>
<liferay-ui:error key="mobilephone-add-error" message="There is an Error occured while adding mobilephone please try again" />
<%} %>

<h2>Add Mobile Phone</h2>
<a href="<%=homeURL.toString() %>">Home</a><br/><br/>

<form action="<%=addMobilePhoneActionURL%>" name="mobilephoneForm"  method="POST">

<b>Name</b><br/>
<input  type="text" name="<portlet:namespace/>name" id="<portlet:namespace/>name"/><br/>

<b>Brand</b><br/>
<input type="text" name="<portlet:namespace/>brand" id="<portlet:namespace/>brand"/><br/>

<b>Release Date</b><br/>
<liferay-ui:input-field model="<%= CalEvent.class %>"   
           field="<portlet:namespace/>releaseDate" 
           id="<portlet:namespace/>releaseDate" /><br/>

<b>Price</b><br/>
<input type="text" name="<portlet:namespace/>price" id="<portlet:namespace/>price"/><br/>

<b>Description</b><br/>
<textarea rows="4" cols="50" name="<portlet:namespace/>description">
</textarea><br/>

<input type="submit" name="addMobilePhone" id="addMobilePhone" value="Add MobilePhone"/>
</form>