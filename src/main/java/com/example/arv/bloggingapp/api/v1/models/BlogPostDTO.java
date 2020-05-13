package com.example.arv.bloggingapp.api.v1.models;

import java.util.HashSet;
import java.util.Set;

public class BlogPostDTO {

	private long id;
	private String title;
	private String subtitle;
	private String content;
	private Set<CommentDTO> comments = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Set<CommentDTO> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDTO> comments) {
		this.comments = comments;
	}


	@Override
	public String toString() {
		return "BlogPostDTO [id=" + id + ", title=" + title + ", content=" + content + ", subtitle=" + subtitle + "]";
	}

}
