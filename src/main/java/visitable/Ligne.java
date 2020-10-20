package visitable;

import visitors.PrePostVisitor;
import visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;
    private int sum;

    public Ligne(String name, int sum) {
        this(name);
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public Ligne(String name) {
        this.name = name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
