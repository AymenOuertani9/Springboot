package com.khouloud.auditapp.Entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Reclamation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@NotNull
    //@CreationTimestamp
    //@Temporal(TemporalType.TIMESTAMP)
    //private Date createTime;

    //@UpdateTimestamp
    //@Temporal(TemporalType.TIMESTAMP)
    //private Date modifiedTime;

    @ManyToOne
    private User user;
    private String username;
    private String reclamation;

    public Reclamation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   // public Date getCreateTime() {
     //   return createTime;
   // }

    //public void setCreateTime(Date createTime) {
      //  this.createTime = createTime;
    //}

    //public Date getModifiedTime() {
      //  return modifiedTime;
    //}

    //public void setModifiedTime(Date modifiedTime) {
      //  this.modifiedTime = modifiedTime;
    //}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReclamation() {
        return reclamation;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
