package com.example.mystory.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LOCATION")
@Getter
@Setter
public class Location {

    @Id
    private long lCode;

    private String lArea;

    @ManyToOne
    @JoinColumn(name = "parLCode")
    @JsonManagedReference
    private Location parLCode;

    @OneToMany(mappedBy = "parLCode")
    @JsonBackReference
    private List<Location> chLCode;
}
