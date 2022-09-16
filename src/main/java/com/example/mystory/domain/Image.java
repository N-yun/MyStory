package com.example.mystory.domain;

import javax.persistence.*;

@Entity
@Table(name = "IMAGE")
public class Image {
    @Id
    private long iCode;

    private String iPath;

    private String iName;

    @ManyToOne
    @JoinColumn(name = "pCode")
    private Post pCode;

}
