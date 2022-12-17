package ua.yakubovskiy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {

    @RequestMapping("/")
    public String askUserLogin(){
        return "ask-user-login";
    }

    @RequestMapping("/showHomePage")
    public String showUserHomePage(@RequestParam("username") String userName,
                                   Model model){

        model.addAttribute("nameAttribute", userName + "-top");

        return "user-home-page";
    }

}
