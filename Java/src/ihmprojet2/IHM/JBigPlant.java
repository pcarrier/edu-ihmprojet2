package ihmprojet2.IHM;

public class JBigPlant extends javax.swing.JPanel implements JPlant {

    /** Creates new form JPlant */
    public JBigPlant() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        imagePlante = new javax.swing.JLabel();
        imageFruit = new javax.swing.JLabel();
        planteLabel = new javax.swing.JLabel();
        fruitLabel = new javax.swing.JLabel();
        etatFruit = new javax.swing.JLabel();
        etatPlante = new javax.swing.JLabel();
        lumiereLabel = new javax.swing.JLabel();
        etatLumiere = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JBigPlant.class);
        imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE")); // NOI18N
        imagePlante.setName("imagePlante"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        add(imagePlante, gridBagConstraints);

        imageFruit.setIcon(resourceMap.getIcon("ICON_SANS_FRUIT")); // NOI18N
        imageFruit.setName("imageFruit"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        add(imageFruit, gridBagConstraints);

        planteLabel.setFont(planteLabel.getFont().deriveFont(planteLabel.getFont().getSize()+10f));
        planteLabel.setText("Plante");
        planteLabel.setName("planteLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(planteLabel, gridBagConstraints);

        fruitLabel.setFont(fruitLabel.getFont().deriveFont(fruitLabel.getFont().getSize()+10f));
        fruitLabel.setText("Fruit");
        fruitLabel.setName("fruitLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(fruitLabel, gridBagConstraints);

        etatFruit.setFont(etatFruit.getFont().deriveFont(etatFruit.getFont().getStyle() | java.awt.Font.BOLD, etatFruit.getFont().getSize()+15));
        etatFruit.setText("fruit");
        etatFruit.setName("etatFruit"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(etatFruit, gridBagConstraints);

        etatPlante.setFont(etatPlante.getFont().deriveFont(etatPlante.getFont().getStyle() | java.awt.Font.BOLD, etatPlante.getFont().getSize()+15));
        etatPlante.setText("plante");
        etatPlante.setName("etatPlante"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(etatPlante, gridBagConstraints);

        lumiereLabel.setFont(lumiereLabel.getFont().deriveFont(lumiereLabel.getFont().getSize()+10f));
        lumiereLabel.setText("Lumière");
        lumiereLabel.setName("lumiereLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(lumiereLabel, gridBagConstraints);

        etatLumiere.setFont(etatLumiere.getFont().deriveFont(etatLumiere.getFont().getStyle() | java.awt.Font.BOLD, etatLumiere.getFont().getSize()+15));
        etatLumiere.setText("lumière");
        etatLumiere.setName("etatLumiere"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(etatLumiere, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etatFruit;
    private javax.swing.JLabel etatLumiere;
    private javax.swing.JLabel etatPlante;
    private javax.swing.JLabel fruitLabel;
    private javax.swing.JLabel imageFruit;
    private javax.swing.JLabel imagePlante;
    private javax.swing.JLabel lumiereLabel;
    private javax.swing.JLabel planteLabel;
    // End of variables declaration//GEN-END:variables

    public String getPlanteText() {
        return etatPlante.getText();
    }

    public void setPlanteText(String PlanteText) {
        etatPlante.setText(PlanteText);
    }

    public String getFruitText() {
        return etatFruit.getText();
    }

    public void setFruitText(String PlanteText) {
        etatFruit.setText(PlanteText);
    }

    public String getLumiereText() {
        return etatLumiere.getText();
    }

    public void setLumiereText(String LumiereText) {
        etatLumiere.setText(LumiereText);
    }

    public void setFruitIcon(SimulIcon icon) {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JBigPlant.class);
        switch (icon) {
            case SANS_FRUIT:
                imageFruit.setIcon(resourceMap.getIcon("ICON_SANS_FRUIT"));
                break;
            case CACAI_AMER:
                imageFruit.setIcon(resourceMap.getIcon("ICON_CACAI_AMER"));
                break;
            case CACAI_SUCRE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_CACAI_SUCRE"));
                break;
            case TOMATITO_MARRON:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_MARRON"));
                break;
            case TOMATITO_ROUGE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_ROUGE"));
                break;
            case TOMATITO_VERT:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_VERT"));
                break;
        }
    }

    public void setPlanteIcon(SimulIcon icon) {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JBigPlant.class);
        switch (icon) {
            case SANS_PLANTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_SANS_PLANTE"));
                break;
            case GRAINE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_GRAINE"));
                break;
            case CACAI_MORTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_CACAI_MORTE"));
                break;
            case CACAI_VIVANTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_CACAI_VIVANTE"));
                break;
            case TOMATITO_MORTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE"));
                break;
            case TOMATITO_MORTE1:
                imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE1"));
                break;
            case TOMATITO_VIVANTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_VIVANTE"));
                break;
        }
    }
}