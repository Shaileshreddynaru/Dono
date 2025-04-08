package com.example.demo.Model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.lang.*;
@Entity
@Component


	
	
public class Posts {
	public Posts() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  post_id;
	private String post_name;
	private String post_story;
	private int post_likes;
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public String getPost_story() {
		return post_story;
	}
	public void setPost_story(String post_stoy) {
		this.post_story = post_stoy;
	}
	public int getPost_likes() {
		return post_likes;
	}
	public void setPost_likes(int post_likes) {
		this.post_likes = post_likes;
	}
	public Posts(int post_id, String post_name, String post_story, int post_likes) {
		super();
		this.post_id = post_id;
		this.post_name = post_name;
		this.post_story = post_story;
		this.post_likes = post_likes;
	}
	
	
}
