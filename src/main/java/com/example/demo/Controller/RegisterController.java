package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public User readregister(@RequestBody User user) {
	user.setPassword(encoder.encode(user.getPassword()));
	dto.setUsername(user.getUsername());
	dto.setPassword(user.getPassword());
		return repo.save(user);
		
	}
}
