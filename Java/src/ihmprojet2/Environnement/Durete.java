/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.Environnement;

/**
 *
 * @author jc
 */
public enum Durete {
    TRES_DOUCE (1),
    DOUCE (2),
    MOY_DURE (3),
    DURE (4),
    TRES_DURE (5);

    private int value;
    Durete(int d)
    {
        value=d;
    }

    int value(){
        return value;
    }
}
