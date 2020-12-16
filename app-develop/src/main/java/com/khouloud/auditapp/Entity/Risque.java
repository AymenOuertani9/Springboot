package com.khouloud.auditapp.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
public class Risque implements Serializable {
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

    private String question;
    private String risque;
    private String reponse;
    private String solution;
    private String interlocuteurcible;
    @ManyToMany
    List<Rapport>rapports;

    public Risque() {
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterlocuteurcible() {
        return interlocuteurcible;
    }

    public void setInterlocuteurcible(String interlocuteurcible) {
        this.interlocuteurcible = interlocuteurcible;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getRisque() {
        return risque;
    }

    public void setRisque(String risque) {
        this.risque = risque;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
