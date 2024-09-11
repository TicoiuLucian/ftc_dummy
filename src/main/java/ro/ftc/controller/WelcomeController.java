package ro.ftc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomePage(final Model model) {
        return "welcome";
    }

    @GetMapping("/")
    public String redirectToWelcome(final Model model) {
        return "redirect:/welcome";
    }
}