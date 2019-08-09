//package com.daoxuanson.security;
//
//import com.daoxuanson.constant.Constant;
//import com.daoxuanson.utils.SecurityUtils;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@Component
//public class CustomSuccessHandler implements AuthenticationSuccessHandler {
//
//
//    private static final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        String targetUrl = determineTargetUrl(authentication);
//
//        if (response.isCommitted()) {
//            return;
//        }
//
//        redirectStrategy.sendRedirect(request, response, targetUrl);
//    }
//
//    private String determineTargetUrl(Authentication authentication) {
//        String url = "";
//        List<String> roles = SecurityUtils.getAuthorities(authentication);
//
//        if (isUser(roles)) {
//            url = Constant.WEB;
//        } else {
//            url = Constant.ADMIN_HOME;
//        }
//
//        return url;
//    }
//
//    private boolean isUser(List<String> roles) {
//        return roles.stream().anyMatch(role -> role.equals("ROLE_USER"));
//    }
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//        handle(httpServletRequest, httpServletResponse, authentication);
//    }
//}
