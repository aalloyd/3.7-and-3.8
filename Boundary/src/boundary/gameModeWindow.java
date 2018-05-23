/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author lloyd
 */
public class gameModeWindow extends javax.swing.JFrame {

    /**
     * Creates new form gameModeWindow
     */
    public gameModeWindow() {
        initComponents();
        EventListener listenera = new EventListener();
        playerVsPlayerButton.addActionListener(listenera);
        playerVsComputerButton.addActionListener(listenera);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectLabel = new javax.swing.JLabel();
        playerVsPlayerButton = new javax.swing.JButton();
        playerVsComputerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectLabel.setFont(new java.awt.Font("Arial", 2, 50)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(255, 0, 0));
        selectLabel.setText("SELECT GAME MODE");

        playerVsPlayerButton.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        playerVsPlayerButton.setForeground(new java.awt.Color(0, 0, 204));
        playerVsPlayerButton.setText("Player Vs Player");

        playerVsComputerButton.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        playerVsComputerButton.setForeground(new java.awt.Color(0, 0, 204));
        playerVsComputerButton.setText("Player Vs Computer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerVsComputerButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(selectLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(playerVsPlayerButton)
                            .addGap(15, 15, 15))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(selectLabel)
                .addGap(108, 108, 108)
                .addComponent(playerVsPlayerButton)
                .addGap(44, 44, 44)
                .addComponent(playerVsComputerButton)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(gameModeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameModeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameModeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameModeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameModeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton playerVsComputerButton;
    private javax.swing.JButton playerVsPlayerButton;
    private javax.swing.JLabel selectLabel;
    // End of variables declaration//GEN-END:variables
    private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent f){
            if(f.getSource() == playerVsPlayerButton){
                gameModeWindowButtonActionPerformed();
            }
            else if(f.getSource() == playerVsComputerButton){
                gameModeWindowButtonActionPerformed();
            }
        }
    }
    
    private void gameModeWindowButtonActionPerformed(){
        this.setVisible(false);
        numberOfPlayerWindow c = new numberOfPlayerWindow();
        c.setVisible(true);
    }


}
