package com.kuhada.cart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="New_Product")
@JsonIgnoreProperties
public class Product {
	        
	@Id
	@GeneratedValue
	@JsonProperty
	private Integer id;
	
	@Column(name="product_name")
	@JsonProperty

	private String name;
	
	@Column(name="description")
	@JsonProperty
	private String desc;
	
	public Product() {}
	
	public Product(Integer id, String name, String desc) {
		this.name=name;
		this.desc = desc;
		this.id=  id;
	}
}
