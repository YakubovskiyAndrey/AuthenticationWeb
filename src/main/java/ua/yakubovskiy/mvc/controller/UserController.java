package ua.yakubovskiy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.yakubovskiy.mvc.entity.User;
import ua.yakubovskiy.mvc.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    private boolean userLogged;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String askUserLogin(){
        userLogged = false;
        return "ask-user-login";
    }

    @RequestMapping("/showHomePage")
    public String showUserHomePage(@ModelAttribute("user") User user, Model model) {
        if (!"".equals(user.getLogin()) && !"".equals(user.getPassword())) {
            userLogged = userService.checkUser(user);
            if (userLogged) {
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
        if (userLogged) {
            model.addAttribute("users", userService.showAll());
            return "all-users";
        }else {
            return logout();
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    @RequestMapping("/returnMainMenu")
    public String returnMainMenu() {
        if (userLogged) {
            return "user-home-page";
        }else {
            return logout();
        }
    }
}
