package com.example.spring_security_home_work.entity;

import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence",sequenceName = "user_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User( String name, String email, String password, Collection<Role> roles) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

//    @ManyToOne(cascade = {MERGE,DETACH,REFRESH,PERSIST})
//    @JoinColumn(name = "test_id")
//    private Test test;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();



    public void setRole(Role role){
         roles.add(role);
    }
}
