/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
import javax.swing.JOptionPane;
/**
 * Matt Thomas
 * Lab 4 Rock Paper Scissors
 * 
 */
public class RpsGame {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use rand for computer choice
        int choice;
        
        JOptionPane.showMessageDialog(null, "Welcome to RPS Shoot!");
        int rerun = 0;
        while (rerun == JOptionPane.YES_OPTION){
            choice = userSelect();
           JOptionPane.showMessageDialog(null, "Computer choice is" + cpChoice());  
           
        }
        
        // ask user for choice
        // compare to user choice
        // display results
        // loop until users decides to stop 
        // probably use a sentinal value
        // validate data by implementing some test cases
        // make a ton of methods for this
    }
    

// cp choice method
    // collects computer choice, returns 
public static int cpChoice(){
    int cpChoice = ((int)(Math.random() * 3) % 3);
    return(cpChoice);
}

//user selection method
// user enters 1, 2, or 3 in accordance with instructions
// returns their choice to main
public static int userSelect(){
    int userSelection;
    String intStr;
    intStr = JOptionPane.showInputDialog(null,"Select 1 for rock, 2 for paper, or 3 for scissors");
    userSelection = Integer.parseInt(intStr);
    
    return(userSelection);
    
}

}