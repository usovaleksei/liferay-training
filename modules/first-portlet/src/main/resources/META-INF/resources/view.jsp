<%@ include file="init.jsp" %>

<h3>HELLO, FIRST PORTLET!</h3>

<liferay-portlet:actionURL name="/action/greet" var="greetUrl"/>

<div>
    <aui:form action="<%= greetUrl%>">
        <aui:button-row>
            <aui:button type="submit" value="Show message"></aui:button>
        </aui:button-row>
    </aui:form>
</div>
<div>
    <p>
        <%= request.getAttribute("GREETER_MESSAGE")%>
    </p>
</div>

<portlet:renderURL var="displayUserURL">
    <portlet:param name="mvcRenderCommandName" value="/"/>
</portlet:renderURL>

<p>
<h3>Current username: </h3>
<%= request.getAttribute("USERNAME")%>
</p>

<portlet:resourceURL id="/send_info" var="sendInfoURL"/>
<p><a href="${sendInfoURL}">Send message to portlet and display</a></p>

