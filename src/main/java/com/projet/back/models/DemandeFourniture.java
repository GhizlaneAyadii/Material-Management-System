package com.projet.back.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class DemandeFourniture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private int nombre;
    private String fournisseur;

    private Date dateCreation;
    private int etat;

    @OneToOne
    private Fourniture fourniture;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employees employee;

    public int getEtat() {
        return this.etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public DemandeFourniture() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Fourniture getFourniture() {
        return this.fourniture;
    }

    public void setFourniture(Fourniture fourniture) {
        this.fourniture = fourniture;
    }

    public Employees getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }
}
