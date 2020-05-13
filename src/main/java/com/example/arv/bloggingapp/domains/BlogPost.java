package com.example.arv.bloggingapp.domains;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class BlogPost {

	@Id
	@GeneratedValue(generator = "blog_uuid")
	@GenericGenerator(name= "blog_uuid", strategy = "uuid2")
	private String id;
	
	private String title;
	private String subtitle;
	
	@Lob
	private String content;
	
	@OneToMany
	@JoinColumn(name="blogpost_id")
	private Set<Comment> comments = new HashSet<>();
	
	//TODO: Add set of authors
	//TODO: add datetime field of published and updated

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
}
