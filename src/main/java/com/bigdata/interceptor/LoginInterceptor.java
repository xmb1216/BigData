package com.bigdata.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 请求进入Controller之前执行
     * 返回true = 放行，返回false = 拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");

        if (loginUser == null) {
            // 未登录，重定向到登录页
            response.sendRedirect("/login.html");
            return false;
        }
        // 已登录，放行请求
        return true;
    }
}