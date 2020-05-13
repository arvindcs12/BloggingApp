package com.example.arv.bloggingapp.service;

import java.util.List;

import com.example.arv.bloggingapp.api.v1.models.CommentDTO;

public interface CommentService {

	List<CommentDTO> getCommentsByPostId(String id);
}
