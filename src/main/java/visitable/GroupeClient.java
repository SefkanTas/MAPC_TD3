package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

import java.util.Collection;

public class GroupeClient implements PrePostVisitable, Visitable {

    private String name;
    private Collection<Client> clients;

    public GroupeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void addClient(Client client){

    }

    public void addCommande(String clientName, Commande commande){

    }

    public void addLigne(String clientName, String commandeName, Ligne ligne){

    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
