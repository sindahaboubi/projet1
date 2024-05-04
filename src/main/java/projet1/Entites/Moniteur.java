package projet1.Entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Moniteur implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
    @OneToMany
    private Set<Cours> cours;
}
