package com.example.arv.bloggingapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.arv.bloggingapp.api.v1.models.CommentDTO;
import com.example.arv.bloggingapp.service.CommentService;

@RestController
public class CommentController {

	private final CommentService commentService;
	
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}
	@GetMapping("posts/{id}/comments")
	public List<CommentDTO> getCommentsByPostId(@PathVariable String id){
		return commentService.getCommentsByPostId(id);
	}
}
