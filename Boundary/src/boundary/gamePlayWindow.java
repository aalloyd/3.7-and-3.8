/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
/**
 *
 * @author lloyd
 */
public class gamePlayWindow extends javax.swing.JFrame {

    /**
     * Creates new form gamePlayWindow
     */
    public gamePlayWindow() {
        initComponents();
        EventListener listener = new EventListener();                    // Add event Listeners for the buutons
        rollBoundaryDiceButton.addActionListener(listener);
        rollVentureDieButon.addActionListener(listener);
        startButton.addActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreLabel = new javax.swing.JLabel();
        playersLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerOneTextPane = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        playerTwoTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        playerThreeTextPane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        playerFourTextPane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        scoreTwoTextPane = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        scoreThreeTextPane = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        scoreFourTextPane = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        scoreOneTextPane = new javax.swing.JTextPane();
        rollBoundaryDiceButton = new javax.swing.JButton();
        rollVentureDieButon = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        boundaryDiceOneTextPane = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        boundaryDiceTwoTextPane = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        ventureDiceTexPane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boundary");

        scoreLabel.setFont(new java.awt.Font("Arial", 2, 45)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 0, 0));
        scoreLabel.setText("SCORE");

        playersLabel1.setFont(new java.awt.Font("Arial", 2, 45)); // NOI18N
        playersLabel1.setForeground(new java.awt.Color(255, 0, 0));
        playersLabel1.setText("PLAYER");

        playerOneTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane1.setViewportView(playerOneTextPane);

        playerTwoTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane2.setViewportView(playerTwoTextPane);

        playerThreeTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane3.setViewportView(playerThreeTextPane);

        playerFourTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane4.setViewportView(playerFourTextPane);

        scoreTwoTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane5.setViewportView(scoreTwoTextPane);

        scoreThreeTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane6.setViewportView(scoreThreeTextPane);

        scoreFourTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane7.setViewportView(scoreFourTextPane);

        scoreOneTextPane.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jScrollPane8.setViewportView(scoreOneTextPane);

        rollBoundaryDiceButton.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        rollBoundaryDiceButton.setForeground(new java.awt.Color(0, 0, 204));
        rollBoundaryDiceButton.setText("Roll Boundary Dice");

        rollVentureDieButon.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        rollVentureDieButon.setForeground(new java.awt.Color(0, 0, 204));
        rollVentureDieButon.setText("Roll Venture Dice");

        boundaryDiceOneTextPane.setBackground(new java.awt.Color(0, 0, 0));
        boundaryDiceOneTextPane.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        boundaryDiceOneTextPane.setForeground(new java.awt.Color(255, 0, 0));
        boundaryDiceOneTextPane.setAutoscrolls(false);
        boundaryDiceOneTextPane.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane9.setViewportView(boundaryDiceOneTextPane);

        boundaryDiceTwoTextPane.setBackground(new java.awt.Color(0, 0, 0));
        boundaryDiceTwoTextPane.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        boundaryDiceTwoTextPane.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane10.setViewportView(boundaryDiceTwoTextPane);

        ventureDiceTexPane.setBackground(new java.awt.Color(0, 0, 0));
        ventureDiceTexPane.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        ventureDiceTexPane.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane11.setViewportView(ventureDiceTexPane);

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 51));
        jButton1.setText("Save Game");

        startButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        startButton.setForeground(new java.awt.Color(204, 0, 204));
        startButton.setText("Start");

        jButton2.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Take Points");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playersLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(scoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollBoundaryDiceButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rollVentureDieButon)
                                .addGap(12, 12, 12)))))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(startButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scoreLabel)
                            .addComponent(playersLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addComponent(rollBoundaryDiceButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rollVentureDieButon)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(startButton)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(gamePlayWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gamePlayWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gamePlayWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gamePlayWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gamePlayWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane boundaryDiceOneTextPane;
    private javax.swing.JTextPane boundaryDiceTwoTextPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane playerFourTextPane;
    private javax.swing.JTextPane playerOneTextPane;
    private javax.swing.JTextPane playerThreeTextPane;
    private javax.swing.JTextPane playerTwoTextPane;
    private javax.swing.JLabel playersLabel1;
    private javax.swing.JButton rollBoundaryDiceButton;
    private javax.swing.JButton rollVentureDieButon;
    private javax.swing.JTextPane scoreFourTextPane;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextPane scoreOneTextPane;
    private javax.swing.JTextPane scoreThreeTextPane;
    private javax.swing.JTextPane scoreTwoTextPane;
    private javax.swing.JButton startButton;
    private javax.swing.JTextPane ventureDiceTexPane;
    // End of variables declaration//GEN-END:variables

    Dice boundaryDiceOne = new Dice(0);                                     // create the dice
    Dice boundaryDiceTwo = new Dice(0);
    Dice ventureDice = new Dice(0);
    ArrayList players = new ArrayList();                                   // and a new array lsit
    ArrayList scores = new ArrayList();
    
    private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == startButton){
                players = readFromFile();
                Collections.shuffle(players);
                int x = players.size();
                if (x == 2){
                    String d = (String)players.get(0);
                    playerOneTextPane.setText(d);
                    scoreOneTextPane.setText(Integer.toString(0));
                    d = (String)players.get(1);
                    playerTwoTextPane.setText(d);
                    scoreTwoTextPane.setText(Integer.toString(0));
                    for(int i = 0; i < 2; i++){
                        scores.add(0);
                    }
                }
                else if (x == 3){
                    String d = (String)players.get(0);
                    playerOneTextPane.setText(d);
                    scoreOneTextPane.setText(Integer.toString(0));
                    d = (String)players.get(1);
                    playerTwoTextPane.setText(d);
                    scoreTwoTextPane.setText(Integer.toString(0));
                    d = (String)players.get(2);
                    playerThreeTextPane.setText(d);
                    scoreThreeTextPane.setText(Integer.toString(0));
                    for(int i = 0; i < 3; i++){
                        scores.add(0);
                    }
                }
                else if (x == 4){
                    String d = (String)players.get(0);
                    playerOneTextPane.setText(d);
                    scoreOneTextPane.setText(Integer.toString(0));
                    d = (String)players.get(1);
                    playerTwoTextPane.setText(d);
                    scoreTwoTextPane.setText(Integer.toString(0));
                    d = (String)players.get(2);
                    playerThreeTextPane.setText(d);
                    scoreThreeTextPane.setText(Integer.toString(0));
                    d = (String)players.get(3);
                    playerFourTextPane.setText(d);
                    scoreFourTextPane.setText(Integer.toString(0));
                    for(int i = 0; i < 4; i++){
                        scores.add(0);
                    }
                }
                startButton.hide();
            }
            if(e.getSource() == rollBoundaryDiceButton){                  // the the roll boundary dice button is clicked
                boundaryDiceOne.number = getRandomNumber(0, 7);           // roll the boundary dice
                String a = Integer.toString(boundaryDiceOne.number);
                boundaryDiceOneTextPane.setText(a);                      // and add them to the text feild
                boundaryDiceTwo.number = getRandomNumber(0, 7);
                String b = Integer.toString(boundaryDiceTwo.number);
                boundaryDiceTwoTextPane.setText(b);
            }
            else if(e.getSource() == rollVentureDieButon){               // if the roll venture dice button is clicked
                ventureDice.number = getRandomNumber(0, 7);              // roll the dice
                String c = Integer.toString(ventureDice.number);         // then add the values to the text feild
                ventureDiceTexPane.setText(c);
            }
        }
    }
    
    private int getRandomNumber(int a, int b){
        return (int)(Math.random() * ((a - b) + 1) + b);
    }
    
    private ArrayList readFromFile(){
        ArrayList a = new ArrayList();
        try{
            FileInputStream saveFile = new FileInputStream("saveFile.sav");
            ObjectInputStream save = new ObjectInputStream(saveFile);
            a = (ArrayList)save.readObject();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
        return a;
    }
}
