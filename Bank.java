/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.*;
import java.text.NumberFormat;


/**
 *
 * Matt Thomas
 * Lab3a
 * Bank account management system
 * 
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double minBalance = 0.00; // minimum balance 
        final int sCsav = 10; // service charge for savings
        final int sCchk = 25; // service charge for checking
        final double sInterest = .04; // savings interest
        final double cBigInterest = .03; // checking 5000+
        final double cSmallInterest = .05; // checking 5000-
        
        Scanner input = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        
        int account1;
        double currentBalance;
        
        System.out.println("Welcome! Please enter your account number.");
        account1 = input.nextInt(); // the user account 
        
        System.out.println("enter one letter (c,C,s, or S) for account type");
         // char as s or c / S or C
        System.out.println("c/C for checking, s/S for savings");
        
        char accountType = input.next().charAt(0);// the account type, as char
        
        //if (accountType == 's' || accountType == 'S' || accountType == 'c'  
             //   || accountType == 'C'){
          //      System.out.println(" Invalid entry! Try again!")
       // }
        System.out.println("\nPlease enter the minimum balnce:\n");
                minBalance = input.nextDouble();
        System.out.println("Please enter current balance");// enters current and
            currentBalance = input.nextDouble(); // minimum balance of account
            
       if (accountType != 's' && accountType != 'S' && accountType != 'c' && accountType != 'C'){
           System.out.println("Invalid account type, try again!");
           System.exit(0);
       }
        if (currentBalance < minBalance){ // if below minimum
            if (accountType == 's' || accountType == 'S'){ // savings account
                System.out.println("Your balance is below the limit, you have "
                        + "been deducted a service charge of $10");
                currentBalance -= sCsav; // charged a fee
                System.out.println("Your new balance is " + 
                        fmt1.format(currentBalance)); // new balance
                System.exit(0);
     
            }
            else if (accountType == 'c' || accountType == 'C'){ // checking account
                System.out.println("Your balance is below the limit, you have "
                        + "been deducted a service charge of $10");
                currentBalance -= sCchk; // charged 
                System.out.println("Your new balance is " + 
                        fmt1.format(currentBalance)); // new balance
                System.exit(0);
                
            }
        }
        else if (accountType == 'c' || accountType == 'C'){
            if (currentBalance >= 5000){ // balance is over 5000 in checking
                currentBalance = currentBalance + (currentBalance * cBigInterest);
                       System.out.println("Your new balance is "
                               + fmt1.format(currentBalance) + "\nYour checking account has"
                                       + " been granted"
                                       + " 5% interest"); // new balance printed
                       System.exit(0);
                               
            }
            if (currentBalance < 5000){ // checking balance is below 5k
                currentBalance = currentBalance + (currentBalance * cSmallInterest);
                System.out.println("Your new balance is "
                               + fmt1.format(currentBalance) + " Your checking account has been granted"
                                       + " 3% interest"); // new balance with interest printed
                System.exit(0);
            }
            if (currentBalance == 0.00){ // no balance!
                System.out.println("Your checking account "
                        + "balance is $0.00");
                System.exit(0);
            }
        }     
        else if (accountType == 's' || accountType == 'S'){ // savings account
            if (currentBalance > 0){
                currentBalance = currentBalance + (currentBalance * sInterest);
                System.out.println("Your new balance is "
                               + fmt1.format(currentBalance) + " Your savings account has"
                                       + " been granted"
                                       + " 4% interest"); // new balance
                System.exit(0);
            }
            else if (currentBalance == 0.00){ // you're broke!
                System.out.println("Your savings account balance is $0.00");
               System.exit(0);
            }
        }
        else{
            System.out.println("No valid account type entered. Try again!");
            System.exit(0); // bad account input
        }
               
        
        
        
        
        
        
        
        
        
        
    }
    
}
