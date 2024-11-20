package tn.enig.model;



import javax.persistence.*;
import java.util.List;

@Entity
public class Adherant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Identifiant auto-g�n�r�
    private Long id;

    private String nom;
    private String prenom;

    
    @OneToMany(mappedBy = "adherant") 
    private List<Emprunt> emprunts;


    public Adherant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Adherant{" +
               "id=" + id +
               ", nom='" + nom + '\'' +
               ", prenom='" + prenom + '\'' +
               '}';
    }
}
