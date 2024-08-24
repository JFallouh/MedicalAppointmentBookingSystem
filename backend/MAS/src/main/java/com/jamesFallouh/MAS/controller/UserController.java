/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.controller;

import com.jamesFallouh.MAS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/{username}/password")
    public void updatePassword(@PathVariable String username, @RequestParam String newPassword) {
        userService.updatePassword(username, newPassword);
    }
}
