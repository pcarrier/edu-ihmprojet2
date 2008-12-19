/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Simulation;

import ihmprojet2.Simulation.DegresLumiere;
import ihmprojet2.Simulation.Durete;
import ihmprojet2.Simulation.Environnement.Climat;
import ihmprojet2.Simulation.Environnement.Eau;
import ihmprojet2.Simulation.Environnement.Terre;
import java.beans.PropertyChangeListener;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jc
 */
public class SimulationTest {

    public SimulationTest() {
    }

      public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("test.SimulationTest");
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testGetClimat() {
        System.out.println("getClimat");
        Environnement instance = new Environnement();
        Climat result = instance.getClimat();
        assertTrue(Climat.class.isInstance(result));
    }

    @Test
    public void testSetClimat() {
        System.out.println("setClimat");
        Climat climat = null;
        Environnement instance = new Environnement();
        instance.setClimat(climat);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetEau() {
        System.out.println("setEau");
        Eau eau = null;
        Environnement instance = new Environnement();
        instance.setEau(eau);        
    }

    @Test
    public void testSetTerre() {
        System.out.println("setTerre");
        Terre terre = null;
        Environnement instance = new Environnement();
        instance.setTerre(terre);
    }

    @Test
    public void testGetEau() {
        System.out.println("getEau");
        Environnement instance = new Environnement();
        Eau result = instance.getEau();
        assertTrue(Eau.class.isInstance(result));
    }

    @Test
    public void testGetTerre() {
        System.out.println("getTerre");
        Environnement instance = new Environnement();
        Terre result = instance.getTerre();
        assertTrue(Terre.class.isInstance(result));
    }

    @Test
    public void testUpdateTauxArrosage() {
        System.out.println("updateTauxArrosage");
        Environnement instance = new Environnement();
        instance.updateTauxArrosage();
    }

    
    @Test
    public void testUpdateQualiteArrosage() {
        System.out.println("updateQualiteArrosage");
        Environnement instance = new Environnement();
        instance.updateQualiteArrosage();
    }

    /**
     * Teste updateQualiteEnvironnement
     *
     */
    @Test
    public void testUpdateQualiteEnvironnement() {
        System.out.println("updateQualiteEnvironnement");
        Environnement instance = new Environnement();
        instance.updateQualiteEnvironnement();
    
    }

    @Test
    public void testUpdateQualiteCroissance() {
        System.out.println("updateQualiteCroissance");
        Environnement instance = new Environnement();
        instance.updateQualiteCroissance();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetQualiteCroissance() {
        System.out.println("getQualiteCroissance");
        Environnement instance = new Environnement();
        double expResult = 0.0;
        double result = instance.getQualiteCroissance();
        assertEquals(expResult, result,5);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetQualiteCroissance() {
        System.out.println("setQualiteCroissance");
        double qualiteCroissance = 0.0;
        Environnement instance = new Environnement();
        instance.setQualiteCroissance(qualiteCroissance);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener listener = null;
        Environnement instance = new Environnement();
        instance.addPropertyChangeListener(listener);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        Environnement instance = new Environnement();
        instance.removePropertyChangeListener(listener);
        //fail("The test case is a prototype.");
    }


    /**/
    @Test(expected=Exception.class)
    public void testSetQuantiteTerr() throws Exception {
        Environnement e = new Environnement();
        e.getTerre().setQuantite(1024);
    }

    @Test(expected=Exception.class)
    public void testSetQuantiteEau() throws Exception {
        Environnement e = new Environnement();
        e.getEau().setQuantite(1024);
    }

    @Test
    public void testSetDureteEau() throws Exception {
        Environnement e = new Environnement();
        e.getEau().setDurete(Durete.DURE);
        assertEquals(Durete.DURE,e.getEau().getDurete());
    }

    @Test
    public void testSetNbJourArrosage() throws Exception {
        Environnement e = new Environnement();
        for (int i=0; i<7; i++){
            e.getEau().setNbjourArrosage(i);
        }

    }

    @Test(expected=Exception.class)
    public void testSetNbJourArrosageFail() throws Exception {
        Environnement e = new Environnement();
        e.getEau().setNbjourArrosage(8);
    }


    @Test
    public void testSeDurete() throws Exception {
        Environnement e = new Environnement();
        for(Durete dur: Durete.values()){
            e.getEau().setDurete(dur);
        }

    }



    @Test
    public void testCalculQualiteCroissance() throws Exception {
        Environnement e = new Environnement();
        //Teste toutes les valeur possible des paramètre pour l'eau.
        int nbIter=0;
        for(int nbJ=3; nbJ<7; nbJ++){
            //for(int qE=0; qE<500; qE++){
                int qE=400;
                for(Durete dur: Durete.values()){
                    e.getEau().setNbjourArrosage(nbJ);
                    e.getEau().setDurete(dur);
                    e.getEau().setQuantite(qE);
                    //Teste toutes les valeur possible des paramètre pour la
                    //terre

                    //Teste la quantite
                    //for(int qtT=100;qtT<500;qtT++){
                        int qtT=350;
                        e.getTerre().setQuantite(qtT);

                        //Teste les valeur d'engrais
                        Boolean engrais[]=new Boolean[2];
                        engrais[0]=false;
                        engrais[1]=true;
                        for(int eng=0; eng<2;eng++){
                            e.getTerre().setEngrais(engrais[eng]);

                            //Teste toutes les valeurs de climat

                            //Teste la lumière
                            for(DegresLumiere dl:DegresLumiere.values()){
                                e.getClimat().setLumiere(dl);
                                //Teste les valeurs possibles de temperature
                                //for(int temp=1; temp<=30; temp++){
                                    int temp=15;
                                    e.getClimat().setTemperature(temp);

                                    double tauxArr=qE*nbJ/qtT;
                                    //System.out.println("Qualite Terre : "+qE);
                                    //System.out.println("Nombre de jours : "+nbJ);
                                    //System.out.println("Qte Terr : "+qtT);
                                    double qualiteEnvir=temp/dl.value();

                                    double qualArr=0.0;

                                    if(engrais[eng]==true){
                                        qualArr=tauxArr/dur.value();
                                        //System.out.println("Engrais : "+qualArr);
                                    }
                                    else{
                                        qualArr=tauxArr/0.9*dur.value();
//                                        System.out.println("PAS Engrais : "+qualArr);
//                                        System.out.println("Taux Arr : "+tauxArr);
//                                        System.out.println("Durete : "+dur.value());
                                    }

//                                    System.out.println("QualArr :"+qualArr+"");
//                                    System.out.println("QualEnvir :"+qualiteEnvir+"");
                                    double tauxQualiteCroiss =qualArr*qualiteEnvir;
                                    e.updateQualiteCroissance();

                                    //System.out.println(tauxQualiteCroiss+" "+e.getQualiteCroissance());
                                    nbIter++;
                                    
                                    assertEquals(tauxQualiteCroiss, e.getQualiteCroissance(), 10);
                                //}
                            }
                        }
                    //}
                }
            
            //}
        }
//        System.out.println(nbIter+" Iterations.");
    }
}