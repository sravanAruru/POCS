package com.nisum.model;

import org.springframework.data.annotation.Id; 
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;

//@Document
@Setter
@Getter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@Id
	private String customerId;
	private String name;
	private String address;
	private String phoneNum;
	
	/*@DBRef(db="order")
	private Order order;*/
	
	
	
}
