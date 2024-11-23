package com.projet.back.models;
// ici on declare l'entite Fourniture
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Fourniture implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            nullable = false,
            updatable = false
    )
    private long id;
    private String type;
    private int nombre;
    private String fournisseur;

    public Fourniture() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long idFourniture) {
        this.id = idFourniture;
    }

    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getFournisseur() {
        return this.fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public int getNombre() {
        return this.nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Fourniture{id=" + this.id + ", type='" + this.type + "', nombre=" + this.nombre + ", fournisseur=" + this.fournisseur +"}";
    }

}
