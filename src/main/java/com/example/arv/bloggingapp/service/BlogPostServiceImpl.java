package com.example.arv.bloggingapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.arv.bloggingapp.api.v1.models.BlogPostDTO;
import com.example.arv.bloggingapp.domains.BlogPost;
import com.example.arv.bloggingapp.repositories.BlogPostRepository;

@Service
public class BlogPostServiceImpl implements BlogPostService {

	private final BlogPostRepository blogPostRepo;

	public BlogPostServiceImpl(BlogPostRepository blogPostRepo) {
		this.blogPostRepo = blogPostRepo;
	}

	@Override
	public List<BlogPostDTO> getAllBlogPost() {
		return blogPostRepo.findAll().stream().map(blog -> blogToBlogDTO(blog)).collect(Collectors.toList());
	}

	@Override
	public BlogPostDTO getBlogPostById(String id) {
		return blogPostRepo.findById(id).map(blog -> blogToBlogDTO(blog)).orElseThrow(ResourceNotFoundException::new);
	}

	@Override
	public BlogPostDTO createNewBlogPost(BlogPostDTO blogPostDTO) {
		return saveAndReturnBlogPost(blogDTOToBlog(blogPostDTO));
	}

	private BlogPostDTO saveAndReturnBlogPost(BlogPost blog) {
		BlogPost savedBlog = blogPostRepo.save(blog);
		return blogToBlogDTO(savedBlog);
	}

	@Override
	public BlogPostDTO updateBlogPost(String id, BlogPostDTO blogPostDTO) {
		// TODO Auto-generated method stub
		BlogPost blog = blogDTOToBlog(blogPostDTO);
		blog.setId(id);
		return saveAndReturnBlogPost(blog);
	}

	@Override
	public void deleteBlogPost(String id) {
		blogPostRepo.deleteById(id);
	}

	//TODO: move below methods to mapper class
	private BlogPostDTO blogToBlogDTO(BlogPost blog) {
		BlogPostDTO blogDTO = new BlogPostDTO();
		blogDTO.set_id(blog.getId());
		blogDTO.setTitle(blog.getTitle());
		blogDTO.setSubtitle(blog.getSubtitle());
		blogDTO.setContent(blog.getContent());
		blogDTO.setComments(blog.getComments().stream().map(comment -> comment.getId()).collect(Collectors.toList()));
		return blogDTO;
	}
	
	
	private BlogPost blogDTOToBlog(BlogPostDTO blogPostDTO) {
		BlogPost blog = new BlogPost();
		blog.setId(blogPostDTO.get_id());
		blog.setTitle(blogPostDTO.getTitle());
		blog.setSubtitle(blogPostDTO.getSubtitle());
		blog.setContent(blogPostDTO.getContent());
		return blog;
	}
}
