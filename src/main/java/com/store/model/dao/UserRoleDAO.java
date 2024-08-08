package com.store.model.dao;

import com.store.model.UserRole;
import org.springframework.data.jpa.repository.*;

import java.util.*;


public interface UserRoleDAO extends JpaRepository<UserRole, Long> {


    List<UserRole> findByUserId(Integer userId);

}
