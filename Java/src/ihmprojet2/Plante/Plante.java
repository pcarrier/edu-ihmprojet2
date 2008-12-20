package ihmprojet2.Plante;

import ihmprojet2.Simulation.Environnement;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;



public class Plante extends Object implements PropertyChangeListener{

    private Boolean germee = false;

    private Boolean vivante = true;

    //protected static Environnement environnement = new Environnement();

    private double taille = 0;
    public static ArrayList getEtats() throws Exception{
        throw new Exception("Not implemented.");
    }

    public Plante () {
    }

    public Boolean isGermee () {
        return null;
    }

    public void setGermee (Boolean val) {
        germee=val;
    }

    public double getTaille () {
        return taille;
    }

    public void setTaille (double val) {
        taille=val;
    }

    public Boolean isVivante () {
        return vivante;
    }

    public void setVivante (Boolean val) {
        vivante=val;
    }

    public Fruit getFruit() throws Exception{
        throw new Exception("No implemented method.");
    }

    public void propertyChange(PropertyChangeEvent evt){
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

