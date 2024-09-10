package studi.fr.JO24.POJO.COMPOSITE;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import studi.fr.JO24.POJO.Client;
import studi.fr.JO24.POJO.Ticket;

@Embeddable
public class CommandID {

@ManyToOne
    private Client Client_ID;

@ManyToMany
    private Ticket Ticket_ID;
}
