/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author lloyd
 */
public class playerNameWindow extends javax.swing.JFrame {

    /**
     * Creates new form playerNameWindow
     */
    public playerNameWindow() {
        initComponents();
        EventListener listenerd = new EventListener();
        submitButtonOne.addActionListener(listenerd);
        continueButton.addActionListener(listenerd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterAPlayersName = new javax.swing.JLabel();
        playerNameTextFeild = new javax.swing.JTextField();
        submitButtonOne = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        playersLabel = new javax.swing.JLabel();
        playersTextFeild = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));

        enterAPlayersName.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        enterAPlayersName.setForeground(new java.awt.Color(255, 0, 0));
        enterAPlayersName.setText("Enter a Players Name:");

        playerNameTextFeild.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        playerNameTextFeild.setForeground(new java.awt.Color(0, 0, 204));

        submitButtonOne.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        submitButtonOne.setForeground(new java.awt.Color(0, 0, 255));
        submitButtonOne.setText("Submit");
        submitButtonOne.setToolTipText("");

        continueButton.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        continueButton.setForeground(new java.awt.Color(0, 0, 204));
        continueButton.setText("Continue");

        playersLabel.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        playersLabel.setForeground(new java.awt.Color(255, 0, 0));
        playersLabel.setText("Players:");

        playersTextFeild.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        playersTextFeild.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterAPlayersName)
                            .addComponent(playersLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(playersTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(playerNameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(continueButton)
                            .addComponent(submitButtonOne))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(enterAPlayersName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerNameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButtonOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(playersLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continueButton)
                    .addComponent(playersTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
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
            java.util.logging.Logger.getLogger(playerNameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playerNameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playerNameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playerNameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playerNameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel enterAPlayersName;
    private javax.swing.JTextField playerNameTextFeild;
    private javax.swing.JLabel playersLabel;
    private javax.swing.JTextField playersTextFeild;
    private javax.swing.JButton submitButtonOne;
    // End of variables declaration//GEN-END:variables

    public ArrayList<String> players = new ArrayList<String>();
    private String b = "";
    private int x = 0;
    
    public class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent z){
            if (z.getSource()==submitButtonOne){
                String a = playerNameTextFeild.getText();
                b = b + " " + a;
                players.add(a);
                x = players.size();
                playersTextFeild.setText(b);
                playerNameTextFeild.setText("");
            }
            if (z.getSource()==continueButton){
                if (x >= 2){
                    if(x <= 4){
                        goToGamePlayWindow();
                    }
                }
            }
        }
    }
    
    private void goToGamePlayWindow(){
        this.setVisible(false);
        gamePlayWindow c = new gamePlayWindow();
        c.setVisible(true);
    }

}
