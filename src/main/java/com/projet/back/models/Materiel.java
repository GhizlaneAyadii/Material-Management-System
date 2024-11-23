package com.projet.back.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "materiel")
public class Materiel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numInventaire;
    private String type;
    private Date dateAcquisition;
    private Date dateAffectation;

    // Nouveaux attributs ajoutés
    private String responsable; // responsable moral ou physique
    private Date dateAffectationResponsable; // date d’affectation au responsable
    private String fournisseur; // fournisseur

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employees employee;

    // Constructeurs, getters et setters restent inchangés...

    // Nouveaux getters et setters pour les nouveaux attributs
    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getDateAffectationResponsable() {
        return this.dateAffectationResponsable;
    }

    public void setDateAffectationResponsable(Date dateAffectationResponsable) {
        this.dateAffectationResponsable = dateAffectationResponsable;
    }

    public String getFournisseur() {
        return this.fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    // Nouvelles méthodes pour setter les nouveaux attributs
    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    // Nouveaux getters pour les attributs existants
    public String getNumInventaire() {
        return this.numInventaire;
    }

    public void setNumInventaire(String numInventaire) {
        this.numInventaire = numInventaire;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateAcquisition() {
        return this.dateAcquisition;
    }

    public void setDateAcquisition(Date dateAcquisition) {
        this.dateAcquisition = dateAcquisition;
    }

    public Date getDateAffectation() {
        return this.dateAffectation;
    }

    public Long getId() {
        return this.id;
    }
}
