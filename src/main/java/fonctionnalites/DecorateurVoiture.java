package fonctionnalites;

import Voiture.Voiture;

public abstract class DecorateurVoiture extends Voiture {
    protected Voiture voiture;
    public abstract String getLibelle();
    public abstract int getPrix();
    public abstract int getPoids();
}
