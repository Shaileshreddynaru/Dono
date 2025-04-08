package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	
	@Autowired
	public UserRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=repo.findByUsername(username);
		if(user==null) {
			System.out.println("no found");
			throw new UsernameNotFoundException("user no fount");
		}
		return new UserPrincipal(user);
	}

}
