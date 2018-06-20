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
        rollVentureDieButton.addActionListener(listener);
        startButton.addActionListener(listener);
        takePointsButton.addActionListener(listener);
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
        rollVentureDieButton = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        boundaryDiceOneTextPane = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        boundaryDiceTwoTextPane = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        ventureDiceTexPane = new javax.swing.JTextPane();
        startButton = new javax.swing.JButton();
        takePointsButton = new javax.swing.JButton();
        pressStartButtonLabel = new javax.swing.JLabel();

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

        rollVentureDieButton.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        rollVentureDieButton.setForeground(new java.awt.Color(0, 0, 204));
        rollVentureDieButton.setText("Roll Venture Dice");

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

        startButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        startButton.setForeground(new java.awt.Color(204, 0, 204));
        startButton.setText("Start");

        takePointsButton.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        takePointsButton.setForeground(new java.awt.Color(0, 0, 204));
        takePointsButton.setText("Take Points");

        pressStartButtonLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        pressStartButtonLabel.setText("Press start button to begin   --->");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addComponent(rollBoundaryDiceButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rollVentureDieButton)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scoreLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pressStartButtonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(takePointsButton)
                    .addComponent(startButton))
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
                            .addComponent(playersLabel1))
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
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rollVentureDieButton)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(takePointsButton)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(pressStartButtonLabel))
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
    private javax.swing.JLabel pressStartButtonLabel;
    private javax.swing.JButton rollBoundaryDiceButton;
    private javax.swing.JButton rollVentureDieButton;
    private javax.swing.JTextPane scoreFourTextPane;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JTextPane scoreOneTextPane;
    private javax.swing.JTextPane scoreThreeTextPane;
    private javax.swing.JTextPane scoreTwoTextPane;
    private javax.swing.JButton startButton;
    private javax.swing.JButton takePointsButton;
    private javax.swing.JTextPane ventureDiceTexPane;
    // End of variables declaration//GEN-END:variables

    Dice boundaryDiceOne = new Dice(0);                                     // create the dice
    Dice boundaryDiceTwo = new Dice(0);
    Dice ventureDice = new Dice(0);
    ArrayList players = new ArrayList();                                   // and a new array lsit
    ArrayList scores = new ArrayList();
    int currentScore = 0;
    int potentialScore = 0;
    String currentPlayer = "";
    boolean playerIs;
    boolean playerIsTwo;
    boolean playerIsThree;
    
    private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == startButton){
                players = readFromFile();
                int x = players.size();
                Collections.shuffle(players);
                if (x == 2){                                                    // If there are two players
                    String d = (String)players.get(0);
                    playerOneTextPane.setText(d);
                    scoreOneTextPane.setText(Integer.toString(0));
                    d = (String)players.get(1);
                    playerTwoTextPane.setText(d);
                    scoreTwoTextPane.setText(Integer.toString(0));
                    for(int i = 0; i < 2; i++){
                        scores.add(0);
                    }
                    playerThreeTextPane.setVisible(false);
                    playerFourTextPane.setVisible(false);
                    scoreThreeTextPane.setVisible(false);
                    scoreFourTextPane.setVisible(false);
                }
                else if (x == 3){                                               // If there are three players
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
                    playerFourTextPane.setVisible(false);
                    scoreFourTextPane.setVisible(false);
                }
                else if (x == 4){                                               // If there are four players
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
                currentPlayer = (String)players.get(0);
                startButton.setVisible(false);
                rollVentureDieButton.setVisible(false);
                takePointsButton.setVisible(false);
            }
            else if(e.getSource() == rollBoundaryDiceButton){                  // the the roll boundary dice button is clicked
                boundaryDiceOne.number = getRandomNumber(0, 7);           // roll the boundary dice
                String a = Integer.toString(boundaryDiceOne.number);
                boundaryDiceOneTextPane.setText(a);                      // and add them to the text feild
                boundaryDiceTwo.number = getRandomNumber(0, 7);
                String b = Integer.toString(boundaryDiceTwo.number);
                boundaryDiceTwoTextPane.setText(b);
                ventureDiceTexPane.setText("");
                potentialScore = initScore(boundaryDiceOne.number, boundaryDiceTwo.number);
                rollVentureDieButton.setVisible(true);
                takePointsButton.setVisible(true);
            }
            else if(e.getSource() == rollVentureDieButton){               // if the roll venture dice button is clicked
                int x = players.size();
                ventureDice.number = getRandomNumber(0, 7);              // roll the dice
                String z = Integer.toString(ventureDice.number);         // then add the values to the text feild
                currentScore += secondScore(boundaryDiceOne.number, boundaryDiceTwo.number, ventureDice.number);
                if(currentScore >= 100){
                    if(x == 2){
                        String a = (String)players.get(0);
                        playerIs = currentPlayer.equals(a);
                        if(playerIs == true){
                            scores.set(0, currentScore);
                        }
                        else{
                            scores.set(1, currentScore);
                        }
                        players.add(scores.get(0));
                        players.add(scores.get(1));
                    }
                    else if(x == 3){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        if(playerIs == true){
                            scores.set(0, currentScore);
                        }
                        else if(playerIsTwo == true){
                            scores.set(1, currentScore);
                        }
                        else{
                            scores.set(2, currentScore);
                        }
                        players.add(scores.get(0));
                        players.add(scores.get(1));
                        players.add(scores.get(2));
                    }
                    else{
                      String a = (String)players.get(0);
                      String b = (String)players.get(1);
                      String c = (String)players.get(2);
                      playerIs = currentPlayer.equals(a);
                      playerIsTwo = currentPlayer.equals(b);
                      playerIsThree = currentPlayer.equals(c);
                      if(playerIs == true){
                        scores.set(0, currentScore);
                      }
                      else if(playerIsTwo == true){
                        scores.set(1, currentScore);
                      }
                      else if(playerIsThree == true){
                        scores.set(2, currentScore);
                      }
                      else{
                          scores.set(3, currentScore);
                      }
                      players.add(scores.get(0));
                      players.add(scores.get(1));
                      players.add(scores.get(2));  
                      players.add(scores.get(3));
                    }
                    sendToFile(players);
                    goToGameOverWindow();
                }
                else{
                    if(x == 2){
                        String a = (String)players.get(0);
                        playerIs = currentPlayer.equals(a);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else{
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore =(int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    else if(x == 3){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else if(playerIsTwo == true){
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore = (int)scores.get(2);
                            currentPlayer = (String)players.get(2);
                        }
                        else{
                            scoreThreeTextPane.setText(Integer.toString(currentScore));
                            scores.set(2, currentScore);
                            currentScore = (int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    else if(x == 4){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        String c = (String)players.get(2);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        playerIsThree = currentPlayer.equals(c);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else if(playerIsTwo == true){
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore = (int)scores.get(2);
                            currentPlayer = (String)players.get(2);
                        }
                        else if(playerIsThree == true){
                            scoreThreeTextPane.setText(Integer.toString(currentScore));
                            scores.set(2, currentScore);
                            currentScore = (int)scores.get(3);
                            currentPlayer = (String)players.get(3);
                        }
                        else{
                            scoreFourTextPane.setText(Integer.toString(currentScore));
                            scores.set(3, currentScore);
                            currentScore = (int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    ventureDiceTexPane.setText(z);
                    rollVentureDieButton.setVisible(false);
                    takePointsButton.setVisible(false);
                }
            }
            else if(e.getSource() == takePointsButton){
                int x = players.size();
                currentScore += potentialScore;
                if(currentScore >= 100){
                    if(x == 2){
                        String a = (String)players.get(0);
                        playerIs = currentPlayer.equals(a);
                        if(playerIs == true){
                            scores.set(0, currentScore);
                        }
                        else{
                            scores.set(1, currentScore);
                        }
                        players.add(scores.get(0));
                        players.add(scores.get(1));
                    }
                    else if(x == 3){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        if(playerIs == true){
                            scores.set(0, currentScore);
                        }
                        else if(playerIsTwo == true){
                            scores.set(1, currentScore);
                        }
                        else{
                            scores.set(2, currentScore);
                        }
                        players.add(scores.get(0));
                        players.add(scores.get(1));
                        players.add(scores.get(2));
                    }
                    else{
                      String a = (String)players.get(0);
                      String b = (String)players.get(1);
                      String c = (String)players.get(2);
                      playerIs = currentPlayer.equals(a);
                      playerIsTwo = currentPlayer.equals(b);
                      playerIsThree = currentPlayer.equals(c);
                      if(playerIs == true){
                        scores.set(0, currentScore);
                      }
                      else if(playerIsTwo == true){
                        scores.set(1, currentScore);
                      }
                      else if(playerIsThree == true){
                        scores.set(2, currentScore);
                      }
                      else{
                          scores.set(3, currentScore);
                      }
                      players.add(scores.get(0));
                      players.add(scores.get(1));
                      players.add(scores.get(2));  
                      players.add(scores.get(3));
                    }
                    sendToFile(players);
                    goToGameOverWindow();
                }
                else{
                    if(x == 2){
                        String a = (String)players.get(0);
                        playerIs = currentPlayer.equals(a);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else{
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore =(int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    else if(x == 3){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else if(playerIsTwo == true){
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore = (int)scores.get(2);
                            currentPlayer = (String)players.get(2);
                        }
                        else{
                            scoreThreeTextPane.setText(Integer.toString(currentScore));
                            scores.set(2, currentScore);
                            currentScore = (int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    else if(x == 4){
                        String a = (String)players.get(0);
                        String b = (String)players.get(1);
                        String c = (String)players.get(2);
                        playerIs = currentPlayer.equals(a);
                        playerIsTwo = currentPlayer.equals(b);
                        playerIsThree = currentPlayer.equals(c);
                        if(playerIs == true){
                            scoreOneTextPane.setText(Integer.toString(currentScore));
                            scores.set(0, currentScore);
                            currentScore = (int)scores.get(1);
                            currentPlayer = (String)players.get(1);
                        }
                        else if(playerIsTwo == true){
                            scoreTwoTextPane.setText(Integer.toString(currentScore));
                            scores.set(1, currentScore);
                            currentScore = (int)scores.get(2);
                            currentPlayer = (String)players.get(2);
                        }
                        else if(playerIsThree == true){
                            scoreThreeTextPane.setText(Integer.toString(currentScore));
                            scores.set(2, currentScore);
                            currentScore = (int)scores.get(3);
                            currentPlayer = (String)players.get(3);
                        }
                        else{
                            scoreFourTextPane.setText(Integer.toString(currentScore));
                            scores.set(3, currentScore);
                            currentScore = (int)scores.get(0);
                            currentPlayer = (String)players.get(0);
                        }
                    }
                    rollVentureDieButton.setVisible(false);
                    takePointsButton.setVisible(false);
                }
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
    
    private void sendToFile(ArrayList a){
        try{
            FileOutputStream saveFile = new FileOutputStream("saveFile.sav");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(a);
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    private int initScore(int a, int b){
        int c;
        if(a == b){
            c = 15;
        }
        else if(a ==(b-1)){
            c = 10;
        }
        else if(b ==(a-1)){
            c = 10;
        }
        else{
            c = 0;
        }
        return c;
    }
    
    private int secondScore(int a, int b, int c){
        int d = 0;
        if(a == b){
            if(a == c){
                d = 25;
            }
            else{
                d = 0;
            }
        }
        else if(a == c){
            if(a == (b-1)){
                d = 15;
            }
            else if(b == (a-1)){
                d = 15;
            }
            else{
                d = 10;
            }
        }
        else if(b == c){
            if(b == (a -1)){
                d = 15;
            }
            else if(a == (b -1)){
                d = 15;
            }
            else{
                d = 10;
            }
        }
        else if (a < c){
            if(c > b){
                d = 0;
            }
            else{
                d = 5;
            }
        }
        else if(b < c){
            if(c > a){
                d = 0;
            }
            else{
                d = 5;
            }
        }
        return d;
    }
    
    private void goToGameOverWindow(){                               // Function to go to the game play window
        this.setVisible(false);
        gameOverWindow c = new gameOverWindow();
        c.setVisible(true);
    }
}
