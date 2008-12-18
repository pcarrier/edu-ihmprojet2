
package ihmprojet2.Environnement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A50E0B7C-7161-4E41-CFB0-F02796AB9E5F]
// </editor-fold> 
public class Terre implements java.io.Serializable{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F112A1D2-92B0-1312-FD35-307A19AF497A]
    // </editor-fold> 
    private Boolean engrais;
    private int quantite = 0;
    public static final String PROP_QUANTITE = "quantite";

    /**
     * Get the value of quantite
     *
     * @return the value of quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Set the value of quantite
     *
     * @param quantite new value of quantite
     */
    public void setQuantite(int quantite) {
        int oldQuantite = this.quantite;
        this.quantite = quantite;
        propertyChangeSupport.firePropertyChange(PROP_QUANTITE, oldQuantite, quantite);
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


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1CF8BBA5-170B-DCBD-C339-1C873B4D58CC]
    // </editor-fold> 
    public Terre () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA4D23E1-3B9A-C397-9E78-A43774C1F909]
    // </editor-fold> 
    public Boolean isEngrais () {
        return engrais;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6BFA3C2B-390F-99F3-A363-656AD58B684E]
    // </editor-fold> 
    public void setEngrais (Boolean val) {
        this.engrais = val;
    }

}

