/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmprojet2.IHM;

/**
 *
 * @author gcarrier
 */
public interface JPlant {
    public String getPlanteText();
    public void setPlanteText(String PlanteText);
    public String getFruitText();
    public void setFruitText(String PlanteText);
    public void setFruitIcon(Icon icon);
    public void setPlanteIcon(Icon icon);
    public enum Icon {
        GRAINE,
        CACAI_MORTE,
        CACAI_VIVANTE,
        TOMATITO_MORTE,
        TOMATITO_MORTE1,
        TOMATITO_VIVANTE,
        SANS_FRUIT,
        CACAI_AMER,
        CACAI_SUCRE,
        TOMATITO_MARRON,
        TOMATITO_ROUGE,
        TOMATITO_VERT;
    }
}
