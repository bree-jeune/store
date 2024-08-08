package com.store.model.dao;

import com.store.model.Users;
import org.springframework.data.jpa.repository.*;

public interface UserDAO extends JpaRepository<Users, Long> {
    Users findByEmailIgnoreCase(String email);
}
