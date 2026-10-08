package com.bigdata.controller;

import com.bigdata.entity.User;
import com.bigdata.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 必须用@Controller才能返回Thymeleaf视图
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * POST请求：处理登录校验，加@ResponseBody返回数据
     */
    @PostMapping("/login")
    @ResponseBody
    public Integer login(
            @RequestParam String uname,
            @RequestParam String password,
            HttpSession session
    ) {
        User user = userService.login(uname, password);
        if(user!=null){
            session.setAttribute("loginUser",user);
            return 1;
        }return 0;

    }
    /**
     * POST请求：处理用户注册
     * 返回值：1=成功，2=用户名已存在，0=失败
     */
    @PostMapping("/register")
    @ResponseBody
    public Integer register(
            @RequestParam String uname,
            @RequestParam String password
    ) {
        return userService.register(uname, password);
    }
    /**
     * 主页入口：先校验登录态，再转发到静态主页
     * 未登录自动跳回登录页
     */
    @GetMapping("/index")
    public String index(HttpSession session) {
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser == null) {
            // 未登录，重定向到登录页
            return "redirect:/login.html";
        }
        // 已登录，转发到静态主页（地址栏不变，用户无感知）
        return "forward:/index.html";
    }
    /**
     * 退出登录：清除Session，跳回登录页
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除登录用户信息
        session.removeAttribute("loginUser");
        // 也可以用 session.invalidate() 清空全部Session
        return "redirect:/login.html";
    }
}