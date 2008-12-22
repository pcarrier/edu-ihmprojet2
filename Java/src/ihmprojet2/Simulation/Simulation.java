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
        if (plante != TypePlante.SANS) {
            updateEtatsPlante1();
            updateEtatsPlante2();
        }
        propertyChangeSupport.firePropertyChange(PROP_ETATSPLANTE1, 0, -2);
    }

    public void setPlante2(TypePlante plante) throws Exception {
        plante2 = plante;

        if (plante != TypePlante.SANS) {
            updateEtatsPlante1();
            updateEtatsPlante2();
        }
        propertyChangeSupport.firePropertyChange(PROP_ETATSPLANTE2, 0, -2);
    }

    public Environnement getEnvironnment() {
        return environnement;
    }

    public void updateEtatsPlante1() throws Exception, Exception {
        Plante[] resultat = new Plante[7];
        environnement.setAutrePlante(plante2);
        switch (plante1) {
            case TOMATITO:
                Tomatito.setEnvironnement(environnement);
                resultat = Tomatito.getEtats().clone();
                break;
            case CACAI:
                Cacai.setEnvironnement(environnement);
                resultat = Cacai.getEtats().clone();
                break;
        }
        setEtatsPlante1(resultat);
    }

    public void updateEtatsPlante2() throws Exception {
        System.out.println("update etat plante 2");
        Plante[] resultat = new Plante[7];
        environnement.setAutrePlante(plante1);
        switch (plante2) {
            case TOMATITO:
                System.out.println("Tomatito");
                Tomatito.setEnvironnement(environnement);
                resultat = Tomatito.getEtats().clone();
                break;
            case CACAI:
                System.out.println("Cacai");
                Cacai.setEnvironnement(environnement);
                resultat = Cacai.getEtats().clone();
                break;
        }
        setEtatsPlante2(resultat);
    }

    public synchronized void propertyChange(PropertyChangeEvent evt) {
        try {
            if ((plante1 == TypePlante.CACAI) && (plante2 == TypePlante.TOMATITO)) {
                environnement.getClimat().reduitLumiere();
                updateEtatsPlante1();
                environnement.getClimat().augmenteLumiere();
                updateEtatsPlante2();
            } else {
                if ((plante1 == TypePlante.TOMATITO) && (plante2 == TypePlante.CACAI)) {
                    environnement.getClimat().reduitLumiere();
                    updateEtatsPlante2();
                    environnement.getClimat().augmenteLumiere();
                    updateEtatsPlante1();
                } else {
                    updateEtatsPlante1();
                    updateEtatsPlante2();
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, "PAAAM", ex);
        }
        propertyChangeSupport.firePropertyChange("tout", 0, 1);
    }

    public String getplante1LumiereDescription() throws Exception {
        DegresLumiere d = environnement.getClimat().getLumiere();
        boolean reduit = ((plante1 == TypePlante.CACAI) && (plante2 == TypePlante.TOMATITO));
                
        switch (d) {
            case DIRECTE:
                return reduit ? "indirecte" : "directe";
            case INDIRECTE:
                return reduit ? "obscurité" : "indirecte";
            case OBSCURITE:
                return "obscurité";
            default:
                return "indéterminée";

        }
    }

    public String getplante2LumiereDescription() throws Exception {
        DegresLumiere d = environnement.getClimat().getLumiere();
        boolean reduit = ((plante2 == TypePlante.CACAI) && (plante1 == TypePlante.TOMATITO));
        switch (d) {
            case DIRECTE:
                return reduit ? "indirecte" : "directe";
            case INDIRECTE:
                return reduit ? "obscurité" : "indirecte";
            case OBSCURITE:
                return "obscurité";
            default:
                return "indéterminée";

        }
    }

    public enum TypePlante {

        SANS,
        TOMATITO,
        CACAI;
    }
}