package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

import java.util.Objects;

public class Commande implements PrePostVisitable, Visitable{

    private String name;

    public Commande(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne ligne){

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
        Commande commande = (Commande) o;
        return Objects.equals(name, commande.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
