package com.example.spring_security_home_work.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "tests")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "test_sequence")
    @SequenceGenerator(name = "test_sequence",sequenceName = "test_seq",allocationSize = 1)
    private Long id;
    private String title;
    private String duration;

    public Test(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }
//    @OneToMany(cascade = {MERGE,DETACH,REFRESH,PERSIST},mappedBy = "test")
//    private List<User>userList;
    @OneToMany(cascade =CascadeType.ALL,mappedBy = "test")
    private List<Question>questionList;
}
