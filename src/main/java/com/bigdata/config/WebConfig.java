package com.bigdata.config;

import com.bigdata.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                // 拦截所有路径（包括所有html页面、后端接口）
                .addPathPatterns("/**")
                // 放行登录相关路径和公共静态资源
                .excludePathPatterns(
                        "/login.html",
                        "/login",
                        "/register"
                );
    }
}