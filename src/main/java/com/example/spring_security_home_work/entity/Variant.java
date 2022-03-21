package com.example.spring_security_home_work.entity;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "variants")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Variant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "variant_sequence")
    @SequenceGenerator(name = "variant_sequence",sequenceName = "variant_seq",allocationSize = 1)
    private Long id;
    private String variantName;
    private boolean answer;

    public Variant(String variantName, boolean answer) {
        this.variantName = variantName;
        this.answer = answer;
    }
    @ManyToOne(cascade = {MERGE,DETACH,REFRESH,PERSIST},fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question question;
}
