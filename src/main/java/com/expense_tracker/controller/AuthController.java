package com.expense_tracker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.expense_tracker.repository.UserRepository;
import com.expense_tracker.model.User;

@Controller
public class AuthController {

    private final UserRepository userRepo;

    public AuthController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {
        userRepo.save(user);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

        User user = userRepo.findByUsernameAndPassword(username, password);

        if (user != null) {
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid Credentials");
            return "login";
        }
    }
}
