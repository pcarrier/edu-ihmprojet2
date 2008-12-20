package ihmprojet2.IHM;

public interface JPlant {
    public String getPlanteText();
    public void setPlanteText(String PlanteText);
    public String getFruitText();
    public void setFruitText(String PlanteText);
    public void setFruitIcon(Icon icon);
    public void setPlanteIcon(Icon icon);
    public enum Icon {
        SANS_PLANTE,
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
