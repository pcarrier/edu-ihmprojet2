package ihmprojet2.Simulation.Plante;

public enum Gout {

    AUCUN(0),
    AMER(1),
    FADE(2),
    ACIDULE(3),
    SUCRE(4);
    private int value;

    Gout(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public static String getGoutName(Gout g) {
        String nomGout = new String();
        switch (g) {
            case AUCUN:
                nomGout = "-";
                break;
            case AMER:
                nomGout = "amer";
                break;
            case SUCRE:
                nomGout = "sucré";
                break;
            case ACIDULE:
                nomGout = "acidulé";
                break;
            case FADE:
                nomGout = "fade";
                break;
        }
        return nomGout;
    }
}

