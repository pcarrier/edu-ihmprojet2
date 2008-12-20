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
                    nomCoul="Aucune";
                    break;
                case VERT:
                    nomCoul="Vert";
                    break;
                case ROUGE:
                    nomCoul="Rouge";
                    break;
                case MARRON:
                    nomCoul="Marron";
                    break;
            }
             return nomCoul;
    }
}

