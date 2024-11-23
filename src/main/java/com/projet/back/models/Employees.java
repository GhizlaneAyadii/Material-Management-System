package com.projet.back.models;
// ici on declare l'entite Employee
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

@Entity
public class Employees implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, length = 20)
    private String nom;
    @Column(nullable = false, length = 20)
    private String prenom;
    @Column(nullable = false, length = 10, unique = true)
    private String cin;
    @Column(nullable = false, length = 80, unique = true)
    private String email;
    @Column(nullable = false, length = 20, unique = true)
    private String Telephone;
    @Column(nullable = false, length = 10)
    private String Bureau;
    @Column(nullable = false, length = 80)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeRole employeeRole;
    @Column(nullable = false, length = 60)
    private String fonction;

    @Column(nullable = true, length = 500)
    private String imageUrl;
    private String datenaissance;
    @Column(nullable = false, length = 60)
    private String adress;
    @Column(nullable = false, length = 60)
    private String ville;
    @Column(nullable = false, length = 60)
    private String codepostal;
    private String rib;
    @Column(nullable = false, length = 60)
    private String banque;
    private String somnumber ;

    public Employees(String nom, String prenom, String cin, String email, String telephone, String bureau, String password, EmployeeRole employeeRole, String fonction,  String imageUrl
    ,String datenaissance,String adress,String ville,String codepostal,String rib,String banque,String somnumber) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.email = email;
        Telephone = telephone;
        Bureau = bureau;
        this.password = password;
        this.employeeRole = employeeRole;
        this.fonction = fonction;
        this.imageUrl = imageUrl;
        this.datenaissance=datenaissance;
        this.adress=adress;
        this.ville=ville;
        this.codepostal=codepostal;
        this.rib=rib;
        this.banque=banque;
        this.somnumber=somnumber;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(employeeRole.name());
        return Collections.singletonList(authority);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getBureau() {
        return Bureau;
    }

    public void setBureau(String bureau) {
        Bureau = bureau;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeRole getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRole employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }



    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getSomnumber() {
        return somnumber;
    }

    public void setSomnumber(String somnumber) {
        this.somnumber = somnumber;
    }
}
