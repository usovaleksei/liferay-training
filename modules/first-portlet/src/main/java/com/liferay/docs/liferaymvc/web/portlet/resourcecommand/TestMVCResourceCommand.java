package com.liferay.docs.liferaymvc.web.portlet.resourcecommand;

import com.liferay.docs.liferaymvc.web.constants.FirstPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + FirstPortletKeys.FIRST,
                "mvc.command.name=/send_info"
        },
        service = MVCResourceCommand.class
)
public class TestMVCResourceCommand implements MVCResourceCommand {

    @Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {
        System.out.println("serveResource method running");
        LOG.info("resource METHOD");
        String returnMessage = "message from serveResource method";
        try {
            resourceResponse.getWriter().print(returnMessage);
        } catch (IOException e) {
            LOG.error("IO Exception " + e);
        }
        resourceResponse.setContentType("text/plain");

        return false;
    }
    private final Log LOG = LogFactoryUtil.getLog(TestMVCResourceCommand.class);
}
