package com.jamesFallouh.MAS.util;

import com.jamesFallouh.MAS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialPasswordUpdater implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public InitialPasswordUpdater(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        userService.updatePassword("james", "test123");
    }
}
