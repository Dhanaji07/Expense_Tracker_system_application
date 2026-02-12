package com.expense_tracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.expense_tracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
