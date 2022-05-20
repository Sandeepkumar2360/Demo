package com.kuhada.cart.service;

import com.kuhada.cart.entity.Product;

public interface ProductService {

	public Product save(Product product);

	public Product getProductById(Integer id);

	public Product update(Product product);

	public void delete(Product product);

}
