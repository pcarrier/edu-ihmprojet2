package ihmprojet2.Simulation.Plante;

public class Fruit {

    protected Gout gout = Gout.AUCUN;
    protected double diametre = 0;
    protected Couleur couleur = Couleur.AUCUNE;

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double val) {
        diametre = val;
    }

    public Gout getGout() {
        return gout;
    }

    public void setGout(Gout val) throws Exception {
        gout = val;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur val) {
        couleur = val;
    }

    public String getDescription() throws Exception {
        throw new Exception("Non implemented method.");
    }

    public java.util.Hashtable getInfos() throws Exception {
        throw new Exception("Non implemented method.");
    }
}
