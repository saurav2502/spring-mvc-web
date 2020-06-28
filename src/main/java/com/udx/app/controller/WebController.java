package com.udx.app.controller;

import com.udx.app.entity.User;
import com.udx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created By Saurav Kumar on Jun, 2020
 */

@Controller
@RequestMapping("/web")
public class WebController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/test")
    public String testApplication(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "Service is Up.";
    }

    @ResponseBody
    @GetMapping("/user")
    public User getUser(Long userId) {
        User user = null;
        try{
            user = userService.findUser(userId);
        } catch (Exception e){
            System.out.println("Exception Occurs");
        }
        return user;
    }

    @ResponseBody
    @GetMapping("/Alluser")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
}
