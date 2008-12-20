package ihmprojet2.IHM;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        climatRBgroup = new javax.swing.ButtonGroup();
        plante1group = new javax.swing.ButtonGroup();
        plante2group = new javax.swing.ButtonGroup();
        splitter = new javax.swing.JSplitPane();
        prefsPanels = new javax.swing.JTabbedPane();
        plantesPanel = new javax.swing.JPanel();
        p1cacaiRB = new javax.swing.JRadioButton();
        p1tomatitoRB = new javax.swing.JRadioButton();
        p2cacaiRB = new javax.swing.JRadioButton();
        p2tomatitoRB = new javax.swing.JRadioButton();
        plante1CB = new javax.swing.JCheckBox();
        plante2CB = new javax.swing.JCheckBox();
        climatPanel = new javax.swing.JPanel();
        obscuriteRB = new javax.swing.JRadioButton();
        indirectRB = new javax.swing.JRadioButton();
        directRB = new javax.swing.JRadioButton();
        temperatureLabel = new javax.swing.JLabel();
        temperatureSlider = new javax.swing.JSlider();
        terrePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSlider3 = new javax.swing.JSlider();
        eauPanel = new javax.swing.JPanel();
        joursArrosageSlider = new javax.swing.JSlider();
        joursArrosageLabel = new javax.swing.JLabel();
        dureteLabel = new javax.swing.JLabel();
        quantiteEauLabel = new javax.swing.JLabel();
        quantiteEauSlider = new javax.swing.JSlider();
        dureteSlider = new javax.swing.JSlider();
        semainePanels = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        plante1panel = new javax.swing.JPanel();
        jBigPlant1 = new ihmprojet2.IHM.JBigPlant();
        jSmallPlant1 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant2 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant3 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant4 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant5 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant6 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant7 = new ihmprojet2.IHM.JSmallPlant();
        jScrollPane3 = new javax.swing.JScrollPane();
        plante2panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitter.setDividerLocation(200);
        splitter.setName("splitter"); // NOI18N

        prefsPanels.setName("prefsPanels"); // NOI18N

        plantesPanel.setName("plantesPanel"); // NOI18N

        plante1group.add(p1cacaiRB);
        p1cacaiRB.setSelected(true);
        p1cacaiRB.setText("Cacaï");
        p1cacaiRB.setName("p1cacaiRB"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante1CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p1cacaiRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        plante1group.add(p1tomatitoRB);
        p1tomatitoRB.setText("Tomatito");
        p1tomatitoRB.setName("p1tomatitoRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante1CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p1tomatitoRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        plante2group.add(p2cacaiRB);
        p2cacaiRB.setSelected(true);
        p2cacaiRB.setText("Cacaï");
        p2cacaiRB.setName("p2cacaiRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante2CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p2cacaiRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        plante2group.add(p2tomatitoRB);
        p2tomatitoRB.setText("Tomatito");
        p2tomatitoRB.setName("p2tomatitoRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante2CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p2tomatitoRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        plante1CB.setFont(plante1CB.getFont().deriveFont(plante1CB.getFont().getStyle() | java.awt.Font.BOLD));
        plante1CB.setText("Plante 1");
        plante1CB.setName("plante1CB"); // NOI18N

        plante2CB.setFont(plante2CB.getFont().deriveFont(plante2CB.getFont().getStyle() | java.awt.Font.BOLD));
        plante2CB.setText("Plante 2");
        plante2CB.setName("plante2CB"); // NOI18N

        javax.swing.GroupLayout plantesPanelLayout = new javax.swing.GroupLayout(plantesPanel);
        plantesPanel.setLayout(plantesPanelLayout);
        plantesPanelLayout.setHorizontalGroup(
            plantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plante1CB)
                    .addGroup(plantesPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(plantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1tomatitoRB)
                            .addComponent(p1cacaiRB)))
                    .addComponent(plante2CB)
                    .addGroup(plantesPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(plantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2tomatitoRB)
                            .addComponent(p2cacaiRB))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        plantesPanelLayout.setVerticalGroup(
            plantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plante1CB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1cacaiRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1tomatitoRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plante2CB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2cacaiRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2tomatitoRB)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Plantes", plantesPanel);

        climatPanel.setName("climatPanel"); // NOI18N

        climatRBgroup.add(obscuriteRB);
        obscuriteRB.setSelected(true);
        obscuriteRB.setText("Obscurité");
        obscuriteRB.setName("obscuriteRB"); // NOI18N

        climatRBgroup.add(indirectRB);
        indirectRB.setText("Lumière indirecte");
        indirectRB.setName("indirectRB"); // NOI18N

        climatRBgroup.add(directRB);
        directRB.setText("Lumière directe");
        directRB.setName("directRB"); // NOI18N

        temperatureLabel.setFont(temperatureLabel.getFont().deriveFont(temperatureLabel.getFont().getStyle() | java.awt.Font.BOLD));
        temperatureLabel.setText("Température");
        temperatureLabel.setName("temperatureLabel"); // NOI18N

        temperatureSlider.setMajorTickSpacing(10);
        temperatureSlider.setMaximum(30);
        temperatureSlider.setMinorTickSpacing(1);
        temperatureSlider.setPaintLabels(true);
        temperatureSlider.setPaintTicks(true);
        temperatureSlider.setSnapToTicks(true);
        temperatureSlider.setName("temperatureSlider"); // NOI18N

        javax.swing.GroupLayout climatPanelLayout = new javax.swing.GroupLayout(climatPanel);
        climatPanel.setLayout(climatPanelLayout);
        climatPanelLayout.setHorizontalGroup(
            climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(climatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(obscuriteRB)
                    .addComponent(indirectRB)
                    .addComponent(directRB)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        climatPanelLayout.setVerticalGroup(
            climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(climatPanelLayout.createSequentialGroup()
                .addComponent(obscuriteRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indirectRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temperatureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatureSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Climat", climatPanel);

        terrePanel.setName("terrePanel"); // NOI18N

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel2.setText("Quantité");
        jLabel2.setName("jLabel2"); // NOI18N

        jCheckBox1.setText("Engrais");
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jSlider3.setMajorTickSpacing(100);
        jSlider3.setMaximum(500);
        jSlider3.setMinimum(100);
        jSlider3.setMinorTickSpacing(10);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setName("jSlider3"); // NOI18N

        javax.swing.GroupLayout terrePanelLayout = new javax.swing.GroupLayout(terrePanel);
        terrePanel.setLayout(terrePanelLayout);
        terrePanelLayout.setHorizontalGroup(
            terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        terrePanelLayout.setVerticalGroup(
            terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrePanelLayout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Terre", terrePanel);

        eauPanel.setName("eauPanel"); // NOI18N

        joursArrosageSlider.setMajorTickSpacing(1);
        joursArrosageSlider.setMaximum(7);
        joursArrosageSlider.setMinimum(1);
        joursArrosageSlider.setPaintLabels(true);
        joursArrosageSlider.setPaintTicks(true);
        joursArrosageSlider.setSnapToTicks(true);
        joursArrosageSlider.setName("joursArrosageSlider"); // NOI18N

        joursArrosageLabel.setFont(joursArrosageLabel.getFont().deriveFont(joursArrosageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        joursArrosageLabel.setText("Jours d'arrosage");
        joursArrosageLabel.setName("joursArrosageLabel"); // NOI18N

        dureteLabel.setFont(dureteLabel.getFont().deriveFont(dureteLabel.getFont().getStyle() | java.awt.Font.BOLD));
        dureteLabel.setText("Dureté");
        dureteLabel.setName("dureteLabel"); // NOI18N

        quantiteEauLabel.setFont(quantiteEauLabel.getFont().deriveFont(quantiteEauLabel.getFont().getStyle() | java.awt.Font.BOLD));
        quantiteEauLabel.setText("Quantité");
        quantiteEauLabel.setName("quantiteEauLabel"); // NOI18N

        quantiteEauSlider.setMajorTickSpacing(100);
        quantiteEauSlider.setMaximum(500);
        quantiteEauSlider.setMinorTickSpacing(10);
        quantiteEauSlider.setPaintLabels(true);
        quantiteEauSlider.setPaintTicks(true);
        quantiteEauSlider.setSnapToTicks(true);
        quantiteEauSlider.setValue(500);
        quantiteEauSlider.setName("quantiteEauSlider"); // NOI18N

        dureteSlider.setMajorTickSpacing(1);
        dureteSlider.setMaximum(5);
        dureteSlider.setMinimum(1);
        dureteSlider.setPaintLabels(true);
        dureteSlider.setPaintTicks(true);
        dureteSlider.setSnapToTicks(true);
        dureteSlider.setName("dureteSlider"); // NOI18N

        javax.swing.GroupLayout eauPanelLayout = new javax.swing.GroupLayout(eauPanel);
        eauPanel.setLayout(eauPanelLayout);
        eauPanelLayout.setHorizontalGroup(
            eauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eauPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joursArrosageSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(joursArrosageLabel)
                    .addComponent(quantiteEauLabel)
                    .addComponent(dureteLabel)
                    .addComponent(dureteSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(quantiteEauSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        eauPanelLayout.setVerticalGroup(
            eauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eauPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(joursArrosageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(joursArrosageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantiteEauLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantiteEauSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dureteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dureteSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Eau", eauPanel);

        splitter.setLeftComponent(prefsPanels);

        semainePanels.setName("semainePanels"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        plante1panel.setName("plante1panel"); // NOI18N
        plante1panel.setLayout(new java.awt.GridBagLayout());

        jBigPlant1.setName("jBigPlant1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 7;
        plante1panel.add(jBigPlant1, gridBagConstraints);

        jSmallPlant1.setName("jSmallPlant1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant1, gridBagConstraints);

        jSmallPlant2.setName("jSmallPlant2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant2, gridBagConstraints);

        jSmallPlant3.setName("jSmallPlant3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant3, gridBagConstraints);

        jSmallPlant4.setName("jSmallPlant4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant4, gridBagConstraints);

        jSmallPlant5.setName("jSmallPlant5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant5, gridBagConstraints);

        jSmallPlant6.setName("jSmallPlant6"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant6, gridBagConstraints);

        jSmallPlant7.setName("jSmallPlant7"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        plante1panel.add(jSmallPlant7, gridBagConstraints);

        jScrollPane2.setViewportView(plante1panel);

        semainePanels.addTab("Plante 1", jScrollPane2);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        plante2panel.setName("plante2panel"); // NOI18N
        jScrollPane3.setViewportView(plante2panel);

        semainePanels.addTab("Plante 2", jScrollPane3);

        splitter.setRightComponent(semainePanels);

        getContentPane().add(splitter, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel climatPanel;
    private javax.swing.ButtonGroup climatRBgroup;
    private javax.swing.JRadioButton directRB;
    private javax.swing.JLabel dureteLabel;
    private javax.swing.JSlider dureteSlider;
    private javax.swing.JPanel eauPanel;
    private javax.swing.JRadioButton indirectRB;
    private ihmprojet2.IHM.JBigPlant jBigPlant1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider3;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant1;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant2;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant3;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant4;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant5;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant6;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant7;
    private javax.swing.JLabel joursArrosageLabel;
    private javax.swing.JSlider joursArrosageSlider;
    private javax.swing.JRadioButton obscuriteRB;
    private javax.swing.JRadioButton p1cacaiRB;
    private javax.swing.JRadioButton p1tomatitoRB;
    private javax.swing.JRadioButton p2cacaiRB;
    private javax.swing.JRadioButton p2tomatitoRB;
    private javax.swing.JCheckBox plante1CB;
    private javax.swing.ButtonGroup plante1group;
    private javax.swing.JPanel plante1panel;
    private javax.swing.JCheckBox plante2CB;
    private javax.swing.ButtonGroup plante2group;
    private javax.swing.JPanel plante2panel;
    private javax.swing.JPanel plantesPanel;
    private javax.swing.JTabbedPane prefsPanels;
    private javax.swing.JLabel quantiteEauLabel;
    private javax.swing.JSlider quantiteEauSlider;
    private javax.swing.JTabbedPane semainePanels;
    private javax.swing.JSplitPane splitter;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JSlider temperatureSlider;
    private javax.swing.JPanel terrePanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
