package com.example.arv.bloggingapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.arv.bloggingapp.domains.BlogPost;
import com.example.arv.bloggingapp.domains.Comment;
import com.example.arv.bloggingapp.repositories.BlogPostRepository;
import com.example.arv.bloggingapp.repositories.CommentRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final BlogPostRepository blogPostRepo;
	private final CommentRepository commentRepo;

	public BootstrapData(BlogPostRepository blogPostRepo, CommentRepository commentRepo) {
		this.blogPostRepo = blogPostRepo;
		this.commentRepo = commentRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>Started in bootstrap");

		BlogPost inspiringBooks = new BlogPost();
		inspiringBooks.setTitle("Inspiring books for hard times");
		inspiringBooks.setContent(
				"Many of us are probably struggling with a case of cabin fever, stir-crazies, anxiety, or restlessness on a day-to-day basis these days. Many of us are probably struggling with a case of cabin fever, stir-crazies, anxiety, or restlessness on a day-to-day basis these days. Many of us are probably struggling with a case of cabin fever, stir-crazies, anxiety, or restlessness on a day-to-day basis these days.");

		blogPostRepo.save(inspiringBooks);
		
		Comment nicePost = new Comment();
		nicePost.setBlogPost(inspiringBooks);
		nicePost.setContent("It is a nice post");
		
		commentRepo.save(nicePost);
		
		Comment awesomePost = new Comment();
		awesomePost.setBlogPost(inspiringBooks);
		awesomePost.setContent("Awesome post");
		commentRepo.save(awesomePost);

		inspiringBooks.getComments().add(nicePost);
		inspiringBooks.getComments().add(awesomePost);
		
		
		
		blogPostRepo.save(inspiringBooks);

		BlogPost citrusFruits = new BlogPost();
		citrusFruits.setTitle("Are you throwing out the best part of your citrus fruits?");
		citrusFruits.setSubtitle(
				"Behold the delicious treasures of the citrus peel; here's how to get the best of the zest.");
		citrusFruits.setContent(
				"Most people buy citrus for the fruit or juice and then toss the peels, but there's a lot going on in those peels that would be a shame to waste; namely, the zest.");
		blogPostRepo.save(citrusFruits);

		System.out.println("Number of Blogs: " + blogPostRepo.count());

	}

}
