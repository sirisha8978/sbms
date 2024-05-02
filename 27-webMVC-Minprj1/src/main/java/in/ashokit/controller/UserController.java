package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Login page
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login"; 
    }

    // Login button
    @PostMapping("/login")
    public String handleLogin(User user, Model model) {
        User userObj = userService.getUser(user.getEmail(), user.getPwd());
        if (userObj == null) {
            model.addAttribute("emsg", "Invalid Credentials");
            model.addAttribute("user", new User());
            return "login"; // Return to the login page with an error message
        } else {
            model.addAttribute("msg", "Welcome to ashokit...");
            model.addAttribute("user", userObj);
            return "dashboard"; // Redirect to the dashboard page
        }
    }

    // Register page
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Assuming your register page is named "register.jsp" or similar
    }

    // Register button
    @PostMapping("/saveUser")
    public String saveUser(User user, Model model) {
        boolean status = userService.saveUser(user);
        if (status) {
            model.addAttribute("smsg", "User Registered");
        } else {
            model.addAttribute("emsg", "Registration failed");
        }
        model.addAttribute("user", user); // Add user object to the model
        return "register"; // Return to the register page
    }

    // Logout method
    @GetMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("user", new User());
        return "login"; // Assuming your login page is named "login.jsp" or similar
    }
}
