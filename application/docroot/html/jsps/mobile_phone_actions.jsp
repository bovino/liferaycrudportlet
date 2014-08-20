<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.meera.dbservice.model.MobilePhone"%>

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	MobilePhone mobilePhone = (MobilePhone) row.getObject();
    String name = MobilePhone.class.getName();
    long mobilePhoneId = mobilePhone.getMobilePhoneId();
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
    
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/jsps/edit.jsp" />
        <portlet:param name="mobilePhoneId" value="<%= String.valueOf(mobilePhoneId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteMobilePhone" var="deleteURL">
        <portlet:param name="mobilePhoneId" value="<%= String.valueOf(mobilePhoneId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
    
</liferay-ui:icon-menu>