package com.blog.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.blog.model.BlogPost;

public interface BlogPostDAO extends JpaRepository<BlogPost, Long> {

Page<BlogPost> findByTitle(String title, Pageable pageable);
	
	@Query("SELECT c.blogId,c.metaTitle FROM BlogPost AS c")
    public List<String> findBlogId();
	

}
