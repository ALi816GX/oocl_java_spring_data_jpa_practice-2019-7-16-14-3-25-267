package com.tw.apistackbase.core;


import lombok.Data;

import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

}
