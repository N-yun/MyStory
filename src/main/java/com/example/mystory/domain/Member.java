package com.example.mystory.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    long mCode;

    @Column(length = 40)
    String mId;

    @Column(length = 100)
    String mPassword;

    String mNick;


}
