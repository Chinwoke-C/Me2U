package com.org.app.Me2U.data.repository;

import com.org.app.Me2U.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
