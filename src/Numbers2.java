/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gregelliott
 */
public class Numbers2 extends javax.swing.JFrame {

    /**
     * Creates new form Numbers2
     */
    public Numbers2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfactorial = new javax.swing.JTextField();
        btnfactorial = new javax.swing.JButton();
        lblfactorialoutput = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtprime = new javax.swing.JTextField();
        btnprime = new javax.swing.JButton();
        lblprimeoutput = new javax.swing.JLabel();
        lblfactoriallabel = new javax.swing.JLabel();
        lblprimelabel = new javax.swing.JLabel();
        lblFSlabel = new javax.swing.JLabel();
        txtFS = new javax.swing.JTextField();
        btnFS = new javax.swing.JButton();
        lblFSoutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnfactorial.setText("Calculate");
        btnfactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactorialActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Malayalam MN", 0, 24)); // NOI18N
        lblTitle.setText("Numbers");

        txtprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimeActionPerformed(evt);
            }
        });

        btnprime.setText("Calculate");
        btnprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeActionPerformed(evt);
            }
        });

        lblfactoriallabel.setText("Enter a number and the program will determine its factorial");

        lblprimelabel.setText("Enter a number and the program will determine if it is prime");

        lblFSlabel.setText("Enter a number and the program will determine the value of the Fibonacci Sequence at that number");

        txtFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFSActionPerformed(evt);
            }
        });

        btnFS.setText("Calculate");
        btnFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfactoriallabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtprime, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnfactorial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnprime, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfactorialoutput)
                            .addComponent(lblprimeoutput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblTitle))
                    .addComponent(lblprimelabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFSlabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnFS)
                        .addGap(18, 18, 18)
                        .addComponent(lblFSoutput)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblfactoriallabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfactorial)
                    .addComponent(lblfactorialoutput))
                .addGap(12, 12, 12)
                .addComponent(lblprimelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprime)
                    .addComponent(lblprimeoutput))
                .addGap(18, 18, 18)
                .addComponent(lblFSlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFS)
                    .addComponent(lblFSoutput))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactorialActionPerformed
        // TODO add your handling code here:
        int factorial=Integer.parseInt(txtfactorial.getText());
        for (int i=factorial-1;i>=1;i=i-1)
        {
            factorial=factorial*i;
        }
        lblfactorialoutput.setText(String.valueOf(factorial));
    }//GEN-LAST:event_btnfactorialActionPerformed

    private void btnprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeActionPerformed
        // TODO add your handling code here:
        int usernum;
        int remainder;
        boolean prime=true;
        
        usernum=Integer.parseInt(txtprime.getText());
        for (int i=2;i<=usernum/2;i=i+1)
        {
            remainder=usernum%i;
            
            if (remainder==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
            lblprimeoutput.setText("The number is prime");
        
        else
            lblprimeoutput.setText("The number is not prime");
        
    }//GEN-LAST:event_btnprimeActionPerformed

    private void txtprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimeActionPerformed

    private void txtFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFSActionPerformed

    private void btnFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFSActionPerformed
        // TODO add your handling code here:
        int num= Integer.parseInt(txtFS.getText());
        int fibMinusOne=1, fibMinusTwo=1, temp=0;
        
        for (int i=3; i<num;i++)
        {
            temp=fibMinusOne+fibMinusTwo;
            fibMinusOne=fibMinusTwo;
            fibMinusTwo=temp;
        }
        temp=fibMinusOne+fibMinusTwo;
        lblFSoutput.setText(String.valueOf(temp));
    }//GEN-LAST:event_btnFSActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Numbers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numbers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numbers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numbers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numbers2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFS;
    private javax.swing.JButton btnfactorial;
    private javax.swing.JButton btnprime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFSlabel;
    private javax.swing.JLabel lblFSoutput;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblfactoriallabel;
    private javax.swing.JLabel lblfactorialoutput;
    private javax.swing.JLabel lblprimelabel;
    private javax.swing.JLabel lblprimeoutput;
    private javax.swing.JTextField txtFS;
    private javax.swing.JTextField txtfactorial;
    private javax.swing.JTextField txtprime;
    // End of variables declaration//GEN-END:variables
}
