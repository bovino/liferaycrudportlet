<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.meera.dbservice.model.MobilePhone"%>
<%@ page import="com.meera.dbservice.service.MobilePhoneLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%!
com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<h1>Liferay Mobile Phone CRUD Operations</h1>
<b> Listing Mobile Phones</b><br/>

<% String redirect = PortalUtil.getCurrentURL(renderRequest); %>

<aui:button-row>

    <portlet:renderURL var="addMobilePhoneURL">
        <portlet:param name="mvcPath" value="/html/jsps/mobile_phone/edit.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addMobilePhoneURL.toString() %>" value="add-location" />

</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="There are no mobile phones to display">
    <liferay-ui:search-container-results
        results="<%= MobilePhoneLocalServiceUtil.getMobilePhones(searchContainer.getStart(), searchContainer.getEnd()) %>"
        total="<%= MobilePhoneLocalServiceUtil.getMobilePhonesCount() %>"
    />

    <liferay-ui:search-container-row
        className="com.meera.dbservice.model.MobilePhone"
        keyProperty="mobilePhoneId"
        modelVar="mobilePhone" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="name"
            value="<%= mobilePhone.getName() %>"
        />

        <liferay-ui:search-container-column-text
            name="description"
            value="<%= mobilePhone.getDescription() %>"
        />

        <liferay-ui:search-container-column-text
            name="brand"
            value="<%= mobilePhone.getBrand() %>"
        />

        <liferay-ui:search-container-column-date
            name="releaseDate"
            value="<%= mobilePhone.getReleaseDate() %>"
        />
        
        <liferay-ui:search-container-column-jsp
		    align="right"
		    path="/html/jsps/mobile_phone_actions.jsp"
		/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
    
</liferay-ui:search-container>