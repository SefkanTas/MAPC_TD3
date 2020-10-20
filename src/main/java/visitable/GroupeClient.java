package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class GroupeClient implements PrePostVisitable, Visitable {

    private String name;
    private Collection<Client> clients;

    public GroupeClient(String name) {
        this.name = name;
        clients = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public void addCommande(String clientName, Commande commande){
        //todo : refaire proprement
        for(Client client : clients){
            if(client.getName().equals(clientName)){
                client.getCommandes().add(commande);
            }
        }
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
