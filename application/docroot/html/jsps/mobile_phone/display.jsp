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

<portlet:actionURL var="getMobilePhoneActionURL" windowState="normal" name="getMobilePhone">
<portlet:param name="cmd" value="VIEW"/>
</portlet:actionURL>

<h2>Display Mobile Phone Details</h2>

<a href="<%=homeURL.toString() %>">Home</a><br/><br/>

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

	<h3>The following are the selected Mobile Phone Information</h3><br/>
	ID: <%=selecteMobilePhoneObject.getPrimaryKey() %><br/>
	Name:<%=selecteMobilePhoneObject.getName() %><br/>
	Brand:<%=selecteMobilePhoneObject.getBrand() %><br/>
	Description: <%=selecteMobilePhoneObject.getDescription() %><br/>
	Release Date: <%=selecteMobilePhoneObject.getReleaseDate()%><br/>
	Price: <%=selecteMobilePhoneObject.getPrice()%><br/>
<%}%>

</form>

<script>
function submitform(selectedValue)
{
  if(selectedValue!="-1"){
	  document.mobilephoneForm.submit();  
  }
	
}
</script>