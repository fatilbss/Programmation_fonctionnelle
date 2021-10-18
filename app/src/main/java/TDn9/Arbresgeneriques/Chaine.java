package TDn9.Arbresgeneriques;

// définir deux classes, Entier et Chaine, encapsulant respectivement un entier et une
//chaine de caractères, et qui implémentent Sommable (pour 1, 2 et 3 on obtient 6, et pour "a", "b", et
//"c", on obtient "abc")

public class Chaine implements Sommable<Chaine>{
    private String valeur;
    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    public String valeur() {
        return valeur;
    }


    @Override
    public Chaine sommer(Chaine autre) {
        return new Chaine(String.format("%s%s", this.valeur(), autre.valeur()));

    }
}
