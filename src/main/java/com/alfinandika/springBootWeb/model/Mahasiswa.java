package com.alfinandika.springBootWeb.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mahasiswa {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String username;

    private String name;

    @Column(name = "join_date")
    private Date joinDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
