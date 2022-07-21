<%@include file="init.jsp"%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"/>

<aui:form action="<%= addEntryURL%>" name="<portlet: namespace />fm">
    <aui:fieldset>
            <aui:input name="name"/>
            <aui:input name="message"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL.toString()%>"/>
    </aui:button-row>
</aui:form>