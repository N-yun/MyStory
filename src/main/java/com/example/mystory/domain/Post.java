package com.example.mystory.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "POST")
public class Post {

    @Id
    private long pCode;

    @Column(length = 1000)
    private String pContent;

    private LocalDateTime pUpload;

    @Column(length = 500)
    private String pAddress;

    private float pLongitude; //경도

    private float pLatitude; //위도

    @ManyToOne
    @JoinColumn(name = "mCode")
    private Member mCode;

    @ManyToOne
    @JoinColumn(name = "lCode")
    private Location lCode;






}
