package com.jtj.web.controller;

import com.jtj.web.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页控制层，路由跳转
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/1/24 22:37 End.
 */
//@Controller
//see common/config/WebConfig
@Deprecated
public class IndexController {

    @Autowired
    private SystemService systemService;

    @GetMapping("/")
    public String all(){
        return "about";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/about")
    public String welcome(){
        return "about";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/init")
    public String init(HttpServletRequest request, HttpServletResponse response){
        return systemService.init(request,response);
    }
}
