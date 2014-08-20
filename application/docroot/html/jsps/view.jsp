<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="com.meera.dbservice.model.MobilePhone"%>
<%@ page import="com.meera.dbservice.service.MobilePhoneLocalServiceUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%!
com.liferay.portal.kernel.dao.search.SearchContainer<MobilePhone> searchContainer = null;
%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<% 
String redirect = PortalUtil.getCurrentURL(renderRequest); 
ResourceBundle rb = ResourceBundle.getBundle("content.Language",Locale.getDefault());
String addText = rb.getString("add-new-mobile-phone");
String listTitleText = rb.getString("list-title");
String titleText = rb.getString("portlet-title");
String emptyListText = rb.getString("empty-list");

String descText = rb.getString("description-desc");
String nameText = rb.getString("name-desc");
String brandText = rb.getString("brand-desc");
String releaseDateText = rb.getString("release-date");
%>

<h1><%=  titleText %></h1>
<b> <%=  listTitleText %> </b><br/>

<aui:button-row>

    <portlet:renderURL var="addMobilePhoneURL">
        <portlet:param name="mvcPath" value="/html/jsps/edit.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addMobilePhoneURL.toString() %>" value="<%= addText %>" />

</aui:button-row>

<liferay-ui:search-container emptyResultsMessage="<%= emptyListText %>">
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
            name="<%= nameText %>"
            value="<%= mobilePhone.getName() %>"
        />

        <liferay-ui:search-container-column-text
            name="<%= descText %>"
            value="<%= mobilePhone.getDescription() %>"
        />

        <liferay-ui:search-container-column-text
            name="<%= brandText %>"
            value="<%= mobilePhone.getBrand() %>"
        />

        <liferay-ui:search-container-column-date
            name="<%= releaseDateText %>" 
            value="<%= mobilePhone.getReleaseDate() %>"
        />
        
        <liferay-ui:search-container-column-jsp
		    align="right" 
		    path="/html/jsps/mobile_phone_actions.jsp"
		/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
    
</liferay-ui:search-container>