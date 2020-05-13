package com.example.arv.bloggingapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.arv.bloggingapp.api.v1.models.CommentDTO;
import com.example.arv.bloggingapp.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentRepository commentRepo;
	
	public CommentServiceImpl(CommentRepository commentRepo) {
		this.commentRepo = commentRepo;
	}

	@Override
	public List<CommentDTO> getCommentsByPostId(String id) {
		return commentRepo.findByBlogPostId(id).stream().map(comment ->{
			CommentDTO commentDto = new CommentDTO();
			commentDto.set_id(comment.getId());
			commentDto.setContent(comment.getContent());
			return commentDto;
		}).collect(Collectors.toList());
	}
	
	
}
