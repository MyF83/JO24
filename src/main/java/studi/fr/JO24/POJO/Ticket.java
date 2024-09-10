package studi.fr.JO24.POJO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Ticket {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto = création de table en plus pour les séquences,  et Identity pas de tables en plus

    private Long Ticket_ID;

    private String Ticket_Sport;

    private Date Ticket_Date;

    private String Ticket_Offer;

    private String Ticket_Place;

    private Float Ticket_Price;
}
