package com.example.demo.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refe;
    private String login;
    private String password;
    private boolean prof;

    @OneToMany(mappedBy = "utilisateur")
    private List<AnnonceVoiture> voiture;

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", refe=" + refe + ", login=" + login + ", password=" + password + ", prof="
                + prof + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + (prof ? 1231 : 1237);
        result = prime * result + ((refe == null) ? 0 : refe.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Utilisateur other = (Utilisateur) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (prof != other.prof)
            return false;
        if (refe == null) {
            if (other.refe != null)
                return false;
        } else if (!refe.equals(other.refe))
            return false;
        return true;
    }
    public Utilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Utilisateur(Long id, String refe, String login, String password, boolean prof) {
        super();
        this.id = id;
        this.refe = refe;
        this.login = login;
        this.password = password;
        this.prof = prof;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRefe() {
        return refe;
    }
    public void setRefe(String refe) {
        this.refe = refe;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isProf() {
        return prof;
    }
    public void setProf(boolean prof) {
        this.prof = prof;
    }

    public List<AnnonceVoiture> getVoiture() {
        return voiture;
    }

    public void setVoiture(List<AnnonceVoiture> voiture) {
        this.voiture = voiture;
    }
}
