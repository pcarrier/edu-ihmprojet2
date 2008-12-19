package ihmprojet2.Plante;


public class Cacai extends Plante {
    private Fruit fruit=null;
    public Cacai () {
        fruit = new Fruit();

    }

    @Override
    public Cacai.Fruit getFruit(){
        return this.fruit;
        }

    public class Fruit extends ihmprojet2.Plante.Fruit {

        private int diametre = 0;

        public Fruit () {
        }

        public int getDiametre () {
            return diametre;
        }

        public void setDiametre (int val) {
            diametre=val;
        }

        
        @Override
        public void setGout(Gout val) throws Exception {
            switch (val) {
                case FADE:
                case AMER:
                case ACIDULE:
                    super.setGout(val);
                    break;
                default:
                    throw new Exception("Le gout " + Gout.getGoutName(val) + "n'est " +
                            "pas autorisé pour Cacai.");
            }

        }

         @Override
         public java.util.Hashtable getInfos(){
                java.util.Hashtable retour = new java.util.Hashtable();
                retour.put("GOUT", this.gout);
                retour.put("DIAM", ""+this.diametre);
                //retour.put("couleur", ""+null);

             return retour;
        }
    }
}

