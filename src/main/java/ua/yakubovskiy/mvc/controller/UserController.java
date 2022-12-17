package ua.yakubovskiy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.yakubovskiy.mvc.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String askUserLogin(){
        return "ask-user-login";
    }

    @RequestMapping("/showHomePage")
    public String showUserHomePage(@RequestParam("login") String login,
                                   @RequestParam("password") String password,
                                   Model model){

        model.addAttribute("nameAttribute", userService.checkUser(login , password));
        return "user-home-page";
    }

}
