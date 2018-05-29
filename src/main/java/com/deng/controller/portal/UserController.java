package com.deng.controller.portal;


import com.deng.pojo.User;
import com.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    @ResponseBody
    public String get() {
        return (new User()).getName();
    }


    @ResponseBody
    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam(value = "name", required = true) String name, @RequestParam(value = "password", required = true) String password) {

        return "fail";
    }

    @ResponseBody
    @RequestMapping("/getUserInfo")
    public User getUserInfo(HttpSession session) {
        return (User) session.getAttribute("user");
    }

    @RequestMapping("/register")
    public String register(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "password", required = true) String passsword) {
        return "success";
    }
}
