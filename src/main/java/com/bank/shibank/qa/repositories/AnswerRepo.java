package com.bank.shibank.qa.repositories;

import com.bank.shibank.qa.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {
}
