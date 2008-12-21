package ihmprojet2.IHM;

import ihmprojet2.IHM.JPlant.SimulIcon;
import ihmprojet2.Simulation.DegresLumiere;
import ihmprojet2.Simulation.Durete;
import ihmprojet2.Simulation.Plante.Couleur;
import ihmprojet2.Simulation.Plante.Gout;
import ihmprojet2.Simulation.Plante.Plante;
import ihmprojet2.Simulation.Simulation.TypePlante;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        simulation1 = new ihmprojet2.Simulation.Simulation();
        splitter = new javax.swing.JSplitPane();
        gauche = new javax.swing.JPanel();
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
        engraisCB = new javax.swing.JCheckBox();
        quantiteTerreSlider = new javax.swing.JSlider();
        eauPanel = new javax.swing.JPanel();
        joursArrosageSlider = new javax.swing.JSlider();
        joursArrosageLabel = new javax.swing.JLabel();
        dureteLabel = new javax.swing.JLabel();
        quantiteEauLabel = new javax.swing.JLabel();
        quantiteEauSlider = new javax.swing.JSlider();
        dureteSlider = new javax.swing.JSlider();
        bottom = new javax.swing.JPanel();
        qcroisslabel = new javax.swing.JLabel();
        qcroissval = new javax.swing.JLabel();
        aboutButton = new javax.swing.JButton();
        vuePanels = new javax.swing.JTabbedPane();
        plante1scroller = new javax.swing.JScrollPane();
        plante1panel = new javax.swing.JPanel();
        jBigPlant1 = new ihmprojet2.IHM.JBigPlant();
        plante1semaine = new javax.swing.JPanel();
        jSmallPlant1 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant2 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant3 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant4 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant5 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant6 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant7 = new ihmprojet2.IHM.JSmallPlant();
        plante2scroller = new javax.swing.JScrollPane();
        plante2panel = new javax.swing.JPanel();
        jBigPlant2 = new ihmprojet2.IHM.JBigPlant();
        jSmallPlant8 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant9 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant10 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant11 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant12 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant13 = new ihmprojet2.IHM.JSmallPlant();
        jSmallPlant14 = new ihmprojet2.IHM.JSmallPlant();

        simulation1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                simulation1PropertyChange(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ihmProjet2"); // NOI18N

        splitter.setDividerLocation(200);
        splitter.setName("splitter"); // NOI18N

        gauche.setName("gauche"); // NOI18N
        gauche.setLayout(new java.awt.BorderLayout());

        prefsPanels.setName("prefsPanels"); // NOI18N

        plantesPanel.setName("plantesPanel"); // NOI18N

        plante1group.add(p1cacaiRB);
        p1cacaiRB.setSelected(true);
        p1cacaiRB.setText("Cacaï");
        p1cacaiRB.setName("p1cacaiRB"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante1CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p1cacaiRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        p1cacaiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante1Changed(evt);
            }
        });

        plante1group.add(p1tomatitoRB);
        p1tomatitoRB.setText("Tomatito");
        p1tomatitoRB.setName("p1tomatitoRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante1CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p1tomatitoRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        p1tomatitoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante1Changed(evt);
            }
        });

        plante2group.add(p2cacaiRB);
        p2cacaiRB.setSelected(true);
        p2cacaiRB.setText("Cacaï");
        p2cacaiRB.setName("p2cacaiRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante2CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p2cacaiRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        p2cacaiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante2Changed(evt);
            }
        });

        plante2group.add(p2tomatitoRB);
        p2tomatitoRB.setText("Tomatito");
        p2tomatitoRB.setName("p2tomatitoRB"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, plante2CB, org.jdesktop.beansbinding.ELProperty.create("${selected}"), p2tomatitoRB, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        p2tomatitoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante2Changed(evt);
            }
        });

        plante1CB.setFont(plante1CB.getFont().deriveFont(plante1CB.getFont().getStyle() | java.awt.Font.BOLD));
        plante1CB.setText("Plante 1");
        plante1CB.setName("plante1CB"); // NOI18N
        plante1CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante1Changed(evt);
            }
        });

        plante2CB.setFont(plante2CB.getFont().deriveFont(plante2CB.getFont().getStyle() | java.awt.Font.BOLD));
        plante2CB.setText("Plante 2");
        plante2CB.setName("plante2CB"); // NOI18N
        plante2CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plante2Changed(evt);
            }
        });

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
                .addContainerGap(285, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Plantes", plantesPanel);

        climatPanel.setName("climatPanel"); // NOI18N

        climatRBgroup.add(obscuriteRB);
        obscuriteRB.setSelected(true);
        obscuriteRB.setText("Obscurité");
        obscuriteRB.setName("obscuriteRB"); // NOI18N
        obscuriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumiereChanged(evt);
            }
        });

        climatRBgroup.add(indirectRB);
        indirectRB.setText("Lumière indirecte");
        indirectRB.setName("indirectRB"); // NOI18N
        indirectRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumiereChanged(evt);
            }
        });

        climatRBgroup.add(directRB);
        directRB.setText("Lumière directe");
        directRB.setName("directRB"); // NOI18N
        directRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumiereChanged(evt);
            }
        });

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
        temperatureSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                temperatureChanged(evt);
            }
        });

        javax.swing.GroupLayout climatPanelLayout = new javax.swing.GroupLayout(climatPanel);
        climatPanel.setLayout(climatPanelLayout);
        climatPanelLayout.setHorizontalGroup(
            climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(climatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temperatureSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(obscuriteRB)
                    .addComponent(indirectRB)
                    .addComponent(directRB)
                    .addComponent(temperatureLabel))
                .addContainerGap())
        );
        climatPanelLayout.setVerticalGroup(
            climatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(climatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(obscuriteRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indirectRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temperatureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatureSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Climat", climatPanel);

        terrePanel.setName("terrePanel"); // NOI18N

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel2.setText("Quantité");
        jLabel2.setName("jLabel2"); // NOI18N

        engraisCB.setText("Engrais");
        engraisCB.setName("engraisCB"); // NOI18N
        engraisCB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                engraisChanged(evt);
            }
        });

        quantiteTerreSlider.setMajorTickSpacing(100);
        quantiteTerreSlider.setMaximum(500);
        quantiteTerreSlider.setMinimum(100);
        quantiteTerreSlider.setMinorTickSpacing(10);
        quantiteTerreSlider.setPaintLabels(true);
        quantiteTerreSlider.setPaintTicks(true);
        quantiteTerreSlider.setSnapToTicks(true);
        quantiteTerreSlider.setValue(500);
        quantiteTerreSlider.setName("quantiteTerreSlider"); // NOI18N
        quantiteTerreSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantiteTerreChanged(evt);
            }
        });

        javax.swing.GroupLayout terrePanelLayout = new javax.swing.GroupLayout(terrePanel);
        terrePanel.setLayout(terrePanelLayout);
        terrePanelLayout.setHorizontalGroup(
            terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantiteTerreSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(engraisCB)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        terrePanelLayout.setVerticalGroup(
            terrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(engraisCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantiteTerreSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Terre", terrePanel);

        eauPanel.setName("eauPanel"); // NOI18N

        joursArrosageSlider.setMajorTickSpacing(1);
        joursArrosageSlider.setMaximum(7);
        joursArrosageSlider.setPaintLabels(true);
        joursArrosageSlider.setPaintTicks(true);
        joursArrosageSlider.setSnapToTicks(true);
        joursArrosageSlider.setName("joursArrosageSlider"); // NOI18N
        joursArrosageSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                joursArrosageChanged(evt);
            }
        });

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
        quantiteEauSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantiteEauChanged(evt);
            }
        });

        dureteSlider.setMajorTickSpacing(1);
        dureteSlider.setMaximum(5);
        dureteSlider.setMinimum(1);
        dureteSlider.setPaintLabels(true);
        dureteSlider.setPaintTicks(true);
        dureteSlider.setSnapToTicks(true);
        dureteSlider.setName("dureteSlider"); // NOI18N
        dureteSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dureteChanged(evt);
            }
        });

        javax.swing.GroupLayout eauPanelLayout = new javax.swing.GroupLayout(eauPanel);
        eauPanel.setLayout(eauPanelLayout);
        eauPanelLayout.setHorizontalGroup(
            eauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eauPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dureteSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(joursArrosageSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(joursArrosageLabel)
                    .addComponent(quantiteEauLabel)
                    .addComponent(quantiteEauSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(dureteLabel))
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
                .addContainerGap(195, Short.MAX_VALUE))
        );

        prefsPanels.addTab("Eau", eauPanel);

        gauche.add(prefsPanels, java.awt.BorderLayout.CENTER);

        bottom.setName("bottom"); // NOI18N

        qcroisslabel.setText("Qualité de croissance :");
        qcroisslabel.setName("qcroisslabel"); // NOI18N

        qcroissval.setName("qcroissval"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, simulation1, org.jdesktop.beansbinding.ELProperty.create("${environnment.qualiteCroissance}"), qcroissval, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        aboutButton.setText("À propos");
        aboutButton.setName("aboutButton"); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(bottomLayout.createSequentialGroup()
                        .addComponent(qcroisslabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(qcroissval)))
                .addContainerGap())
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qcroissval, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qcroisslabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutButton)
                .addContainerGap())
        );

        gauche.add(bottom, java.awt.BorderLayout.SOUTH);

        splitter.setLeftComponent(gauche);

        vuePanels.setName("vuePanels"); // NOI18N

        plante1scroller.setName("plante1scroller"); // NOI18N

        plante1panel.setName("plante1panel"); // NOI18N
        plante1panel.setLayout(new java.awt.BorderLayout(0, 8));

        jBigPlant1.setName("jBigPlant1"); // NOI18N
        plante1panel.add(jBigPlant1, java.awt.BorderLayout.CENTER);

        plante1semaine.setName("plante1semaine"); // NOI18N
        plante1semaine.setLayout(new java.awt.GridLayout(1, 0, 8, 0));

        jSmallPlant1.setName("jSmallPlant1"); // NOI18N
        plante1semaine.add(jSmallPlant1);

        jSmallPlant2.setName("jSmallPlant2"); // NOI18N
        plante1semaine.add(jSmallPlant2);

        jSmallPlant3.setName("jSmallPlant3"); // NOI18N
        plante1semaine.add(jSmallPlant3);

        jSmallPlant4.setName("jSmallPlant4"); // NOI18N
        plante1semaine.add(jSmallPlant4);

        jSmallPlant5.setName("jSmallPlant5"); // NOI18N
        plante1semaine.add(jSmallPlant5);

        jSmallPlant6.setName("jSmallPlant6"); // NOI18N
        plante1semaine.add(jSmallPlant6);

        jSmallPlant7.setName("jSmallPlant7"); // NOI18N
        plante1semaine.add(jSmallPlant7);

        plante1panel.add(plante1semaine, java.awt.BorderLayout.SOUTH);

        plante1scroller.setViewportView(plante1panel);

        vuePanels.addTab("Plante 1", plante1scroller);

        plante2scroller.setName("plante2scroller"); // NOI18N

        plante2panel.setName("plante2panel"); // NOI18N
        plante2panel.setLayout(new java.awt.GridBagLayout());

        jBigPlant2.setName("jBigPlant2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 7;
        plante2panel.add(jBigPlant2, gridBagConstraints);

        jSmallPlant8.setName("jSmallPlant8"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant8, gridBagConstraints);

        jSmallPlant9.setName("jSmallPlant9"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant9, gridBagConstraints);

        jSmallPlant10.setName("jSmallPlant10"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant10, gridBagConstraints);

        jSmallPlant11.setName("jSmallPlant11"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant11, gridBagConstraints);

        jSmallPlant12.setName("jSmallPlant12"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant12, gridBagConstraints);

        jSmallPlant13.setName("jSmallPlant13"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant13, gridBagConstraints);

        jSmallPlant14.setName("jSmallPlant14"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        plante2panel.add(jSmallPlant14, gridBagConstraints);

        plante2scroller.setViewportView(plante2panel);

        vuePanels.addTab("Plante 2", plante2scroller);

        splitter.setRightComponent(vuePanels);

        getContentPane().add(splitter, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        CreditsDialog.launch(this, false);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private SimulIcon selectPlanteIcon(TypePlante type, boolean vivante, boolean germee) {
        if (type == TypePlante.CACAI) {
            if (!vivante) {
                return SimulIcon.CACAI_MORTE;
            } else if (germee) {
                return SimulIcon.CACAI_VIVANTE;
            } else {
                return SimulIcon.GRAINE;
            }
        } else { // Tomatito
            if (!vivante) {
                return SimulIcon.TOMATITO_MORTE;
            } else if (germee) {
                return SimulIcon.TOMATITO_VIVANTE;
            } else {
                return SimulIcon.GRAINE;
            }
        }
    }

    private SimulIcon selectFruitIcon(TypePlante type, Gout gout, Couleur couleur) {
        if (type == TypePlante.CACAI) {
            if (gout == Gout.SUCRE) {
                return SimulIcon.CACAI_SUCRE;
            } else if (gout == Gout.AMER) {
                return SimulIcon.CACAI_AMER;
            } else { // Pas de fruit
                return SimulIcon.SANS_FRUIT;
            }
        } else { // Tomatito
            if (couleur == Couleur.VERT) {
                return SimulIcon.TOMATITO_VERT;
            } else if (couleur == Couleur.ROUGE) {
                return SimulIcon.TOMATITO_ROUGE;
            } else if (couleur == Couleur.MARRON) {
                return SimulIcon.TOMATITO_MARRON;
            } else { // Pas de fruit
                return SimulIcon.SANS_FRUIT;
            }
        }
    }

    private void simulation1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_simulation1PropertyChange
        System.out.println("Changement recu de la simulation !");

        JPlant[] jplants1 = {
            jSmallPlant1,
            jSmallPlant2,
            jSmallPlant3,
            jSmallPlant4,
            jSmallPlant5,
            jSmallPlant6,
            jSmallPlant7
        };
        if (simulation1.getPlante1() == TypePlante.SANS) {
            for (int i = 0; i < jplants1.length; i++) {
                jplants1[i].setFruitIcon(SimulIcon.SANS_FRUIT);
                jplants1[i].setPlanteIcon(SimulIcon.SANS_PLANTE);
            }
        } else {
            Plante[] plantes = simulation1.getEtatsPlante1();
            for (int i = 0; i < plantes.length; i++) {
                jplants1[i].setPlanteText(plantes[i].getDescription());
                jplants1[i].setPlanteIcon(selectPlanteIcon(simulation1.getPlante1(),
                        plantes[i].isVivante(), plantes[i].isGermee()));
                try {
                    jplants1[i].setFruitText(plantes[i].getFruit().getDescription());
                    jplants1[i].setFruitIcon(selectFruitIcon(simulation1.getPlante1(),
                            plantes[i].getFruit().getGout(), plantes[i].getFruit().getCouleur()));
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        JPlant[] jplants2 = {
            jSmallPlant8,
            jSmallPlant9,
            jSmallPlant10,
            jSmallPlant11,
            jSmallPlant12,
            jSmallPlant13,
            jSmallPlant14
        };
        if (simulation1.getPlante2() == TypePlante.SANS) {
            for (int i = 0; i < jplants2.length; i++) {
                jplants2[i].setFruitIcon(SimulIcon.SANS_FRUIT);
                jplants2[i].setPlanteIcon(SimulIcon.SANS_PLANTE);
            }
        } else {
            Plante[] plantes = simulation1.getEtatsPlante2();
            for (int i = 0; i < plantes.length; i++) {
                jplants2[i].setPlanteText(plantes[i].getDescription());
                jplants2[i].setPlanteIcon(selectPlanteIcon(simulation1.getPlante2(),
                        plantes[i].isVivante(), plantes[i].isGermee()));
                try {
                    jplants2[i].setFruitText(plantes[i].getFruit().getDescription());
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_simulation1PropertyChange

    private void plante1Changed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plante1Changed
        TypePlante p;
        if (plante1CB.isSelected()) {
            if (p1cacaiRB.isSelected()) {
                p = TypePlante.CACAI;
            } else {
                p = TypePlante.TOMATITO;
            }
        } else {
            p = TypePlante.SANS;
        }
        try {
            simulation1.setPlante1(p);
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "allocine", ex);
        }
}//GEN-LAST:event_plante1Changed

    private void plante2Changed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plante2Changed
        TypePlante p;
        if (plante2CB.isSelected()) {
            if (p2cacaiRB.isSelected()) {
                p = TypePlante.CACAI;
            } else {
                p = TypePlante.TOMATITO;
            }
        } else {
            p = TypePlante.SANS;
        }
        try {
            simulation1.setPlante2(p);
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "imdb", ex);
        }
    }//GEN-LAST:event_plante2Changed

    private void lumiereChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumiereChanged
        if (obscuriteRB.isSelected()) {
            try {
                simulation1.getEnvironnment().getClimat().setLumiere(DegresLumiere.OBSCURITE);
            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "hamster", ex);
            }
        } else if (directRB.isSelected()) {
            try {
                simulation1.getEnvironnment().getClimat().setLumiere(DegresLumiere.DIRECTE);
            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "vache", ex);
            }
        } else {
            try {
                simulation1.getEnvironnment().getClimat().setLumiere(DegresLumiere.INDIRECTE);
            } catch (Exception ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "mouton", ex);
            }
        }
    }//GEN-LAST:event_lumiereChanged

    private void temperatureChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_temperatureChanged
        System.out.println("Temperature changee interface");
        try {
            simulation1.getEnvironnment().getClimat().setTemperature(temperatureSlider.getValue());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "burp", ex);
        }
    }//GEN-LAST:event_temperatureChanged

    private void engraisChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_engraisChanged
        System.out.println(engraisCB.isSelected());
        simulation1.getEnvironnment().getTerre().setEngrais(engraisCB.isSelected());
    }//GEN-LAST:event_engraisChanged

    private void quantiteTerreChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantiteTerreChanged
        try {
            System.out.println(quantiteTerreSlider.getValue());
            simulation1.getEnvironnment().getTerre().setQuantite(quantiteTerreSlider.getValue());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "ha", ex);
        }
    }//GEN-LAST:event_quantiteTerreChanged

    private void joursArrosageChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_joursArrosageChanged
        try {
            simulation1.getEnvironnment().getEau().setNbJoursArrosage(joursArrosageSlider.getValue());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "ho", ex);
        }
    }//GEN-LAST:event_joursArrosageChanged

    private void quantiteEauChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantiteEauChanged
        try {
            System.out.println(quantiteEauSlider.getValue());
            simulation1.getEnvironnment().getEau().setQuantite(quantiteEauSlider.getValue());
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "hi", ex);
        }
    }//GEN-LAST:event_quantiteEauChanged

    private void dureteChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dureteChanged
        int val = dureteSlider.getValue();
        switch (val) {
            case 1:
                try {
                    simulation1.getEnvironnment().getEau().setDurete(Durete.TRES_DOUCE);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "he", ex);
                }
                break;
            case 2:
                try {
                    simulation1.getEnvironnment().getEau().setDurete(Durete.DOUCE);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "hu", ex);
                }
                break;
            case 3:
                try {
                    simulation1.getEnvironnment().getEau().setDurete(Durete.MOY_DURE);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "tsss", ex);
                }
                break;
            case 4:
                try {
                    simulation1.getEnvironnment().getEau().setDurete(Durete.DURE);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "grrr", ex);
                }
                break;
            case 5:
                try {
                    simulation1.getEnvironnment().getEau().setDurete(Durete.TRES_DURE);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, "argl", ex);
                }
                break;
        }
    }//GEN-LAST:event_dureteChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel climatPanel;
    private javax.swing.ButtonGroup climatRBgroup;
    private javax.swing.JRadioButton directRB;
    private javax.swing.JLabel dureteLabel;
    private javax.swing.JSlider dureteSlider;
    private javax.swing.JPanel eauPanel;
    private javax.swing.JCheckBox engraisCB;
    private javax.swing.JPanel gauche;
    private javax.swing.JRadioButton indirectRB;
    private ihmprojet2.IHM.JBigPlant jBigPlant1;
    private ihmprojet2.IHM.JBigPlant jBigPlant2;
    private javax.swing.JLabel jLabel2;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant1;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant10;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant11;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant12;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant13;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant14;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant2;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant3;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant4;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant5;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant6;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant7;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant8;
    private ihmprojet2.IHM.JSmallPlant jSmallPlant9;
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
    private javax.swing.JScrollPane plante1scroller;
    private javax.swing.JPanel plante1semaine;
    private javax.swing.JCheckBox plante2CB;
    private javax.swing.ButtonGroup plante2group;
    private javax.swing.JPanel plante2panel;
    private javax.swing.JScrollPane plante2scroller;
    private javax.swing.JPanel plantesPanel;
    private javax.swing.JTabbedPane prefsPanels;
    private javax.swing.JLabel qcroisslabel;
    private javax.swing.JLabel qcroissval;
    private javax.swing.JLabel quantiteEauLabel;
    private javax.swing.JSlider quantiteEauSlider;
    private javax.swing.JSlider quantiteTerreSlider;
    private ihmprojet2.Simulation.Simulation simulation1;
    private javax.swing.JSplitPane splitter;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JSlider temperatureSlider;
    private javax.swing.JPanel terrePanel;
    private javax.swing.JTabbedPane vuePanels;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
