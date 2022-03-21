package com.example.spring_security_home_work.entity;

import lombok.*;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "question_sequence")
    @SequenceGenerator(name = "question_sequence",sequenceName = "question_seq",allocationSize = 1)
    private Long id;
    private String questionName;

    public Question(String questionName) {
        this.questionName = questionName;
    }

    @ManyToOne(cascade = {MERGE,DETACH,REFRESH,PERSIST},fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id")
    private Test test;

    @OneToMany(cascade = ALL,mappedBy = "question")
    private List<Variant>variantList;

}
