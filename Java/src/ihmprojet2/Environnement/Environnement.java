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
        return this.terre;
    }

    public void updateTauxArrosage() {
        tauxArrosage = (eau.getQuantite() * eau.getNbjourArrosage()) / terre.getQuantite();
    }

    public void updateQualiteArrosage() {
        if (terre.hasEngrais()) {
            qualiteArrosage = tauxArrosage / eau.getDurete().value();
        } else {
            qualiteArrosage = tauxArrosage * 0.9 / eau.getDurete().value();
        }
        
    }

    public void updateQualiteEnvironnement() {
        qualiteEnvironnement = climat.getTemperature() * climat.getLumiere().value();
    }

    public void updateQualiteCroissance() {
        updateTauxArrosage();
        updateQualiteCroissance();
        updateQualiteEnvironnement();
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

        private Boolean engrais=false;
        private int quantite = 150;


        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) throws Exception{
            if((quantite< 100) || (quantite>500)){
            throw new Exception("La quantité de terre doit etre comprise entre 0 " +
                    "et 500 grammes.");
            }
            this.quantite = quantite;
        }

        public Terre() {
        }

        

        public Boolean hasEngrais() {
            return engrais;
        }

        public void setEngrais(Boolean val) {
        }

    }

    public class Climat {

        private int temperature=15;
        private DegresLumiere lumiere=DegresLumiere.DIRECTE;

        public Climat() {
        }

       

        public DegresLumiere getLumiere() {
            return lumiere;
        }

        public void setLumiere(DegresLumiere val) throws Exception {
            switch(val){

                case OBSCURITE:
                case INDIRECTE :
                case DIRECTE:
                    lumiere=val;
                    updateQualiteCroissance();
                default:
                    throw new Exception("La valeur "+val+" n'est pas un degres " +
                            "de lumière valide.");
            }
            
            
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int val) throws Exception{
            if((val<0) || (val>30))
            {
                throw new Exception("La valeur la temperature doit etre comprise" +
                        " entre 0 et 30 degres Celcius");
            }else{
            temperature=val;
            updateQualiteCroissance();
            }
        }
    }

    public class Eau {

        private int nbjourArrosage=3;
        private int quantite=0;
        private Durete durete=Durete.DOUCE;

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
        public void setQuantite(int quantite) throws Exception{
            if((quantite<0)|| (quantite>500))
            {
            throw new Exception("La quantité d'eau doit etre comprise entre 0 " +
                    "et 500 ml");
            }
            this.quantite=quantite;
        }

        public Eau() {
        }

        public Durete getDurete() {
            return durete;
        }

        public void setDurete(Durete d) throws Exception {
            switch(d){
                case TRES_DOUCE:
                case DOUCE:
                case MOY_DURE:
                case DURE:
                case TRES_DURE:
                    durete=d;
                default:
                    throw new Exception("La dureté doit etre unee dureté valide");
            }
            
        }

        


        public int getNbjourArrosage() {
            return nbjourArrosage;
        }

        public void setNbjourArrosage(int val) {
            this.nbjourArrosage = val;
        }
    }
}

