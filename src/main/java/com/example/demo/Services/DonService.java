package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication ;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DonorDto;
import com.example.demo.DTO.UserDto;
import com.example.demo.Model.Donors;
import com.example.demo.Model.User;
import com.example.demo.repo.DonRepo;
import com.example.demo.repo.UserRepo;

@Service
public class DonService {

	
	@Autowired
	DonRepo don ;
	private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	@Autowired
	Donors ent;
    @Autowired
    private UserRepo repo;
    @Autowired
    AuthenticationManager authManager;


	public List<Donors> getDoners() {
		// TODO Auto-generated method stub
		return don.findAll();
	}



	public Donors readDonoer(Donors donor) {
		// TODO Auto-generated method stub
		
		
		
		return don.save(donor);
	}



	 public boolean authenticate(UserDto dto) {
		 User user1=new User();
	        
	        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
	        if(!dto.getUsername().equals(user1.getUsername())){
	            throw new UsernameNotFoundException("User does not exist in the database");
	        }

	        if (!bCryptPasswordEncoder.matches(user1.getPassword(), dto.getPassword())) {
	            throw  new BadCredentialsException("The password is incorrect");
	        }

	        return  true;
	    }





	
}
