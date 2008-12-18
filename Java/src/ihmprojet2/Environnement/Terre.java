
package ihmprojet2.Environnement;

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

    public Terre () {
    }
    public Terre(Environnement e){
        this.environement=e;
    }

    public Boolean isEngrais () {
        return null;
    }

    public void setEngrais (Boolean val) {
    }

    public void setEnvironement(Environnement evt){
        this.environement=evt;
    }

}

