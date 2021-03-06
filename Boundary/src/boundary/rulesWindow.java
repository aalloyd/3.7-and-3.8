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
public class rulesWindow extends javax.swing.JFrame {

    /**
     * Creates new form rulesWindow
     */
    public rulesWindow() {
        initComponents();
        EventListener listener = new EventListener();                 // Add an event Listener for the go back button
        goBackButton.addActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        rulesTextArea = new javax.swing.JTextArea();
        rulesLabel = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boundary");

        rulesTextArea.setColumns(20);
        rulesTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rulesTextArea.setRows(5);
        rulesTextArea.setText("Welcome to Boundary, this is a game for two - four players. \nYou can either play against the computer or other people. \nThe order of players is randomly chosen. \n\nOn a players turn they initially roll two boundary dice. \nIf the two boundary dice are the same, the player can then either take ten points or roll the venture dice. If they \nchoose to roll the venture dice they must roll the same number as the two boundary dice otherwise they will gain \nno points. If they manage to roll the same number as the two boundary dice they will gain twenty-five points. \n\nIf the two boundary dice are two numbers which lie beside each other in numerical order (e.g. 4 and 5 or 3 and 2), \nthe player can either take five points or roll the venture dice. If they choose to roll the venture dice, they must roll \none of the numbers on the boundary dice, otherwise they will gain no points. If they do manage to roll one of the\n boundary dice they gain fifteen points.\n\nIf the two boundary dice have at least one number in between them they player can roll the venture dice again. \nWhen they roll the venture dice it must be the number (or one of the numbers) which lies in between the two \nboundary dice, or it must be one of the boundary dice. If it is in between the two boundary dice, the player gains \nten points. If it is one of the boundary dice, the player gains five points. If it is neither, the player gains no points. \nAfter this it is then the next players turn.\n\nThis is repeated until one player has gained one hundred points. This player is then declared the winner.");
        rulesTextArea.setPreferredSize(new java.awt.Dimension(450, 200));
        jScrollPane1.setViewportView(rulesTextArea);

        rulesLabel.setFont(new java.awt.Font("Arial", 2, 50)); // NOI18N
        rulesLabel.setForeground(new java.awt.Color(255, 0, 0));
        rulesLabel.setText("RULES");

        goBackButton.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(0, 0, 204));
        goBackButton.setText("Go Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rulesLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rulesLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(goBackButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(19, 19, 19))
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
            java.util.logging.Logger.getLogger(rulesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rulesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rulesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rulesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rulesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rulesLabel;
    private javax.swing.JTextArea rulesTextArea;
    // End of variables declaration//GEN-END:variables
    private class EventListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           if(e.getSource() == goBackButton){
               goBackButtonActionPerformed();
           }
       }
    }
    
    private void goBackButtonActionPerformed(){                            // Function to go back to the start up window
        this.setVisible(false);
        startUpWindow c = new startUpWindow();
        c.setVisible(true);
    }

}
