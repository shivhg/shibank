package com.bank.shibank.locking.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Account {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double balance;

    public Account(User user, double balance) {
        this.user = user;
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }
}
