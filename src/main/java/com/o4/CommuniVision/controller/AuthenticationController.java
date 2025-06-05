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

}
