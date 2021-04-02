package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
