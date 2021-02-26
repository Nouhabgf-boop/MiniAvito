package com.example.demo.bean;

import javax.persistence.*;

@Entity
public class AnnonceVoiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String refUser;
    private String title;
    private String description;
    private double montant;
    private String refModel;
    private String refCarburant;
    private int AnneeMiseEnCirculation;

    @ManyToOne
    private Utilisateur utilisateur;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    public String getRefUser() {
        return refUser;
    }

    public void setRefUser(String refUser) {
        this.refUser = refUser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getRefModel() {
        return refModel;
    }

    public void setRefModel(String refModel) {
        this.refModel = refModel;
    }

    public String getRefCarburant() {
        return refCarburant;
    }

    public void setRefCarburant(String refCarburant) {
        this.refCarburant = refCarburant;
    }


    public int getAnneeMiseEnCirculation() {
        return AnneeMiseEnCirculation;
    }

    public void setAnneeMiseEnCirculation(int anneeMiseEnCirculation) {
        AnneeMiseEnCirculation = anneeMiseEnCirculation;
    }

    @Override
    public String toString() {
        return "AnnonceVoiture [id=" + id + ", ref=" + ref + ", refUser=" + refUser + ", title=" + title
                + ", description=" + description + ", montant=" + montant + ", refModel=" + refModel + ", refCarburant="
                + refCarburant + ", AnneeMiseEnCirculation=" + AnneeMiseEnCirculation + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + AnneeMiseEnCirculation;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        long temp;
        temp = Double.doubleToLongBits(montant);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        result = prime * result + ((refCarburant == null) ? 0 : refCarburant.hashCode());
        result = prime * result + ((refModel == null) ? 0 : refModel.hashCode());
        result = prime * result + ((refUser == null) ? 0 : refUser.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
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
        AnnonceVoiture other = (AnnonceVoiture) obj;
        if (AnneeMiseEnCirculation != other.AnneeMiseEnCirculation)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
            return false;
        if (ref == null) {
            if (other.ref != null)
                return false;
        } else if (!ref.equals(other.ref))
            return false;
        if (refCarburant == null) {
            if (other.refCarburant != null)
                return false;
        } else if (!refCarburant.equals(other.refCarburant))
            return false;
        if (refModel == null) {
            if (other.refModel != null)
                return false;
        } else if (!refModel.equals(other.refModel))
            return false;
        if (refUser == null) {
            if (other.refUser != null)
                return false;
        } else if (!refUser.equals(other.refUser))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
    public AnnonceVoiture() {
        super();
        // TODO Auto-generated constructor stub
    }
    public AnnonceVoiture(Long id, String ref, String refUser, String title, String description, double montant,
                          String refModel, String refCarburant, int anneeMiseEnCirculation) {
        super();
        this.id = id;
        this.ref = ref;
        this.refUser = refUser;
        this.title = title;
        this.description = description;
        this.montant = montant;
        this.refModel = refModel;
        this.refCarburant = refCarburant;
        AnneeMiseEnCirculation = anneeMiseEnCirculation;
    }
}
