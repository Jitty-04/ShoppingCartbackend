package com.nest.Shoppingcart_backend.dao;

import com.nest.Shoppingcart_backend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
