package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Long>{

}
