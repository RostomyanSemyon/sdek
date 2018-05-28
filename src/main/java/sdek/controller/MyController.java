package sdek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sdek.model.User;
import sdek.service.UserService;

import java.util.Collections;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    public UserService userService;

    @RequestMapping("/mainPage" )
    public String mainPage(Model model){
        return "mainPage";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "mainPage";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);

        return "mainPage";
    }

    @GetMapping("/findUsers")
    public String findUsersByName(Model model, @ModelAttribute("user") User user){
        model.addAttribute("users", userService.findByName(user.getName()));
        return "mainPage";
    }
}
