
package ihmprojet2.Environnement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8916055B-BDE0-3194-413B-22E44F3060B0]
// </editor-fold> 
public class Eau {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DFF7950F-EE98-7C29-8F3C-CE238467204E]
    // </editor-fold> 
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
    // #[regen=yes,id=DCE.8B746D6A-4643-35FB-45F2-248FB519F88D]
    // </editor-fold> 
    private int durete;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.006FFD70-1D8E-B4FB-894D-67DEE3C0C536]
    // </editor-fold> 
    public Eau () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0645CB39-4F41-0719-AEB8-E14BE74C02A1]
    // </editor-fold> 
    public int getDurete () {
        return durete;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BD6F19DA-0B08-96C7-862E-FB6BD0C87D2C]
    // </editor-fold> 
    public void setDurete (int val) {
        this.durete = val;
    }
}

