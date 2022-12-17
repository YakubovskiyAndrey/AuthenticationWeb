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
    public String showUserHomePage(@RequestParam("login") String login,
                                   @RequestParam("password") String password,
                                   Model model){


        return "user-home-page";
    }

}
