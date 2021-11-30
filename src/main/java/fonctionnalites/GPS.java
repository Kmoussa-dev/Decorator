package fonctionnalites;

import Voiture.Voiture;
import fonctionnalites.DecorateurVoiture;

public class GPS extends DecorateurVoiture {
    public GPS(Voiture v) { voiture = v;}
        public String getLibelle() { return voiture+getLibelle() + " fonctionnalites.GPS "; }
        public int getPrix() {return voiture.getPrix() + 1000;}
        public int getPoids() {return voiture.getPoids() + 20;}
    }
