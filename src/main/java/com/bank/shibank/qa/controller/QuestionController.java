package com.bank.shibank.qa.controller;

import com.bank.shibank.locking.model.Account;
import com.bank.shibank.locking.model.User;
import com.bank.shibank.locking.repository.AccountRepository;
import com.bank.shibank.locking.repository.UserRepository;
import com.bank.shibank.qa.model.Question;
import com.bank.shibank.qa.repositories.QuestionRepo;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    final QuestionRepo questionRepo;

    final UserRepository userRepository;

    final AccountRepository accountRepository;

    public QuestionController(QuestionRepo questionRepo, UserRepository userRepository, AccountRepository accountRepository) {
        this.questionRepo = questionRepo;
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    @GetMapping
    @Transactional
    public Page<Question> getQuestions(Pageable page) {
        userRepository.saveAndFlush(new User("arpi", new Date(1992, 10, 9), null));
        accountRepository.saveAndFlush(new Account(userRepository.findAll().get(0), 199));
//        userRepository.save(new User("arpi", new Date(1992, 10, 9), null));
//        accountRepository.save(new Account(userRepository.findAll().get(0), 199));
//        accountRepository.flush();
//        userRepository.flush();
        List<Account> s = userRepository.findAll().get(0).getAccounts();
        return questionRepo.findAll(page);
    }

    @PostMapping
    public Question createQuestion(@Valid @RequestBody Question question) {
        return questionRepo.save(question);
    }
}
