package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Client implements PrePostVisitable, Visitable{

    private String name;
    private Collection<Commande> commandes;

    public Client(String name) {
        this.name = name;
        this.commandes = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
