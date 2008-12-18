package ihmprojet2.Environnement;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3D15242E-F80F-BF3E-8E30-EC60B3D5ACEF]
// </editor-fold> 
public class Environnement implements PropertyChangeListener{

    private Eau eau;
    private Terre terre;
    private Climat climat;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35AD697F-9AB8-CFF6-E186-8B924C1A7372]
    // </editor-fold> 
    public Environnement() {
        this.terre = new Terre();
        this.terre.addPropertyChangeListener(new PropertyChangeListener(this);
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

    public Environnement(Eau eau, Terre terre, Climat climat) {
        this.eau = eau;
        this.terre = terre;
        this.climat = climat;
    }

    public void propertyChange(PropertyChangeEvent event){
        if(event.getSource()==terre)
        {
            if (event.getPropertyName().equals("quantite"))
            {
                //TODO
            } else {
                /*
                if {
                }*/
            }
        }
        
    }
}

