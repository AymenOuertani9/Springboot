package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getByUsername/{username}")
    public User getByUsername(@PathVariable String username) {
        System.out.println("username "+userService.findByUsername(username));
        return userService.findByUsername(username);
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String userAccess() {
        return "User Content.";
    }
    @GetMapping("/ListUsers")
    public List<User> getAllUser(){
        return userService.getAll();
    }

}
