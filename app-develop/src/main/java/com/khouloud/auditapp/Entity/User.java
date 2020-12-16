package com.khouloud.auditapp.Entity;

import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@Entity
@Table(name = "user")
public class User  implements Serializable {
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

    @Column(unique = true)
    private String username;

    private String secteur;

    private int nombreanee;

    private boolean enabled;

    private String logo;

    @JsonIgnore
    private String password;

    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> role = new ArrayList<>();

    @OneToMany
    private Collection<RendezVous> rendezVousCollection;

    @OneToMany
    private Collection<Reclamation> reclamations;
    @OneToMany
    private Collection<Evaluation> evaluationCollection ;

    public User() {
    }

    public Collection<Evaluation> getEvaluationCollection() {
        return evaluationCollection;
    }

    public Collection<RendezVous> getRendezVousCollection() {
        return rendezVousCollection;
    }

    public void setRendezVousCollection(Collection<RendezVous> rendezVousCollection) {
        this.rendezVousCollection = rendezVousCollection;
    }

    public void setEvaluationCollection(Collection<Evaluation> evaluationCollection) {
        this.evaluationCollection = evaluationCollection;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getNombreanee() {
        return nombreanee;
    }

    public void setNombreanee( int nombreanee) {
        this.nombreanee = nombreanee;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Collection<Role> getRole() {
        return role;
    }

    public void setRole(Collection<Role> role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<RendezVous> getRendezVouzCollection() {
        return rendezVousCollection;
    }

    public void setRendezVouzCollection(Collection<RendezVous> rendezVousCollection) {
        this.rendezVousCollection = rendezVousCollection;
    }

    public Collection<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(Collection<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }



    public User(String email, String username, String secteur ,  boolean enabled , Collection<Role> role , Collection<Evaluation> evaluationCollection ,String logo,int nombreanee,Collection<Reclamation> reclamations) {
        this.createTime = createTime;
        this.email = email;
        this.enabled = enabled;
        this.role = role;
        this.username = username;
        this.secteur = secteur;
        this.logo = logo;
        this.nombreanee = nombreanee;
        this.evaluationCollection = evaluationCollection;
        this.reclamations = reclamations;

    }
}
