package com.example.demo.document;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="todos")
@JsonIgnoreProperties(value= {"createdAt"}, allowGetters=true)//is used to ignore createdAt field during deserialization.
public class Todo {

	@Id
	private String id;
	
	@NotBlank//todo’s title is not blank by annotating it with @NotBlank annotation
	@Size(max=100)
	@Indexed(unique=true)//title with @Indexed annotation and marked it as unique
	private String title;
	
	private Boolean compleated = false;
	private Date createdAt = new Date();
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(String id, String title, Boolean compleated, Date createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.compleated = compleated;
		this.createdAt = createdAt;
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

	public Boolean getCompleated() {
		return compleated;
	}

	public void setCompleated(Boolean compleated) {
		this.compleated = compleated;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}
