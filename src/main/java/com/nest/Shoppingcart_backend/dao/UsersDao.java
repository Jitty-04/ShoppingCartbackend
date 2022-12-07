package com.nest.Shoppingcart_backend.dao;

import com.nest.Shoppingcart_backend.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersDao extends CrudRepository<Users,Integer> {
}
