package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Donors;

@Repository
public interface DonRepo extends JpaRepository<Donors, Integer>  {

	

	
}
