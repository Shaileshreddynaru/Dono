package com.example.demo.Controller;


import java.sql.SQLIntegrityConstraintViolationException;
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
import com.example.demo.repo.DonRepo;
import com.example.demo.repo.PostRepo;
import com.example.demo.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import jakarta.validation.Valid;
@RestController
@RequestMapping(value= {"/registar"})
public class RegisterController {

	
	@Autowired
	private UserRepo repo;
	@Autowired
	private UserDto dto;
	
	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
	@PostMapping(" ")
	public ResponseEntity<String> readregister(@RequestBody User user) {
	user.setPassword(encoder.encode(user.getPassword()));
	dto.setUsername(user.getUsername());
	dto.setPassword(user.getPassword());
		
	try {
		repo.save(user);
	 return ResponseEntity.ok("success"); }
	catch (Exception e) {
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("username exists try other name");
	}
	}
}
