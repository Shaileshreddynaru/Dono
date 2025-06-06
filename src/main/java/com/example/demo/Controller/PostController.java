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
import com.example.demo.Model.Donors;
import com.example.demo.Model.Posts;
import com.example.demo.Services.DonService;
import com.example.demo.repo.DonRepo;
import com.example.demo.repo.PostRepo;

import jakarta.validation.Valid;
@RestController
@RequestMapping(value= {"/post"})
public class PostController {
	@Autowired
	PostRepo post ;
	
	@GetMapping(" ")
	public List<Posts> getPost()
	{
		  return post.findAll();
	}
	
	
	@PostMapping(" ")
	public Posts readPost(@RequestBody Posts posts) {
	
		return post.save(posts);
		
	}
	
}
