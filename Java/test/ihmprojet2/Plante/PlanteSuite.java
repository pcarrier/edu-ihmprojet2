/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Plante;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jc
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ihmprojet2.Plante.PlanteTest.class,ihmprojet2.Plante.FruitTest.class})
public class PlanteSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}