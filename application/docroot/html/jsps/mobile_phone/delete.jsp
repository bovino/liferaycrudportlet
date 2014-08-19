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
<portlet:actionURL var="deleteMobilePhoneActionURL" windowState="normal" name="deleteMobilePhone">
</portlet:actionURL>

<portlet:actionURL var="getMobilePhoneActionURL" windowState="normal" name="getMobilePhone">
<portlet:param name="cmd" value="DELETE"/>
</portlet:actionURL>

<h2>Delete Mobile Phone</h2>
<a href="<%=homeURL.toString() %>">Home</a><br/><br/>

<% if(SessionMessages.contains(renderRequest.getPortletSession(),"mobilePhone-delete-success")){%>
<liferay-ui:success key="mobilephone-delete-success" message="Selected MobilePhone information have been deleted successfully." />
<%} %>

<% if(SessionErrors.contains(renderRequest.getPortletSession(),"mobilePhone-delete-error")){%>
<liferay-ui:error key="mobilephone-delete-error" message="There is an Error occured while deleting mobilephone please try again" />
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

ID: <%=selecteMobilePhoneObject.getPrimaryKey()%><br/>
Name:<%=selecteMobilePhoneObject.getName()%><br/>
Brand:<%=selecteMobilePhoneObject.getBrand()%><br/>
Description: <%=selecteMobilePhoneObject.getDescription() %><br/>
Release Date: <%=selecteMobilePhoneObject.getReleaseDate()%><br/>
Price: <%=selecteMobilePhoneObject.getPrice()%><br/>

<input type="button" name="deleteMobilePhone" id="deleteMobilePhone" 
       value="Delete MobilePhone" 
       onclick="deleteMobilePhoneRecord();"/>

<%}%>
</form>

<script>
function submitform(selectedValue)
{
  if(selectedValue!="-1"){
	  document.mobilephoneForm.submit();  
  }
	
}
function deleteMobilePhoneRecord()
{ 
	document.mobilephoneForm.action="<%=deleteMobilePhoneActionURL.toString()%>"
    document.mobilephoneForm.submit();
}
</script>