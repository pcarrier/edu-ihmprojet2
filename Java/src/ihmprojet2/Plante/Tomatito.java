package ihmprojet2.Plante;

import ihmprojet2.Simulation.Environnement;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;


public class Tomatito extends Plante {
    private Fruit fruit;


    public static ArrayList getEtats() throws Exception{
        ArrayList etats=new ArrayList(7);
        /*
        etats.add(jour1());
        etats.add(jour2());
        etats.add(jour3());
        etats.add(jour4());
        etats.add(jour5());
        etats.add(jour6());
        etats.add(jour7());
         */
        return etats;
    }


    public Tomatito () {
        fruit= new Fruit();
    }
    public Fruit getFruit(){
        return fruit;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class Fruit extends ihmprojet2.Plante.Fruit {

        private Couleur couleur=Couleur.AUCUNE;

        public Fruit () {
        }

        public Couleur getCouleur () {
            return null;
        }

        public void setCouleur (Couleur val) {
        }

        @Override
        public void setGout(Gout val) throws Exception {
            switch (val) {
                case SUCRE:
                case AMER:
                    this.gout=val;
                    break;
                default:
                    throw new Exception("Le gout " + Gout.getGoutName(val) + "n'est " +
                            "pas autorisé pour Tomatito.");
            }

        }

       @Override
       public java.util.Hashtable getInfos()
        {
            java.util.Hashtable retour = new java.util.Hashtable();
            retour.put("GOUT", this.gout);
            retour.put("COUL", this.couleur);
            return retour;
        }
    }

}

