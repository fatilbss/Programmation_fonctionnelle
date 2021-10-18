package TDn9.Arbresgeneriques;


// définir deux classes, Entier et Chaine, encapsulant respectivement un entier et une
//chaine de caractères, et qui implémentent Sommable (pour 1, 2 et 3 on obtient 6, et pour "a", "b", et
//"c", on obtient "abc")

public class Entier implements Sommable<Entier>{
    private int val;

    public Entier(int valeur) {
        this.val = valeur;
    }

    public int valeur() {
        return val;
    }

    @Override
    public Entier sommer( Entier autre) {
        return new Entier(this.valeur() + autre.valeur());
    }


}
