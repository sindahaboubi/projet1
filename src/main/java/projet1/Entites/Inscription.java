package projet1.Entites;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Inscription implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
