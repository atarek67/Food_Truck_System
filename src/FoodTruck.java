
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TIK
 */
public class FoodTruck extends javax.swing.JFrame {

    
    int beefCounter , chickenCounter , waterrCounter , juiceConuter;
    double beefPrice , chickenPrice , waterPrice , juicePrice;
    final double BEEF_COST = 30.0 , CHICKEN_COST = 25.0 , WATER_COST = 5.0 , JUICE_COST = 10.0 ;
    double subTotal , tax , total;
    int orderNumbers ;
    PrintWriter output;
    public FoodTruck() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chickenBurger = new javax.swing.JLabel();
        beefBurger = new javax.swing.JLabel();
        chiceknBurgerCounter = new javax.swing.JSpinner();
        beefBurgerCounter = new javax.swing.JSpinner();
        chickenBurgerCheeseCheckBox = new javax.swing.JCheckBox();
        beefBurgerCheeseCheckBox = new javax.swing.JCheckBox();
        chiceknBurgerPriceLabel = new javax.swing.JLabel();
        beefBurgerPriceLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        water = new javax.swing.JLabel();
        juice = new javax.swing.JLabel();
        waterCounter = new javax.swing.JSpinner();
        juiceCounter = new javax.swing.JSpinner();
        waterPriceLabel = new javax.swing.JLabel();
        juicePriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PriceBeforeTaxLabel = new javax.swing.JLabel();
        taxLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        priceButton = new javax.swing.JButton();
        newReceiptButton = new javax.swing.JButton();
        saveTheReceiptButton = new javax.swing.JButton();
        orderCounter = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Food Truck Managment System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Version 1.0.0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sandwiches", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        chickenBurger.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        chickenBurger.setText("Chicken Burger");

        beefBurger.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        beefBurger.setText("Beef Buger");

        chiceknBurgerCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chiceknBurgerCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 51, 1));
        chiceknBurgerCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chiceknBurgerCounterStateChanged(evt);
            }
        });

        beefBurgerCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beefBurgerCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        beefBurgerCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                beefBurgerCounterStateChanged(evt);
            }
        });

        chickenBurgerCheeseCheckBox.setText("Cheese");
        chickenBurgerCheeseCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenBurgerCheeseCheckBoxActionPerformed(evt);
            }
        });

        beefBurgerCheeseCheckBox.setText("Cheese");
        beefBurgerCheeseCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefBurgerCheeseCheckBoxActionPerformed(evt);
            }
        });

        chiceknBurgerPriceLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        chiceknBurgerPriceLabel.setText("0.0 EGP");

        beefBurgerPriceLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        beefBurgerPriceLabel.setText("0.0 EGP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(beefBurger)
                        .addGap(47, 47, 47)
                        .addComponent(beefBurgerCounter))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickenBurger)
                        .addGap(18, 18, 18)
                        .addComponent(chiceknBurgerCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chickenBurgerCheeseCheckBox)
                    .addComponent(beefBurgerCheeseCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chiceknBurgerPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beefBurgerPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chickenBurger)
                    .addComponent(chiceknBurgerCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chiceknBurgerPriceLabel)
                    .addComponent(chickenBurgerCheeseCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beefBurger)
                    .addComponent(beefBurgerCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beefBurgerCheeseCheckBox)
                    .addComponent(beefBurgerPriceLabel))
                .addGap(58, 58, 58))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drinks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        water.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        water.setText("Water");

        juice.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        juice.setText("Juice");

        waterCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        waterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        waterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterCounterStateChanged(evt);
            }
        });

        juiceCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        juiceCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        juiceCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                juiceCounterStateChanged(evt);
            }
        });

        waterPriceLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        waterPriceLabel.setText("0.0 EGP");

        juicePriceLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        juicePriceLabel.setText("0.0 EGP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(juice)
                        .addGap(87, 87, 87)
                        .addComponent(juiceCounter))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(water)
                        .addGap(84, 84, 84)
                        .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(waterPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(juicePriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(water)
                    .addComponent(waterCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(juice)
                    .addComponent(juiceCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juicePriceLabel))
                .addGap(58, 58, 58))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        PriceBeforeTaxLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        PriceBeforeTaxLabel.setText("Price: 0.0 EGP");

        taxLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        taxLabel.setText("Tax: 0.0 EGP");

        totalPriceLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        totalPriceLabel.setText("Total: 0.0 EGP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PriceBeforeTaxLabel)
                    .addComponent(taxLabel)
                    .addComponent(totalPriceLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(PriceBeforeTaxLabel)
                .addGap(18, 18, 18)
                .addComponent(taxLabel)
                .addGap(18, 18, 18)
                .addComponent(totalPriceLabel)
                .addGap(36, 36, 36))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        priceButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceButton.setText("Price");
        priceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceButtonActionPerformed(evt);
            }
        });

        newReceiptButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newReceiptButton.setText("New reciept");
        newReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReceiptButtonActionPerformed(evt);
            }
        });

        saveTheReceiptButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveTheReceiptButton.setText("Save the receipt");
        saveTheReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTheReceiptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(newReceiptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(saveTheReceiptButton)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(priceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(priceButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newReceiptButton)
                    .addComponent(saveTheReceiptButton))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        orderCounter.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        orderCounter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderCounter.setText("Order number: 0");

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                exitButtonStateChanged(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(orderCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(525, 525, 525))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beefBurgerCheeseCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefBurgerCheeseCheckBoxActionPerformed
        if (beefBurgerCheeseCheckBox.isSelected()){
             beefPrice +=  beefCounter;
        }
             else{
                     beefPrice -=  beefCounter;
        }
        beefBurgerPriceLabel.setText(beefPrice + " EGP");
    }//GEN-LAST:event_beefBurgerCheeseCheckBoxActionPerformed

    private void chickenBurgerCheeseCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenBurgerCheeseCheckBoxActionPerformed
        if (chickenBurgerCheeseCheckBox.isSelected()){
             chickenPrice +=  chickenCounter;
        }
             else{
                     chickenPrice -=  chickenCounter;
        }
        chiceknBurgerPriceLabel.setText(chickenPrice + " EGP");
        
    }//GEN-LAST:event_chickenBurgerCheeseCheckBoxActionPerformed

    private void chiceknBurgerCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chiceknBurgerCounterStateChanged

        chickenCounter = (Integer)chiceknBurgerCounter.getValue();
        chickenPrice = chickenCounter * CHICKEN_COST;
        chiceknBurgerPriceLabel.setText(chickenPrice + " EGP");
    }//GEN-LAST:event_chiceknBurgerCounterStateChanged

    private void beefBurgerCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_beefBurgerCounterStateChanged
        beefCounter = (Integer)beefBurgerCounter.getValue();
        beefPrice = beefCounter * BEEF_COST;
        beefBurgerPriceLabel.setText(beefPrice + " EGP");
    }//GEN-LAST:event_beefBurgerCounterStateChanged

    private void waterCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterCounterStateChanged
        waterrCounter = (Integer)waterCounter.getValue();
        waterPrice = waterrCounter * WATER_COST;
        waterPriceLabel.setText(waterPrice + " EGP");
    }//GEN-LAST:event_waterCounterStateChanged

    private void juiceCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_juiceCounterStateChanged
        juiceConuter = (Integer)juiceCounter.getValue();
        juicePrice = juiceConuter * JUICE_COST;
        juicePriceLabel.setText(juicePrice + " EGP");
    }//GEN-LAST:event_juiceCounterStateChanged

    private void exitButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_exitButtonStateChanged

    }//GEN-LAST:event_exitButtonStateChanged

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void priceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceButtonActionPerformed
        subTotal = chickenPrice + beefPrice + waterPrice + juicePrice;
        PriceBeforeTaxLabel.setText("Subtotal : " + subTotal + " EGP");
        
        tax = (subTotal * 0.14);
        tax = tax * 100;
        tax = (double)((int) tax);
        tax = tax / 100;
        taxLabel.setText("Tax: " + tax + " EGP");
        
        total = subTotal + tax;
        totalPriceLabel.setText("Total: " + total + " EGP");
    }//GEN-LAST:event_priceButtonActionPerformed

    private void saveTheReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTheReceiptButtonActionPerformed
        
        try {
            if(total!=0){
                
                    output = new PrintWriter("orderCounter " + orderNumbers + ".txt");
                    output.println("Receipt: " + orderNumbers);
                    output.println(" ");
                    output.println("*****************************");
                    
                    if(chickenCounter!=0){
                        output.println(" ");
                        output.print("Chicken Burger: " + chickenCounter);
                        if(chickenBurgerCheeseCheckBox.isSelected()){
                            output.print(" With cheese");
                            output.println("");
                             
                        }
                    }  
                    if(beefCounter!=0){
                        output.println(" ");
                        output.print("Beef Burger: " + beefCounter);
                        if(beefBurgerCheeseCheckBox.isSelected()){
                            output.print(" With cheese");
                             output.println("");
                        }
                    }
                    if(waterrCounter!=0){
                        output.println(" ");
                        output.println("Water: " + waterrCounter);
                        
                           } 
                    if(juiceConuter!=0){
                        output.println(" ");
                        output.println("Juice: " + juiceConuter);
                        
                           } 
                } 
            output.close(); 
        }
        catch (FileNotFoundException ex) {
                    Logger.getLogger(FoodTruck.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        
                
    }//GEN-LAST:event_saveTheReceiptButtonActionPerformed

    private void newReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReceiptButtonActionPerformed
       
       if(total!=0){
        orderNumbers++;
        orderCounter.setText("Order number: " + orderNumbers);
        PriceBeforeTaxLabel.setText("Subtotal: 0.0 EGP" );
        totalPriceLabel.setText("Total: 0.0 EGP");
        taxLabel.setText("Tax: 0.0 EGP");
        chickenBurgerCheeseCheckBox.setSelected(false);
        beefBurgerCheeseCheckBox.setSelected(false);
        beefBurgerCounter.setValue(0);
        waterCounter.setValue(0);
        juiceCounter.setValue(0);
        chiceknBurgerCounter.setValue(0);
        
        total =0;
        tax=0;
        subTotal=0;
        
       }
    }//GEN-LAST:event_newReceiptButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodTruck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodTruck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PriceBeforeTaxLabel;
    private javax.swing.JLabel beefBurger;
    private javax.swing.JCheckBox beefBurgerCheeseCheckBox;
    private javax.swing.JSpinner beefBurgerCounter;
    private javax.swing.JLabel beefBurgerPriceLabel;
    private javax.swing.JSpinner chiceknBurgerCounter;
    private javax.swing.JLabel chiceknBurgerPriceLabel;
    private javax.swing.JLabel chickenBurger;
    private javax.swing.JCheckBox chickenBurgerCheeseCheckBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel juice;
    private javax.swing.JSpinner juiceCounter;
    private javax.swing.JLabel juicePriceLabel;
    private javax.swing.JButton newReceiptButton;
    private javax.swing.JLabel orderCounter;
    private javax.swing.JButton priceButton;
    private javax.swing.JButton saveTheReceiptButton;
    private javax.swing.JLabel taxLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel water;
    private javax.swing.JSpinner waterCounter;
    private javax.swing.JLabel waterPriceLabel;
    // End of variables declaration//GEN-END:variables

   
   
}
