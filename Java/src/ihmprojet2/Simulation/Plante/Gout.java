package ihmprojet2.Simulation.Plante;


public enum Gout {

    AUCUN(0),
    AMER(1),

    FADE(2),

    ACIDULE(3),

    SUCRE(4);

    private int value;
    Gout(int value){
        this.value=value;
    }

    public int value(){
        return this.value;
    }

    public static String getGoutName(Gout g){
    String nomGout = new String();
            switch(g){
                case AUCUN:
                    nomGout="Aucun";
                    break;
                case AMER:
                    nomGout="Amer";
                    break;
                case SUCRE:
                    nomGout="Sucré";
                    break;
                case ACIDULE:
                    nomGout="Acidulé";
                    break;
                case FADE:
                    nomGout="Fade";
                    break;
            }
             return nomGout;
    }

}

