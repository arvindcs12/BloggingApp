package com.example.arv.bloggingapp.api.v1.models;

public class CommentDTO {

	private String id;

	private String content;

	private BlogPostDTO blogPost;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BlogPostDTO getBlogPost() {
		return blogPost;
	}

	public void setBlogPost(BlogPostDTO blogPost) {
		this.blogPost = blogPost;
	}

	
}
