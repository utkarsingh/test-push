package com.docster.internal.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "fName")
    private String firstName;

    @Column(name="lName")
    private String lastName;
    @Column(name="email")
    private String email;

    @Column(name = "user_type")
    private String userType;


}
