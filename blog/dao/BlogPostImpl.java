package com.blog.dao;

import com.blog.model.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public class BlogPostImpl {

    @PersistenceContext
    private EntityManager em;
    
    
    @Transactional
    public List<BlogPage> getData( Long userId) {
    	  //TypedQuery<BlogPost> query = em.createQuery("SELECT c FROM BlogPost c ", BlogPost.class);
    		 // List<BlogPost> results = query.getResultList();
    		
    		  String queryStr =
    			      "SELECT NEW com.blog.model.BlogPage(c.blogId,c.userId,d.firstName,d.lastName,c.parentId,c.title,c.metaTitle,c.slug,c.summary,c.published,c.createdAt,c.updatedAt,c.publishedAt,c.replyCount,c.likeCount,c.viewCount,c.status,c.authFlag,c.authUser,c.authDate ,c.content) FROM BlogPost c JOIN UserMaster d ON c.userId = d.userId where c.userId = :userId";
    		  
    		  TypedQuery<BlogPage> query =
    			      em.createQuery(queryStr, BlogPage.class);
    			//  List<BlogPage> results = query.getResultList();
    			  List<BlogPage> results = query.setParameter("userId", userId).getResultList(); 
    			  return results;
    	//	  return results;
    }
	
}
