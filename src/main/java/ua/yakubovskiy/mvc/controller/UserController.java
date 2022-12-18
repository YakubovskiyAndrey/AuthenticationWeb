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
                                   Model model) {
        if (!"".equals(login) && !"".equals(password)) {
            boolean result = userService.checkUser(login, password);
            if (result) {
                return "user-home-page";
            } else {
                model.addAttribute("error", "user is not found");
                return "ask-user-login";
            }
        }else {
            model.addAttribute("error", "login and password cannot be empty");
            return "ask-user-login";
        }
    }

    @RequestMapping("/allUsers")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.showAll());
        return "all-users";
    }

    @RequestMapping("/redirectLogin")
    public String redirectLogin() {
        return "redirect:/";
    }
}
