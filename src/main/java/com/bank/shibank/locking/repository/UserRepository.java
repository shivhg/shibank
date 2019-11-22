package com.bank.shibank.locking.repository;

import com.bank.shibank.locking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
