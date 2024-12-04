package com.samuel.demoSpringMVC;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("user", user);
        return "result";
    }
}

