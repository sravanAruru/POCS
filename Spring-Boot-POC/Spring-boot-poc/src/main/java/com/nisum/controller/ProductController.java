/*package com.nisum.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.model.Product;
import com.nisum.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired	
private 	ProductService productService;



//creates
@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createProduct(@RequestBody Product product) 
	{
		
		productService.create(product);
	}

//read
@RequestMapping
public List<Product> readProducts()
{
return	productService.listAll();
}

//update
@RequestMapping( value="{productId}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
public Product updateProduct(@PathVariable String productId ,@RequestBody Product product)
{
	return productService.updateProduct(productId, product);
}

//delete
@RequestMapping(value="{productId}",method=RequestMethod.DELETE)

public void deleteProduct(@PathVariable String productId)
{
	productService.delete(productId);
}
}
*/