package visitable;

import visitors.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
