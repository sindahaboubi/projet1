package projet1.Entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Cours implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;
}
