package com.liferay.docs.liferaymvc.web.portlet.render;

import com.liferay.docs.liferaymvc.web.constants.FirstPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + FirstPortletKeys.FIRST,
                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)
public class DisplayUsernameParameterMVCRenderCommand implements MVCRenderCommand {
    private final Log LOG = LogFactoryUtil.getLog(DisplayUsernameParameterMVCRenderCommand.class);

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        LOG.info("Render method running log");
        System.out.println("Render method running");
        LOG.info("Render method running");
        ThemeDisplay theme = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        String userName = theme.getUser().getFullName();
        renderRequest.setAttribute("USERNAME", userName);
        return "/view.jsp";
    }
}
