package com.example.testavcmysql.model;

import jakarta.persistence.*;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="active")
    private Boolean active;


    @Column(name="discipline")
    private String discipline;

    @Column(name="date")
    private Integer date;



    public Client() {
    }
    public Client(String name, String discipline, Boolean active, Integer date) {
        this.name = name;
        this.active = active;
        this.date = date;
        this.discipline = discipline;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
    }

    public String getDiscipline() {
        return discipline;
    }
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
