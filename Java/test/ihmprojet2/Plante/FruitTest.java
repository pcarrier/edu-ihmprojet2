/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Plante;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jc
 */
public class FruitTest {

    public FruitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testGetGout() {
        System.out.println("getGout");
        Fruit instance = new Fruit();
        Gout expResult = Gout.AUCUN;
        Gout result = instance.getGout();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGoutFruitCacai() {
        System.out.println("getGout");
        Cacai instance = new Cacai();
        Gout expResult = Gout.AUCUN;
        Gout result = instance.getFruit().getGout();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGoutFruitTomatito() {
        System.out.println("getGout");
        Tomatito instance = new Tomatito();
        Gout expResult = Gout.AUCUN;
        Gout result = instance.getFruit().getGout();
        assertEquals(expResult, result);
    }


    @Test(expected=Exception.class)
    public void testSetGoutFruitTomatito() throws Exception {
        System.out.println("setGout");
        Gout val = null;
        Tomatito instance = new Tomatito();
        instance.getFruit().setGout(val);
    }

     @Test(expected=Exception.class)
    public void testSetGoutFruitTomatito2() throws Exception {
        System.out.println("setGout");
        Gout val = Gout.ACIDULE;
        Tomatito instance = new Tomatito();
        instance.getFruit().setGout(val);
    }

    @Test
    public void testSetGoutFruitTomatito3() throws Exception {
        System.out.println("setGout");
        Gout val = Gout.AMER;
        Tomatito instance = new Tomatito();
        instance.getFruit().setGout(val);
    }

    @Test(expected=Exception.class)
    public void testSetGoutFruitCacai() throws Exception {
        System.out.println("setGout");
        Gout val = null;
        Cacai instance = new Cacai();
        instance.getFruit().setGout(val);
    }

    @Test(expected=Exception.class)
    public void testSetGoutFruitCacai2() throws Exception {
        System.out.println("setGout");
        Gout val = Gout.SUCRE;
        Cacai instance = new Cacai();
        instance.getFruit().setGout(val);
    }

    @Test
    public void testSetGoutFruitCacai3() throws Exception {
        System.out.println("setGout");
        Gout val = Gout.AMER;
        Cacai instance = new Cacai();
        instance.getFruit().setGout(val);
    }

    @Test
    public void testCacaiGetInfos1() throws Exception {
        System.out.println("getInfos");
        Cacai instance = new Cacai();
     
        Gout expResult=Gout.AUCUN;

        java.util.Hashtable result = instance.getFruit().getInfos();
        assertEquals(expResult, result.get("GOUT"));
    }

    @Test
    public void testCacaiGetInfos2() throws Exception {
        System.out.println("getInfos");
        Cacai instance = new Cacai();
        String expResult="0.0";
        java.util.Hashtable result = instance.getFruit().getInfos();
        assertEquals(expResult, result.get("DIAM"));
    }


    @Test
    public void testTomatitoGetInfos1() throws Exception {
        System.out.println("getInfos");
        Tomatito instance = new Tomatito();
        Gout expResultGout = Gout.AUCUN;
        java.util.Hashtable result = instance.getFruit().getInfos();
        assertEquals(expResultGout, result.get("GOUT"));
    }

     @Test
    public void testTomatitoGetInfos2() throws Exception {
        System.out.println("getInfos");
        Tomatito instance = new Tomatito();
        Couleur expResultCoul= Couleur.AUCUNE;
        java.util.Hashtable result = instance.getFruit().getInfos();
        assertEquals(expResultCoul, result.get("COUL"));
    }


}