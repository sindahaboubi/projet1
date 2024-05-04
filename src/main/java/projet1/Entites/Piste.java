package projet1.Entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longueur;
    private int pente;
    @ManyToMany(mappedBy = "pistes")
    private Set<Skieur> skieurs;
}
