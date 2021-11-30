package fonctionnalites;

import Voiture.Voiture;
import fonctionnalites.DecorateurVoiture;

public class ToitOuvrant extends DecorateurVoiture {

    public ToitOuvrant(Voiture v){
        voiture=v;
    }

    @Override
    public String getLibelle() {
        return voiture.getLibelle()+" Toit ouvrant ";
    }

    @Override
    public int getPrix() {
        return voiture.getPrix()+2000;
    }

    @Override
    public int getPoids() {
        return voiture.getPoids()+10;
    }

    @Override
    public String toString() {
        return "ToitOuvrant{" +
                "voiture=" + voiture +
                '}';
    }
}
