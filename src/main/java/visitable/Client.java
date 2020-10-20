package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

public class Client implements PrePostVisitable, Visitable{


    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
