package com.example.arv.bloggingapp.api.v1.models;

public class CommentDTO {

	private long id;

	private String content;

	private BlogPostDTO blogPost;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
