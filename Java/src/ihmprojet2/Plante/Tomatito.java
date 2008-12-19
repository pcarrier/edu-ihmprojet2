package ihmprojet2.Plante;


public class Tomatito extends Plante {
    private Fruit fruit;

    public Tomatito () {
        fruit= new Fruit();
    }
    public Fruit getFruit(){
        return fruit;
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

