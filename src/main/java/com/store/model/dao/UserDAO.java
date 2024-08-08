package com.store.model.dao;

import com.store.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<Users, Long> {
}
