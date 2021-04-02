package com.jpa.relation.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="comment")

public class Comment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String text;
}