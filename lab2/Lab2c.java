/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner; // for input
import java.util.Formatter; // for formating currency strings


/**
 *
 * author: Matt Thomas
 * Lab2c citc1310 
 */
public class Lab2c {
   
    public static void main(String[] args){
        
    
    final double taxRate = .14;
    final double clothesP = .10;// these dconstants are percentages 
    final double sSupplies = .01;// of income spent concurrently
    final double bondsRate = .25;
    final double bondsParents = bondsRate * .5;
    double payRate;
    double taxes;
    double hours;
    double pHours;
    double netP;// these are placehoders, and calculation variables
    double heldPay;
    double clothingCash;
    double schoolCash;
    double bondCash;
    double totalBond;
    double pBonds; // parents bond contribution
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to Lab2c! please enter your pay rate ex: 2.50 for 2.50 per hour");
    payRate = input.nextDouble();
    System.out.println("excellent! Now enter the amount of hours worked in the past 4 weeks");
    hours = input.nextDouble();
    pHours = payRate * hours; // pay before tax
    taxes = pHours * taxRate; //taxes payed
    netP = pHours - taxes; // pay after taxes
    heldPay = netP;
    clothingCash = heldPay * clothesP; // money spent on clothing
    heldPay -= clothingCash; // subtract clothing from wallet
    schoolCash = heldPay * sSupplies; // money for school supplies
    heldPay -= schoolCash;// subtract from wallet
    bondCash = heldPay * bondsRate; //money in bonds
    heldPay -= bondCash; // take that money away
    pBonds = (bondCash * .5);
    totalBond = pBonds + bondCash;
    // below: using format to print decimal to two places, and placing a 
    // $ sign before printing
    System.out.println("\\\\\\\\\\//////////");
    System.out.println("Pre-Tax Pay:        $" + 
            String.format("%.2f",pHours));
    System.out.println("Taxes:              $" + 
            String.format("%.2f",taxes));
    System.out.println("Net Pay:            $" +
            String.format("%.2f",netP));
    System.out.println("Clothing cost:      $" + 
            String.format("%.2f",clothingCash));
    System.out.println("School fees:        $" + 
            String.format("%.2f",schoolCash));
    System.out.println("Bondexpens:        $" + 
            String.format("%.2f",bondCash));
    System.out.println("Bonds from parents: $" + 
            String.format("%.2f",pBonds));
    System.out.println("Total Bond Costs:   $" + 
            String.format("%.2f",totalBond));
    System.out.println("Money left:         $" + 
            String.format("%.2f",heldPay));
    
    
    
    
    
    
    
    
    
    }
    
}
