package ihmprojet2.Simulation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import ihmprojet2.Simulation.Plante.Cacai;
import ihmprojet2.Simulation.Plante.Plante;
import ihmprojet2.Simulation.Plante.Tomatito;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation implements PropertyChangeListener, Serializable {

    private TypePlante plante1 = TypePlante.SANS;
    private TypePlante plante2 = TypePlante.SANS;
    private Plante[] etatsPlante1;
    private Plante[] etatsPlante2;
    public static final String PROP_ETATSPLANTE1 = "etatsPlante1";
    public static final String PROP_ETATSPLANTE2 = "etatsPlante2";
    public Environnement environnement;
    PropertyChangeSupport propertyChangeSupport;

    public Simulation() {
        environnement = new Environnement();
        environnement.addPropertyChangeListener(this);
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public TypePlante getPlante1() {
        return plante1;
    }

    public TypePlante getPlante2() {
        return plante2;
    }

    public Plante[] getEtatsPlante1() {
        return etatsPlante1;
    }

    public Plante[] getEtatsPlante2() {
        return etatsPlante2;
    }

    private void setEtatsPlante1(Plante[] etatsPlante1) {
        this.etatsPlante1 = etatsPlante1;
    }

    private void setEtatsPlante2(Plante[] etatsPlante2) {
        this.etatsPlante2 = etatsPlante2;
    }

    public void setPlante1(TypePlante plante) throws Exception {
        plante1 = plante;
        if (plante == TypePlante.SANS) {
            propertyChangeSupport.firePropertyChange("EtatsPlante1", 0, -1);
        } else {
            updateEtatsPlante1();
            updateEtatsPlante2();
        }
    }

    public void setPlante2(TypePlante plante) throws Exception {
        plante2 =plante;
        
        if (plante == TypePlante.SANS) {
            propertyChangeSupport.firePropertyChange("EtatsPlante2", 0, -2);
        } else {
            updateEtatsPlante1();
            updateEtatsPlante2();
        }
    }

    public Environnement getEnvironnment() {
        return environnement;
    }

    public void updateEtatsPlante1() throws Exception, Exception {
        Plante[] resultat = new Plante[7];
        switch (plante1) {
            case TOMATITO:
                environnement.setAutrePlante(plante2);
                Tomatito.setEnvironnement(environnement);
                resultat = Tomatito.getEtats();

                break;
            case CACAI:
                environnement.setAutrePlante(plante2);
                Cacai.setEnvironnement(environnement);
                resultat = Cacai.getEtats();
                break;
        }
        System.out.println("On va mettre a jour etatsPlante1");
        setEtatsPlante1(resultat);
        System.out.println("AH AH AH " + resultat[0]);
        propertyChangeSupport.firePropertyChange("EtatsPlante1", 0, 1);
    }

    public void updateEtatsPlante2() throws Exception {
        Plante[] resultat = new Plante[7];
        environnement.setAutrePlante(plante1);
        switch (plante2) {
            case TOMATITO:
                Tomatito.setEnvironnement(environnement);
                resultat = Tomatito.getEtats();
                break;
            case CACAI:
                Cacai.setEnvironnement(environnement);
                resultat = Cacai.getEtats();
                break;
        }
        setEtatsPlante2(resultat);
        propertyChangeSupport.firePropertyChange("EtatsPlante2", 0, 2);
    }

    public synchronized void propertyChange(PropertyChangeEvent evt) {
        try {
            updateEtatsPlante1();
            updateEtatsPlante2();
        } catch (Exception ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, "PAAAM", ex);
        }
    }

    public enum TypePlante {

        SANS,
        TOMATITO,
        CACAI;
    }
}