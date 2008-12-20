package ihmprojet2.Simulation.Plante;

import ihmprojet2.Simulation.Environnement;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Plante extends Object implements PropertyChangeListener {

    private Boolean germee = false;
    private Boolean vivante = true;
    public static Plante etats[] = new Plante[7];
    protected static Environnement environnement = new Environnement();
    private double taille = 0;

    public static Plante[] getEtats() throws Exception {
        throw new Exception("Not implemented.");
    }

    public Plante() {
    }

    public String getDescription() {
        String  retour;

        if( !this.vivante){
            retour ="Morte";
        }else{
         if(taille==0){
         retour="Germée";
         }else{
            retour=taille+"mm";
         }
        }
        return retour;
    }

    public Boolean isGermee() {
        return null;
    }

    public void setGermee(Boolean val) {
        germee = val;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double val) {
        taille = val;
    }

    public Boolean isVivante() {
        return vivante;
    }

    public void setVivante(Boolean val) {
        vivante = val;
    }


    public Fruit getFruit() throws Exception {
        throw new UnsupportedOperationException("No implemented method.");
    }

    public static void setEnvironnement(Environnement evt) {
        environnement = evt;
    }

    public Environnement  getEnvironnement() {
        return environnement ;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList Etats() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void updateEtats() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");


    }
}

