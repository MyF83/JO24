package studi.fr.JO24.POJO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto = création de table en plus pour les séquences,  et Identity pas de tables en plus
    private Long Card_ID;

    private String Card_Date;



    @ManyToOne
    @JoinColumn(name = "Client_ID")
    private Client Client;

}
