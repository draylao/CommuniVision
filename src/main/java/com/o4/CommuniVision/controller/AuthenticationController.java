package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.o4.CommuniVision.model.dto.Signup;
import com.o4.CommuniVision.model.dto.Login;

@RestController
@RequestMapping("api/authentication")
@CrossOrigin(origins = "*")
public class AuthenticationController {
    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody Signup req, @PathVariable Integer organizationId){
        String result = service.register(req, organizationId);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login req){
        boolean success = service.login(req);
        return success ? ResponseEntity.ok("Login Successful") :
                ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Attempt Invalid");
    }
}
