package com.o4.CommuniVision.controller;
import com.o4.CommuniVision.model.entity.User;
import com.o4.CommuniVision.service.UserService;
import com.o4.CommuniVision.model.dto.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("communivision/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Signup req, @PathVariable Integer organizationId) {
        String result = userService.register(req, organizationId);

        if ("Registration Successful".equals(result)) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.badRequest().body(result);
        }
    }

    @GetMapping
    public List<User> getUsersByOrganization(@PathVariable Integer organizationId) {
        return userService.getUsersByOrganization(organizationId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser (@RequestBody Signup req, @PathVariable Integer id) {
        return userService.updateUser(req, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser (@PathVariable Integer id) {
        return userService.deleteUser(id);
    }

}
