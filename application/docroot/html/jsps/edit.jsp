<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.meera.dbservice.model.MobilePhone"%>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="com.meera.dbservice.service.MobilePhoneLocalServiceUtil"%>

<%
	
	ResourceBundle rb = ResourceBundle.getBundle("content.Language",Locale.getDefault());
	String newPhoneText = rb.getString("new-mobile-phone");
	String editPhoneText = rb.getString("edit-title");
	String releaseDateText = rb.getString("release-date");
	
	MobilePhone mobilePhone = null;
    long mobilePhoneId = ParamUtil.getLong(request, "mobilePhoneId");

    if (mobilePhoneId > 0) {
    	mobilePhone = MobilePhoneLocalServiceUtil.getMobilePhone(mobilePhoneId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= mobilePhone %>" model="<%= MobilePhone.class %>" />
<portlet:renderURL var="viewMobilePhoneURL" />

<portlet:actionURL name='<%= mobilePhone == null ? "addMobilePhone" : "updateMobilePhone" %>' 
                   var="editMobilePhoneURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewMobilePhoneURL %>"
    title='<%= (mobilePhone != null) ? editPhoneText + mobilePhone.getName() : newPhoneText %>'
/>

<aui:form action="<%= editMobilePhoneURL %>" method="POST" name="fm">
    
    <aui:fieldset>
    
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
        <aui:input name="mobilePhoneId" type="hidden" value='<%= mobilePhone == null ? "" : mobilePhone.getMobilePhoneId() %>'/>
        <aui:input name="name" />
        <aui:input name="description" />
        <aui:input name="brand" />
        <aui:input name="releaseDate" label="<%= releaseDateText %>" />
        <aui:input name="price" />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />
        <aui:button onClick="<%= viewMobilePhoneURL %>"  type="cancel" />
    </aui:button-row>
    
</aui:form>