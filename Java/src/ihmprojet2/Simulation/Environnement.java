package ihmprojet2.Simulation;

import ihmprojet2.Simulation.Simulation.TypePlante;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Environnement {

    private Eau eau;
    private Terre terre;
    private Climat climat;
    private double tauxArrosage = 0;
    private double qualiteArrosage = 0;
    private double qualiteEnvironnement = 0;
    private double qualiteCroissance = 0;
    public static final String PROP_QUALITECROISSANCE = "qualiteCroissance";
    private TypePlante autrePlante;
    PropertyChangeSupport propertyChangeSupport;

    public Environnement() {
        terre = new Terre();
        climat = new Climat();
        eau = new Eau();
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void setAutrePlante(TypePlante p) {
        autrePlante = p;
    }

    public boolean containsTomatito() {
        return (autrePlante == TypePlante.TOMATITO);
    }

    public Climat getClimat() {
        return climat;
    }

    private void setClimat(Climat climat) {
        this.climat = climat;
    }

    private void setEau(Eau eau) {
        this.eau = eau;
    }

    private void setTerre(Terre terre) {
        this.terre = terre;
    }

    public Eau getEau() {
        return this.eau;
    }

    public Terre getTerre() {
        return this.terre;
    }


    public double getTauxArrosage()
    {
        return tauxArrosage;
    }
    public double getQualiteArrosage()
    {
        return qualiteArrosage;
    }
    public double getQualiteEnvironnement(){
        return qualiteEnvironnement;
    }
    
    public void updateTauxArrosage() {
        tauxArrosage = (eau.getQuantite() * eau.getNbJoursArrosage()) / terre.getQuantite();
    }

    public void updateQualiteArrosage() {
        if (terre.hasEngrais()) {
            qualiteArrosage = tauxArrosage / eau.getDurete().value();
        } else {
            qualiteArrosage = tauxArrosage / (0.9 * eau.getDurete().value());
        }

    }

    public void updateQualiteEnvironnement() {
        qualiteEnvironnement = climat.getTemperature() / climat.getLumiere().value();
    }

    public void updateQualiteCroissance() {
        updateTauxArrosage();
        updateQualiteArrosage();
        updateQualiteEnvironnement();
        setQualiteCroissance(qualiteArrosage * qualiteEnvironnement);
    }

    public double getQualiteCroissance() {
        return qualiteCroissance;
    }

    public void setQualiteCroissance(double val) {
        double old = this.qualiteCroissance;
        this.qualiteCroissance = val;
        propertyChangeSupport.firePropertyChange(PROP_QUALITECROISSANCE, old, val);
    }

    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public class Terre {

        private boolean engrais = false;
        private int quantite = 500;

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) throws Exception {
            if ((quantite < 100) || (quantite > 500)) {
                throw new Exception("La quantité de terre doit etre comprise entre 0 et 500 grammes.");
            }
            this.quantite = quantite;
            updateQualiteCroissance();
        }

        public Terre() {
        }

        public boolean hasEngrais() {
            return engrais;
        }

        public void setEngrais(boolean val) {
            engrais = val;
            updateQualiteCroissance();
        }
    }

    public class Climat {

        private int temperature = 30;
        private DegresLumiere lumiere = DegresLumiere.OBSCURITE;

        public DegresLumiere getLumiere() {
            return lumiere;
        }

        public void setLumiere(DegresLumiere val) throws Exception {
            lumiere = val;
            updateQualiteCroissance();
        }

        public void reduitLumiere() throws Exception {
            switch (this.lumiere) {
                case DIRECTE:
                    this.setLumiere(DegresLumiere.INDIRECTE);
                    break;
                case INDIRECTE:
                    this.setLumiere(DegresLumiere.OBSCURITE);
                    break;
            }
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int val) throws Exception {
            if ((val < 0) || (val > 30)) {
                throw new Exception("La valeur la temperature doit etre comprise entre 0 et 30 degres Celcius");
            } else {
                temperature = val;
                updateQualiteCroissance();
            }
        }

        public void setVraieLumiere(DegresLumiere vraieLumiere) {
            this.lumiere = vraieLumiere;
        }
    }

    public class Eau {

        private int nbJoursArrosage = 7;
        private int quantite = 500;
        private Durete durete = Durete.TRES_DURE;

        public Durete getDurete() {
            return durete;
        }

        public int getQuantite() {
            return quantite;
        }

        public int getNbJoursArrosage() {
            return nbJoursArrosage;
        }

        public void setQuantite(int val) throws Exception {
            if ((quantite < 0) || (quantite > 500)) {
                throw new Exception("La quantité d'eau doit etre comprise entre 0 et 500 ml");
            } else {
                quantite = val;
                updateQualiteCroissance();
            }
        }

        public void setDurete(Durete d) throws Exception {
            durete = d;
            updateQualiteCroissance();
        }

        public void setNbJoursArrosage(int val) throws Exception {
            if ((val < 0) || val > 7) {
                throw new Exception("Le jour de la semaine doit etre compris entre 1 et 7");
            } else {
                this.nbJoursArrosage = val;
                updateQualiteCroissance();
            }
        }
    }
}