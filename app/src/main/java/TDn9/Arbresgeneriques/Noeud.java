package TDn9.Arbresgeneriques;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable<T>> implements Arbre<T> {

    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre<T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).somme();
        for (int i = 1; i<fils.size(); i++) {
            rtr = rtr.sommer(fils.get(i).somme());
        }
        return rtr;
    }

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).min();
        for (int i = 1; i<fils.size(); i++) {
            T mini = fils.get(i).min();
            if (mini.compareTo(rtr) < 0) {
                rtr = mini;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).max();
        for (int i = 1; i<fils.size(); i++) {
            T maxi = fils.get(i).max();
            if (maxi.compareTo(rtr) > 0) {
                rtr = maxi;
            }
        }
        return rtr;
    }

    @Override
    public boolean estTrie() {
        return false;
    }


}
