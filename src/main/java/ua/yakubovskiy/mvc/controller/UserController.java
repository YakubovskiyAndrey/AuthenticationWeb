package ua.yakubovskiy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.yakubovskiy.mvc.entity.User;
import ua.yakubovskiy.mvc.service.UserService;
import ua.yakubovskiy.mvc.service.UserServiceImpl;

@Controller
public class UserController {

    private final UserService userService;

    private boolean isAuthenticated;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public ModelAndView askUserLogin(){
        isAuthenticated = false;
        return new ModelAndView("ask-user-login");
    }

    @RequestMapping("/showHomePage")
    public ModelAndView showUserHomePage(@ModelAttribute("user") User user) {
        if (isAuthenticated) return new ModelAndView("/user-home-page");

        if (!"".equals(user.getUserName()) && !"".equals(user.getPassword())) {
            isAuthenticated = userService.checkUser(user);
            if (isAuthenticated) {
                return new ModelAndView("/user-home-page");
            } else {
                return new ModelAndView("/ask-user-login",
                        "error", "User is not found");
            }
        }else {
            return new ModelAndView("/ask-user-login",
                    "error", "Username and password cannot be empty");
        }
    }

    @RequestMapping("/allUsers")
    public ModelAndView showAllUsers() {
        if (isAuthenticated) {
            return new ModelAndView("/all-users",
                    "users", userService.showAll());
        }else {
            return logout();
        }
    }

    @RequestMapping("/logout")
    public ModelAndView logout() {
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/returnMainMenu")
    public ModelAndView returnMainMenu() {
        if (isAuthenticated) {
            return new ModelAndView("/user-home-page");
        }else {
            return logout();
        }
    }
}
