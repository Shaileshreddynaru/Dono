package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Posts;

@Repository
public interface PostRepo extends JpaRepository<Posts, Integer>  {

	

	
}