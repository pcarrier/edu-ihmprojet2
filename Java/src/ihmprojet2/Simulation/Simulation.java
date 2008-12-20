package ihmprojet2.Simulation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import ihmprojet2.Simulation.Plante.Cacai;
import ihmprojet2.Simulation.Plante.Plante;
import ihmprojet2.Simulation.Plante.Tomatito;

import java.io.Serializable;

public class Simulation implements PropertyChangeListener, Serializable {

    private TypePlante plante1 = TypePlante.SANS;
    private TypePlante plante2 = TypePlante.SANS;
    private Plante[] etatsPlante1;
    private Plante[] etatsPlante2;
    public static final String PROP_ETATSPLANTE2 = "etatsPlante2";

    public TypePlante getPlante1() {
        return plante1;
    }

    public TypePlante getPlante2() {
        return plante2;
    }

    /**
     * Get the value of etatsPlante2
     *
     * @return the value of etatsPlante2
     */
    public Plante[] getEtatsPlante2() {
        return etatsPlante2;
    }

    /**
     * Set the value of etatsPlante2
     *
     * @param etatsPlante2 new value of etatsPlante2
     */
    private void setEtatsPlante2(Plante[] etatsPlante2) {
        Plante[] oldEtatsPlante2 = this.etatsPlante2;
        this.etatsPlante2 = etatsPlante2;
        propertyChangeSupport.firePropertyChange(PROP_ETATSPLANTE2, oldEtatsPlante2, etatsPlante2);
    }
    ;
    public static final String PROP_ETATSPLANTE1 = "etatsPlante1";

    /**
     * Get the value of etatsPlante1
     *
     * @return the value of etatsPlante1
     */
    public Plante[] getEtatsPlante1() {
        return etatsPlante1;   
    }

    /**
     * Set the value of etatsPlante1
     *
     * @param etatsPlante1 new value of etatsPlante1
     */
    private void setEtatsPlante1(Plante[] etatsPlante1) {
        Plante[] oldEtatsPlante1 = this.etatsPlante1;
        this.etatsPlante1 = etatsPlante1;
        propertyChangeSupport.firePropertyChange(PROP_ETATSPLANTE1, oldEtatsPlante1, etatsPlante1);
    }
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    private Environnement environnement;

    public Simulation() {
        environnement = new Environnement();
        environnement.addPropertyChangeListener(this);
    }

    public void setPlante1(TypePlante plante) {
        plante1 = plante;
        System.out.println("Changement de plante obtenu");
        updateEtatsPlante1();
        updateEtatsPlante2();
    }

    public void setPlante2(TypePlante plante) {
        plante2 = plante;
        updateEtatsPlante1();
        updateEtatsPlante2();
    }

    public Environnement getEnvironnment() {
        return environnement;
    }

    public void updateEtatsPlante1() {
        Plante[] retour = new Plante[7];
        switch (plante1) {
            case TOMATITO:
                environnement.setAutreplante(plante2);
                Tomatito.setEnvironnement(environnement);
                try {
                    retour = Tomatito.getEtats();
                } catch (Exception e) {
                }
                break;
            case CACAI:
                environnement.setAutreplante(plante2);
                Cacai.setEnvironnement(environnement);

                try {
                    retour = Cacai.getEtats();
                } catch (Exception e) {
                }
                break;
        }

        setEtatsPlante1(retour);
    }

    public void updateEtatsPlante2() {
        Plante[] retour = new Plante[7];
        environnement.setAutreplante(plante1);
        switch (plante2) {
            case TOMATITO:
                Tomatito.setEnvironnement(environnement);
                try {
                    retour = Tomatito.getEtats();
                } catch (Exception e) {
                }
                break;
            case CACAI:
                Cacai.setEnvironnement(environnement);

                try {
                    retour = Cacai.getEtats();
                } catch (Exception e) {
                }
                break;
        }

        setEtatsPlante2(retour);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("mise a jour de l'etat des plantes");
        updateEtatsPlante1();
        updateEtatsPlante2();
    }

    public enum TypePlante {

        SANS,
        TOMATITO,
        CACAI;
    }
}
