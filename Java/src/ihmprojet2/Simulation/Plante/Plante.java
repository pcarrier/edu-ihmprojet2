package ihmprojet2.Simulation.Plante;

import ihmprojet2.Simulation.Environnement;

public class Plante extends Object {

    protected boolean germee = false;
    protected boolean vivante = true;
    public static Plante etats[] = new Plante[7];
    protected static Environnement environnement;
    protected double taille = 0;

    public static Plante[] getEtats() throws Exception {
        throw new Exception("Not implemented.");
    }

    public String getDescription() {
        String retour;

        if (!this.vivante) {
            retour = "Morte";
        } else {
            if (taille == 0) {
                retour = "Germée";
            } else {
                retour = "" + taille + "mm";
            }
        }
        return retour;
    }

    public boolean isGermee() {
        return germee;
    }

    public void setGermee(boolean val) {
        germee = val;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double val) {
        taille = val;
        if (val >0){
            this.germee=true;
        }
    }

    public boolean isVivante() {
        return vivante;
    }

    public void setVivante(boolean val) {
        vivante = val;
    }

    public Fruit getFruit() throws Exception {
        throw new UnsupportedOperationException("No implemented method.");
    }

    public static void setEnvironnement(Environnement evt) {
        environnement = evt;
    }

    public Environnement getEnvironnement() {
        return environnement;
    }

    public static void updateEtats() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}