package com.kuhada.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kuhada.cart.entity.Product;
import com.kuhada.cart.exception.ProductNotFoundException;
import com.kuhada.cart.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getByProductId(@PathVariable("id") Integer id) throws JsonProcessingException {
		Product p = productService.getProductById(id);
		if(p == null) {
			throw new ProductNotFoundException("Product Not Exist with given Id : "+id);
		}
		return new ResponseEntity(p, HttpStatus.OK);
	}
	@PostMapping("/products")
	public ResponseEntity<Product> save(@RequestBody Product product){
		Product p =  productService.save(product);
		return new ResponseEntity(p,  HttpStatus.CREATED);
	}
	@PutMapping("/products")
	public ResponseEntity<Product> update(@RequestBody Product product){
		Product p =  productService.update(product);
		return new ResponseEntity(p,  HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/products")
	public ResponseEntity<Product> delete(@RequestBody Product product) {
		productService.delete(product);
		return new ResponseEntity(HttpStatus.OK);
	}

}
