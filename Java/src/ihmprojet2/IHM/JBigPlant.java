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
        jPanel1 = new javax.swing.JPanel();
        planteLabel = new javax.swing.JLabel();
        fluitLabel = new javax.swing.JLabel();
        etatFruit = new javax.swing.JLabel();
        etatPlante = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JBigPlant.class);
        imagePlante.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE")); // NOI18N
        imagePlante.setName("imagePlante"); // NOI18N
        add(imagePlante);

        imageFruit.setIcon(resourceMap.getIcon("ICON_SANS_FRUIT")); // NOI18N
        imageFruit.setName("imageFruit"); // NOI18N
        add(imageFruit);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        planteLabel.setFont(planteLabel.getFont().deriveFont(planteLabel.getFont().getSize()+10f));
        planteLabel.setText("Plante");
        planteLabel.setName("planteLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(planteLabel, gridBagConstraints);

        fluitLabel.setFont(fluitLabel.getFont().deriveFont(fluitLabel.getFont().getSize()+10f));
        fluitLabel.setText("Fruit");
        fluitLabel.setName("fluitLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(fluitLabel, gridBagConstraints);

        etatFruit.setFont(etatFruit.getFont().deriveFont(etatFruit.getFont().getStyle() | java.awt.Font.BOLD, etatFruit.getFont().getSize()+15));
        etatFruit.setText("texte fruit");
        etatFruit.setName("etatFruit"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(etatFruit, gridBagConstraints);

        etatPlante.setFont(etatPlante.getFont().deriveFont(etatPlante.getFont().getStyle() | java.awt.Font.BOLD, etatPlante.getFont().getSize()+15));
        etatPlante.setText("texte plante");
        etatPlante.setName("etatPlante"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(etatPlante, gridBagConstraints);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etatFruit;
    private javax.swing.JLabel etatPlante;
    private javax.swing.JLabel fluitLabel;
    private javax.swing.JLabel imageFruit;
    private javax.swing.JLabel imagePlante;
    private javax.swing.JPanel jPanel1;
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

    public void setFruitIcon(Icon icon) {
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

    public void setPlanteIcon(Icon icon) {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(JBigPlant.class);
        switch (icon) {
            case SANS_PLANTE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_SANS_PLANTE"));
                break;
            case GRAINE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_GRAINE"));
                break;
            case CACAI_MORTE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_CACAI_MORTE"));
                break;
            case CACAI_VIVANTE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_CACAI_VIVANTE"));
                break;
            case TOMATITO_MORTE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE"));
                break;
            case TOMATITO_MORTE1:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_MORTE1"));
                break;
            case TOMATITO_VIVANTE:
                imageFruit.setIcon(resourceMap.getIcon("ICON_TOMATITO_VIVANTE"));
                break;
        }
    }
}