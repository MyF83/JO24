package studi.fr.JO24.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Client {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto = création de table en plus pour les séquences,  et Identity pas de tables en plus

    private Long Client_ID;

    private String Client_Firstname;

    private String Client_Lastname;

    private String Client_Phone;

    private String Client_Email;

    private String Client_Password;


    // Un client dispose de zero, d'un panier ou plusieurs paniers --> Liste de paniers

    @OneToMany(mappedBy = "Card")
    private Set<Card> Client_Set = new HashSet<>();


}
