package ihmprojet2.Simulation.Plante;


public enum Couleur {
AUCUNE,
    VERT,

    ROUGE,

    MARRON;


    public static String getCouleurName(Couleur c){
    String nomCoul = new String();
            switch(c){
                case AUCUNE:
                    nomCoul="-";
                    break;
                case VERT:
                    nomCoul="vert";
                    break;
                case ROUGE:
                    nomCoul="rouge";
                    break;
                case MARRON:
                    nomCoul="marron";
                    break;
            }
             return nomCoul;
    }
}

