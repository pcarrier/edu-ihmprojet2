/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Plante;

import ihmprojet2.Simulation.Plante.Plante;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jc
 */
public class PlanteTest {

    public PlanteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testIsGermee() {
        System.out.println("isGermee");
        Plante instance = new Plante();
        Boolean expResult = null;
        Boolean result = instance.isGermee();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testSetGermee() {
        System.out.println("setGermee");
        Boolean val = null;
        Plante instance = new Plante();
        instance.setGermee(val);

    }

    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Plante instance = new Plante();
        double expResult = 0;
        double result = instance.getTaille();
        assertEquals(expResult, result,5);

    }

    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int val = 0;
        Plante instance = new Plante();
        instance.setTaille(val);

    }

    @Test
    public void testIsVivante() {
        System.out.println("isVivante");
        Plante instance = new Plante();
        Boolean expResult = true;
        Boolean result = instance.isVivante();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetVivante() {
        System.out.println("setVivante");
        Boolean val = null;
        Plante instance = new Plante();
        instance.setVivante(val);

    }

}