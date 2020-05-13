package com.example.arv.bloggingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.arv.bloggingapp.domains.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
	
}
