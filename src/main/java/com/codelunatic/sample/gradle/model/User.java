package com.codelunatic.sample.gradle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Setter
@Getter@ToString
public class User {

	@Id
	private Integer id;
	@Column(name ="name")
	private String name;
}
