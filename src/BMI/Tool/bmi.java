package BMI.Tool;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bmi extends javax.swing.JFrame {

    public static String[][] info = {
        {"Peso inferior al normal", "Menos de 18.5"},
        {"Normal", "18.5 – 24.9"},
        {"Peso superior al normal", "25.0 – 29.9"},
        {"Obesidad", "Más de 30.0"}};

    public bmi() {

        initComponents();
        llenarTabla(info);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        principalJP = new javax.swing.JPanel();
        lblHeight = new javax.swing.JLabel();
        lblWeigth = new javax.swing.JLabel();
        cmTF = new javax.swing.JTextField();
        kgTF = new javax.swing.JTextField();
        btnCalculator = new javax.swing.JButton();
        lblBMI = new javax.swing.JLabel();
        resultBMITF = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblCm = new javax.swing.JLabel();
        lblMts = new javax.swing.JLabel();
        mtsTF = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblKg = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalJP.setBackground(new java.awt.Color(34, 40, 49));
        principalJP.setForeground(new java.awt.Color(238, 238, 238));
        principalJP.setAlignmentY(-0.5F);

        lblHeight.setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(238, 238, 238));
        lblHeight.setText("Your Height");

        lblWeigth.setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N
        lblWeigth.setForeground(new java.awt.Color(238, 238, 238));
        lblWeigth.setText("Your Weigth");

        cmTF.setBackground(new java.awt.Color(57, 62, 70));
        cmTF.setForeground(new java.awt.Color(238, 238, 238));
        cmTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        kgTF.setBackground(new java.awt.Color(57, 62, 70));
        kgTF.setForeground(new java.awt.Color(238, 238, 238));
        kgTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalculator.setBackground(new java.awt.Color(0, 173, 181));
        btnCalculator.setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        btnCalculator.setForeground(new java.awt.Color(238, 238, 238));
        btnCalculator.setText("Calculate Your BMI");
        btnCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculatorActionPerformed(evt);
            }
        });

        lblBMI.setFont(new java.awt.Font("aakar", 1, 18)); // NOI18N
        lblBMI.setForeground(new java.awt.Color(238, 238, 238));
        lblBMI.setText("Your BMI");

        resultBMITF.setBackground(new java.awt.Color(57, 62, 70));
        resultBMITF.setForeground(new java.awt.Color(238, 238, 238));
        resultBMITF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnClear.setBackground(new java.awt.Color(0, 173, 181));
        btnClear.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        btnClear.setForeground(new java.awt.Color(238, 238, 238));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 173, 181));
        btnExit.setFont(new java.awt.Font("aakar", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 238, 238));
        btnExit.setText("Exit");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblCm.setFont(new java.awt.Font("aakar", 0, 14)); // NOI18N
        lblCm.setForeground(new java.awt.Color(238, 238, 238));
        lblCm.setText("Cm");

        lblMts.setFont(new java.awt.Font("aakar", 0, 14)); // NOI18N
        lblMts.setForeground(new java.awt.Color(238, 238, 238));
        lblMts.setText("Mts");

        mtsTF.setBackground(new java.awt.Color(57, 62, 70));
        mtsTF.setForeground(new java.awt.Color(238, 238, 238));
        mtsTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTitle.setFont(new java.awt.Font("aakar", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(238, 238, 238));
        lblTitle.setText("Calculator BMI");

        lblKg.setFont(new java.awt.Font("aakar", 0, 14)); // NOI18N
        lblKg.setForeground(new java.awt.Color(238, 238, 238));
        lblKg.setText("Kg");

        tableInfo.setBackground(new java.awt.Color(34, 40, 49));
        tableInfo.setFont(new java.awt.Font("Caladea", 0, 13)); // NOI18N
        tableInfo.setForeground(new java.awt.Color(238, 238, 238));
        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Composición corporal", "	Índice de masa corporal (IMC)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInfo.setGridColor(new java.awt.Color(238, 238, 238));
        tableInfo.setSelectionBackground(new java.awt.Color(238, 238, 238));
        tableInfo.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane3.setViewportView(tableInfo);

        javax.swing.GroupLayout principalJPLayout = new javax.swing.GroupLayout(principalJP);
        principalJP.setLayout(principalJPLayout);
        principalJPLayout.setHorizontalGroup(
            principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalJPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalJPLayout.createSequentialGroup()
                        .addComponent(lblMts)
                        .addGap(142, 142, 142)
                        .addComponent(lblCm)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalJPLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(92, 92, 92)))
                .addGap(459, 459, 459))
            .addGroup(principalJPLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWeigth)
                    .addComponent(lblHeight)
                    .addComponent(lblBMI))
                .addGap(33, 33, 33)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalJPLayout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resultBMITF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(principalJPLayout.createSequentialGroup()
                            .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mtsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(principalJPLayout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(cmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(principalJPLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblKg))))
                        .addComponent(btnCalculator)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        principalJPLayout.setVerticalGroup(
            principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalJPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(16, 16, 16)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHeight)
                    .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mtsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMts)
                    .addComponent(lblCm))
                .addGap(18, 18, 18)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(principalJPLayout.createSequentialGroup()
                        .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblWeigth)
                            .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kgTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblKg)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultBMITF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBMI))
                .addGap(25, 25, 25)
                .addGroup(principalJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        cmTF.setText("");
        kgTF.setText("");
        mtsTF.setText("");
        resultBMITF.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    private void calcularIMC() {

        try {
            double mts, cm, kg, imc, result;
            mts = Double.parseDouble(mtsTF.getText());
            cm = Double.parseDouble(cmTF.getText());
            kg = Double.parseDouble(kgTF.getText());
            mts = (mts * 100) + cm;
            mts = mts / 100;
            result = kg / (Math.pow(mts, 2));
            DecimalFormat formato1 = new DecimalFormat("#.0");
            resultBMITF.setText(String.valueOf(formato1.format(result)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debes ingresar numeros y sin campos vacios para realizar el calculo correctamente" + e.getMessage());
        }

    }

    private void llenarTabla(String matriz[][]) {
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        model.setRowCount(4);
        model.setColumnCount(2);

        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {

                tableInfo.setValueAt(matriz[i][j], i, j);

            }
        }

    }

    private void btnCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculatorActionPerformed
        calcularIMC();
    }//GEN-LAST:event_btnCalculatorActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculator;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField cmTF;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField kgTF;
    private javax.swing.JLabel lblBMI;
    private javax.swing.JLabel lblCm;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblMts;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeigth;
    private javax.swing.JTextField mtsTF;
    private javax.swing.JPanel principalJP;
    private javax.swing.JTextField resultBMITF;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables

}
