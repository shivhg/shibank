package com.bank.shibank.locking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "account_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date dob;

    @OneToMany
    @JoinColumn(name = "user_id")
    List<Account> accounts;

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public User(String s, Date date, List<Account> account) {
        this.name = s;
        this.dob = date;
        this.accounts = account;
    }
}
