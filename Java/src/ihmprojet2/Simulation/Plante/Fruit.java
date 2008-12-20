package ihmprojet2.Simulation.Plante;

public class Fruit {

    protected Gout gout = Gout.AUCUN;
    protected String goutName;

    public Fruit() {
    }

    public Gout getGout() {
        return gout;
    }

    public void setGout(Gout val) throws Exception {
        Gout newGout = val;

        if (val == null) {
            newGout = Gout.AUCUN;
        }
        gout = newGout;

    }

    public Couleur getCouleur() throws Exception {
        throw new Exception("Non implemented method.");
    }

    public void setCouleur(Couleur couleur) throws Exception {
        throw new Exception("Non implemented method.");
    }

        public String getDescription() throws Exception {
        throw new Exception("Non implemented method.");
    }


    public java.util.Hashtable getInfos() throws Exception {
        throw new Exception("Non implemented method.");
    }
}
