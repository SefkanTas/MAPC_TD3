package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

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
}
