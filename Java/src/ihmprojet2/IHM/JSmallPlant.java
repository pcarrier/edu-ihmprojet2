package ihmprojet2.IHM;

public class JSmallPlant extends javax.swing.JPanel implements JPlant {

    /** Creates new form JPlant */
    public JSmallPlant() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        etatPlante = new javax.swing.JLabel();
        etatFruit = new javax.swing.JLabel();
        fluitLabel = new javax.swing.JLabel();
        planteLabel = new javax.swing.JLabel();
        imagePlante = new javax.swing.JLabel();
        imageFruit = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.GridBagLayout());

        etatPlante.setText("plante");
        etatPlante.setName("etatPlante"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(etatPlante, gridBagConstraints);

        etatFruit.setText("fruit");
        etatFruit.setName("etatFruit"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(etatFruit, gridBagConstraints);

        fluitLabel.setFont(fluitLabel.getFont());
        fluitLabel.setText("Fruit");
        fluitLabel.setName("fluitLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(fluitLabel, gridBagConstraints);

        planteLabel.setFont(planteLabel.getFont());
        planteLabel.setText("Plante");
        planteLabel.setName("planteLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(planteLabel, gridBagConstraints);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JSmallPlant.class);
        imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE")); // NOI18N
        imagePlante.setName("imagePlante"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        add(imagePlante, gridBagConstraints);

        imageFruit.setIcon(resourceMap.getIcon("ICON_SANS_FRUIT")); // NOI18N
        imageFruit.setName("imageFruit"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 16;
        add(imageFruit, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etatFruit;
    private javax.swing.JLabel etatPlante;
    private javax.swing.JLabel fluitLabel;
    private javax.swing.JLabel imageFruit;
    private javax.swing.JLabel imagePlante;
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

    public void setFruitIcon(SimulIcon icon) {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JSmallPlant.class);
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
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JSmallPlant.class);
        switch (icon) {
            case SANS_PLANTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_SANS_PLANTE"));
                break;
            case GRAINE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_GRAINE"));
                break;
            case CACAI_GERMEE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_CACAI_GERMEE"));
                break;
            case CACAI_MORTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_CACAI_MORTE"));
                break;
            case CACAI_VIVANTE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_CACAI_VIVANTE"));
                break;
            case TOMATITO_GERMEE:
                imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_GERMEE"));
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