package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.document.Todo;
import com.example.demo.repository.TodoRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")//The @CrossOrigin annotation in this controller is used to enable Cross-Origin requests. 
//This is required because we’ll be accessing the apis from angular’s frontend server.
public class TodoController {

	@Autowired
	TodoRepository todoRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TodoController.class);
	
	@GetMapping(value="/todos")
	public List<Todo> getAllTodos(){
		LOGGER.info("I am going to test slf4j logger");
		Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
		return todoRepository.findAll(sortByCreatedAtDesc);
	}
	
	@PostMapping(value="/todos")
	public Todo createTodo(@Valid @RequestBody Todo todo) {
		todo.setCompleated(todo.getCompleated());
		return todoRepository.save(todo);
		
	}
	
	@GetMapping(value="/todos/{id}")
	public ResponseEntity<Todo> getTodoById(@PathVariable("id") String id){
		Todo todo = todoRepository.findOne(id);
		if(todo == null) {
			return new ResponseEntity<> (HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
	}
	
	@PutMapping(value="/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable("id") String id, @RequestBody Todo todo){
		Todo todoData = todoRepository.findOne(id);
		if(todoData == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		todoData.setTitle(todo.getTitle());
		todoData.setCompleated(todo.getCompleated());
		Todo updatedTodo = todoRepository.save(todoData);
		return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/todos/{id}")
	public void deleteTodo(@PathVariable("id") String id){
		LOGGER.info("deleting the record associated with id: "+id);
		todoRepository.delete(id);
	}
}
