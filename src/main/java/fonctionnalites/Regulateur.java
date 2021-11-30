package fonctionnalites;

import Voiture.Voiture;
import fonctionnalites.DecorateurVoiture;

public class Regulateur extends DecorateurVoiture {
    public Regulateur(Voiture v) { voiture = v;}
        public String getLibelle() { return voiture+getLibelle() + " fonctionnalites.Regulateur "; }
        public int getPrix() {return voiture.getPrix() + 200;}
        public int getPoids() {return voiture.getPoids() + 1;}

    @Override
    public String toString() {
        return "Regulateur{" +
                "voiture=" + voiture +
                '}';
    }
}
