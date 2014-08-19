<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.meera.dbservice.service.MobilePhoneLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.meera.dbservice.model.MobilePhone"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="homeURL"></portlet:renderURL>

<portlet:actionURL var="updateMobilePhoneActionURL" windowState="normal" name="updateMobilePhone">
</portlet:actionURL>

<portlet:actionURL var="getMobilePhoneActionURL" windowState="normal" name="getMobilePhone">

<portlet:param name="cmd" value="UPDATE"/>
</portlet:actionURL>

<h2>Update Mobile Phone</h2>

<a href="<%=homeURL.toString() %>">Home</a><br/><br/>

<% if(SessionMessages.contains(renderRequest.getPortletSession(),"mobilePhone-update-success")){%>
<liferay-ui:success key="mobilephone-update-success" message="Selected MobilePhone information have been updated successfully." />
<%} %>

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"mobilePhone-update-error")){%>
<liferay-ui:error key="mobilephone-update-error" message="There is an Error occured while updating mobilephone please try again" />
<%} %>

<%
List<MobilePhone> mobilephoneList=MobilePhoneLocalServiceUtil.getMobilePhones(0,MobilePhoneLocalServiceUtil.getMobilePhonesCount());
MobilePhone selecteMobilePhoneObject=(MobilePhone)renderRequest.getAttribute("mobilePhoneObject");
%>
<form action="<%=getMobilePhoneActionURL.toString()%>" name="mobilephoneForm"  method="POST">

<b>Select Mobile Phone ID</b><br>

<select name="<portlet:namespace/>mobilePhoneId" onchange="submitform(this.value);">
<option value="-1">--select--</option>
<%for(MobilePhone mobilephone:mobilephoneList){%>
  <option value="<%=mobilephone.getMobilePhoneId()%>" <%=selecteMobilePhoneObject!=null&&selecteMobilePhoneObject.getMobilePhoneId()==mobilephone.getMobilePhoneId()?"selected":""%>>
  <%=mobilephone.getMobilePhoneId()%> - <%=mobilephone.getName()%> 
  </option>
  <%} %>
</select><br>

<%if(selecteMobilePhoneObject!=null){%>

<b>Name</b><br/>
<input  type="text" name="<portlet:namespace/>name" id="<portlet:namespace/>name" 
value="<%=selecteMobilePhoneObject.getName()%>"/><br/>

<b>Brand</b><br/>
<input type="text" name="<portlet:namespace/>brand" id="<portlet:namespace/>brand" 
value="<%=selecteMobilePhoneObject.getBrand()%>"/><br/>

<b>Release Date</b><br/>
<input type="text" name="<portlet:namespace/>releaseDate" id="<portlet:namespace/>releaseDate" 
value="<%=selecteMobilePhoneObject.getReleaseDate()%>"/><br/>

<b>Price</b><br/>
<input type="text" name="<portlet:namespace/>price" id="<portlet:namespace/>price" 
value="<%=selecteMobilePhoneObject.getPrice()%>"/><br/>

<b>Description</b><br/>
<textarea rows="4" cols="50" name="<portlet:namespace/>description">
<%=selecteMobilePhoneObject.getDescription()%>
</textarea><br/>

<input type="button" name="updateMobilePhone" 
       id="updateMobilePhone" 
       value="Update Mobile Phone" 
       onclick="updateMobilePhoneRecord();"/>

<%}%>
</form>

<script>
function submitform(selectedValue)
{
  if(selectedValue!="-1"){
	  document.mobilephoneForm.submit();  
  }
	
}
function updateMobilePhoneRecord()
{ 
	document.mobilephoneForm.action="<%=updateMobilePhoneActionURL.toString()%>"
    document.mobilephoneForm.submit();
}
</script>