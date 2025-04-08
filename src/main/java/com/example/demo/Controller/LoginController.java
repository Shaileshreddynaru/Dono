package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.DonorDto;
import com.example.demo.DTO.UserDto;
import com.example.demo.Model.Donors;
import com.example.demo.Model.Posts;
import com.example.demo.Model.User;
import com.example.demo.Services.DonService;
import com.example.demo.Services.JWTService;
import com.example.demo.conf.JwtFilter;
import com.example.demo.repo.DonRepo;
import com.example.demo.repo.PostRepo;
import com.example.demo.repo.UserRepo;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
@RestController
@RequestMapping(value= {"/login"})
public class LoginController {
	@Autowired
	private UserRepo repo;
	@Autowired
	private DonService ser;
	@Autowired
	private UserDto dto;
	@Autowired
    private JWTService jwtService; 
	  @Autowired
	    AuthenticationManager authManager;
	
	@PostMapping(" ")
	
	 public ResponseEntity<String> login(@RequestBody User user, HttpSession session) {
        
           

            Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
            if (authentication.isAuthenticated()) {
            	String token=jwtService.generateToken(user.getUsername());
                return ResponseEntity.ok(token);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid");
            }
    }
	}

