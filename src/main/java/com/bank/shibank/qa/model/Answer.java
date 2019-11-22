package com.bank.shibank.qa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Answer extends Audit {
    @Id
    @GeneratedValue(generator = "ans_gen")
    @SequenceGenerator(sequenceName = "ans_gen", initialValue = 100, name = "ans_gen")
    private Long id;
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;
}
