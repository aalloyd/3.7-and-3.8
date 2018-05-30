/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import java.util.ArrayList;

/**
 *
 * @author lloyd
 */
public class Boundary {

    private ArrayList<player> players = new ArrayList<player>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       startUpWindow window = new startUpWindow();
       window.setVisible(true);
    }
    
}
