package com.example.arv.bloggingapp.service;

import java.util.List;

import com.example.arv.bloggingapp.api.v1.models.BlogPostDTO;

public interface BlogPostService {

	List<BlogPostDTO> getAllBlogPost();
	BlogPostDTO getBlogPostById(Long id);
	BlogPostDTO createNewBlogPost(BlogPostDTO blogPostDTO);
	BlogPostDTO updateBlogPost(Long id, BlogPostDTO blogPostDTO);
	void deleteBlogPost(Long id);

}
