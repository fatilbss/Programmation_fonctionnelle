package TDn9.Arbresgeneriques;

public interface Sommable {
        T sommer(final T autre);
        T zero();
}

// définir une interface Sommable caractérisant les objets pouvant être sommés : ils ont
//une opération sommer qui prend un objet du même type qu’eux et renvoit leur somme, qui est un
//objet du même type.
