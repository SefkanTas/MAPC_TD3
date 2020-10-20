package visitors;

import visitable.Client;
import visitable.Commande;
import visitable.GroupeClient;
import visitable.Ligne;

public interface Visitor extends AbstractVisitor {
    void visit(GroupeClient groupeClient);
    void visit(Client client);
    void visit(Commande commande);
    void visit(Ligne ligne);
}
