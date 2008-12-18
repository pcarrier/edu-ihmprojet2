
package ihmprojet2.Environnement;


public class Eau {

    private int quantite;


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

    private int durete;
    private Environnement environement;

    public Eau () {
    }

    public int getDurete () {
        return 0;
    }

    public void setDurete (int val) {
    }

    public Environnement getEnvironement () {
        return environement;
    }

    public void setEnvironement (Environnement val) {
        this.environement = val;
    }
}

