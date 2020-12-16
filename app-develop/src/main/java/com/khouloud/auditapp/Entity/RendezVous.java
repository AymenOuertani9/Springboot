package com.khouloud.auditapp.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


@Entity
public class RendezVous implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedTime;

    private String lieu;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date  date ;
    private Time heurededebut;
    private Time heuredefin;
    @ManyToOne
    private User user;
    public RendezVous() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public Time getHeurededebut() {
        return heurededebut;
    }

    public void setHeurededebut(Time heurededebut) {
        this.heurededebut = heurededebut;
    }

    public Time getHeuredefin() {
        return heuredefin;
    }

    public void setHeuredefin(Time heuredefin) {
        this.heuredefin = heuredefin;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
