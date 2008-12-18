package ihmprojet2.Environnement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Environnement {

    private Eau eau;
    private Terre terre;
    private Climat climat;
    private double tauxArrosage;
    private double qualiteArrosage;
    private double qualiteEnvironnement;
    private double qualiteCroissance = 0;
    public static final String PROP_QUALITECROISSANCE = "qualiteCroissance";

    public Environnement() {
        this.terre = new Terre(this);
    }

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

    public void updateTauxArrosage() {
        tauxArrosage = (eau.getQuantite() * eau.getNbjourArrosage()) / terre.getQuantite();
        updateQualiteArrosage();
    }

    public void updateQualiteArrosage() {
        if (terre.hasEngrais()) {
            qualiteArrosage = tauxArrosage / eau.getDurete();
        } else {
            qualiteArrosage = tauxArrosage * 0.9 / eau.getDurete();
        }
        updateQualiteCroissance();
    }

    public void updateQualiteEnvironnement() {
        qualiteEnvironnement = climat.getTemperature() * climat.getLumiere();
        updateQualiteCroissance();
    }

    public void updateQualiteCroissance() {
        setQualiteCroissance(qualiteArrosage * qualiteEnvironnement);
    }

    /**
     * Get the value of qualiteCroissance
     *
     * @return the value of qualiteCroissance
     */
    public double getQualiteCroissance() {
        return qualiteCroissance;
    }

    /**
     * Set the value of qualiteCroissance
     *
     * @param qualiteCroissance new value of qualiteCroissance
     */
    public void setQualiteCroissance(double qualiteCroissance) {
        double oldQualiteCroissance = this.qualiteCroissance;
        this.qualiteCroissance = qualiteCroissance;
        propertyChangeSupport.firePropertyChange(PROP_QUALITECROISSANCE, oldQualiteCroissance, qualiteCroissance);
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

    public class Terre {

        private Boolean engrais;
        private int quantite = 0;
        private Environnement environement;

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public Terre() {
        }

        public Terre(Environnement e) {
            this.environement = e;
        }

        public Boolean hasEngrais() {
            return engrais;
        }

        public void setEngrais(Boolean val) {
        }

        public void setEnvironnement(Environnement evt) {
            this.environement = evt;
        }

        public Environnement getEnvironnement() {
            return environement;
        }
    }

    public class Climat {

        private Environnement environnement;
        private int temperature;
        private int lumiere;

        public Climat() {
        }

        public Climat(Environnement evt) {
            environnement = evt;
        }

        public int getLumiere() {
            return 0;
        }

        public void setLumiere(int val) {
        }

        public int getTemperature() {
            return 0;
        }

        public void setTemperature(int val) {
            environnement.updateQualiteEnvironnement();
        }
    }

    public class Eau {

        private int nbjourArrosage;
        private int quantite;
        private int durete;
        private Environnement environnement;

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

        }

        public Eau() {
        }

        public int getDurete() {
            return 0;
        }

        public void setDurete(int val) {
        }

        public Environnement getEnvironnement() {
            return environnement;
        }

        public void setEnvironnement(Environnement val) {
            this.environnement = val;
        }

        public Eau(Environnement environement) {
        }

        public int getNbjourArrosage() {
            return nbjourArrosage;
        }

        public void setNbjourArrosage(int val) {
            this.nbjourArrosage = val;
        }
    }
}

