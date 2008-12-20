/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Simulation;

import ihmprojet2.Simulation.Plante.Plante;



/**
 *
 * @author jc
 */
public class Simulation {

    /** L'instance statique */
    private static Simulation instance;

    public static Simulation getInstance() {
        if (null == instance) { // Premier appel
            instance = new Simulation();
        }
        return instance;
    }


  //  private Environnement environnement = new Environnement();
    private Simulation(){

    }
    
    public void addPlante(Plante plante)throws Exception{
        Environnement.getInstance().addPlante(plante);
        Environnement.getInstance().addPropertyChangeListener(plante);
    }

    public Plante[][] getEtats()
    {
        Plante[][] retour = new Plante[2][7];
        return retour;
        
    }
}
