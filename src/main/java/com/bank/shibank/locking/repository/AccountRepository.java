package com.bank.shibank.locking.repository;

import com.bank.shibank.locking.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
