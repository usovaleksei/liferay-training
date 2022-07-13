package com.liferay.docs.liferaymvc.web.portlet.action;

import com.liferay.docs.liferaymvc.web.constants.FirstPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + FirstPortletKeys.FIRST,
                "mvc.command.name=/action/greet"
        },
        service = MVCActionCommand.class
)

public class DisplayMessageMVCActionCommand implements MVCActionCommand {
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        System.out.println("Action method running");
        String greetingMessage = "success message";
        actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);
        SessionMessages.add(actionRequest, greetingMessage);
        return false;
    }
}
