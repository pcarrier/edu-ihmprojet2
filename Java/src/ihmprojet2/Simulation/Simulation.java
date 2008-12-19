/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Simulation;

import ihmprojet2.Plante.Plante;

/**
 *
 * @author jc
 */
public class Simulation {
    public Simulation(){

    }

    
    public void setEnvironnement(Environnement environnement) {
        this.environnement = environnement;
    }

    public void setPlantes(Plante[] plantes) {
        this.plantes = plantes;
    }
    private Environnement environnement;

    public Environnement getEnvironnement() {
        return environnement;
    }

    public Plante[] getPlantes() {
        return plantes;
    }
    private Plante[] plantes;


   

}
