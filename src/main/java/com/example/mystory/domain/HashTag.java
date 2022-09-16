package com.example.mystory.domain;


import javax.persistence.*;

@Entity
@Table(name = "HashTag")
public class HashTag {

    @Id
    private long hCode;

    @Column(length = 300)
    private  String hName;

    @ManyToOne
    @JoinColumn(name = "pCode")
    private Post pCode;
}
