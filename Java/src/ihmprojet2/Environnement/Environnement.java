package ihmprojet2.Environnement;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Environnement {

    private Eau eau;
    private Terre terre;
    private Climat climat;

    public Environnement () {
        //this.terre = new Terre();
        this.terre =new Terre(this);
    }

    public Environnement(Eau eau, Terre terre, Climat climat) {
        this.eau = eau;
        this.terre = terre;
        this.climat = climat;

        this.terre.setEnvironement(this);
    }

    private float qualiteArrosage;
    
    public Climat getClimat() {
        return climat;
    }

    public void setClimat(Climat climat) {
        this.climat = climat;
    }

    public void setEau(Eau eau) {
        this.eau = eau;
    }

    public void setTerre(Terre terre) {
        this.terre = terre;
    }

    public Eau getEau() {
        return eau;
    }

    public Terre getTerre() {
        return terre;
    }

    
}

