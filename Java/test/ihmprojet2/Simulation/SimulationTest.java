/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Simulation;

import ihmprojet2.Plante.Cacai;
import ihmprojet2.Plante.Plante;
import ihmprojet2.Plante.Tomatito;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jc
 */
public class SimulationTest {

    public SimulationTest() {
    }
   

    /**
     * Test of addPlante method, of class Simulation.
     */
    @Test//(expected=Exception.class)
    public void testAddPlanteNull() throws Exception {
        System.out.println("addPlante with a null parameter.");
        Plante plante = null;
        try {
            Environnement.getInstance().addPlante(plante);
        } catch (Exception e) {
            Environnement.getInstance().viderPlantes();
            throw e;
        }
    }

        @Test
        public void testAddOneCacai
        () throws Exception
        {Cacai plante = new Cacai();
            System.out.println("addPlante with 1 Plante object");
            try {
                
                Environnement.getInstance().addPlante(plante);
            } catch (Exception e) {
                
                throw e;
            }finally{
                Environnement.getInstance().viderPlantes();
            }
        }

    @Test
    public void testAddOneTomatito() throws Exception {
        System.out.println("addPlante with 1 Plante object");
        Tomatito plante = new Tomatito();
        try {
            
            Environnement.getInstance().addPlante(plante);
        } catch (Exception e) {
            throw e;
            }finally{
            Environnement.getInstance().viderPlantes();
            }
    }

    @Test(expected=Exception.class)
    public void testAddThreePlantes() throws Exception {
        System.out.println("addPlante with 3 Plante object");
        Tomatito plante1 = new Tomatito();
        Cacai plante2 = new Cacai();
        Tomatito plante3 = new Tomatito();

        try {
            Environnement.getInstance().addPlante(plante3);
            Environnement.getInstance().addPlante(plante3);
            Environnement.getInstance().addPlante(plante3);
        } catch (Exception e) {
            throw e;
            }finally{
            Environnement.getInstance().viderPlantes();
            }

        
    }

    @Test
    public void testContainsTomatitoTrue() throws Exception {
        System.out.println("Environnement have a tomatito.");
       
        Tomatito plante1 = new Tomatito();
        Cacai plante2 = new Cacai();

        try {
            Environnement.getInstance().addPlante(plante1);
            Environnement.getInstance().addPlante(plante2);
            assertTrue(Environnement.getInstance().containsTomatito());
        } catch (Exception e) {
            throw e;
            }finally{
            Environnement.getInstance().viderPlantes();
            }
    }

    @Test
    public void testContainsTomatitoFalse() throws Exception {
        System.out.println("Environnement doesn't have a tomatito.");
        Cacai plante1 = new Cacai();
        Cacai plante2 = new Cacai();
        try {
            
            Environnement.getInstance().addPlante(plante1);
            Environnement.getInstance().addPlante(plante2);
            assertFalse(Environnement.getInstance().containsTomatito());
        }catch (Exception e) {
            throw e;
            }finally{
            Environnement.getInstance().viderPlantes();
            }
    }

}