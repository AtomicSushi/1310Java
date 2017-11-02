/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner; 
/**
 *
 * Matt Thomas
 */
 
// File: Errors.java 
// Purpose: A program with lots of syntax errors 
// Correct all of the errors (study the program carefully!!) 


public class Errors{
 
public static void main (String[] args){ 

String name; // Name of the user 
int number; 
int numSq; 
Scanner scan = new Scanner(System.in); 

System.out.print("Enter your first/last name, please: "); 
name = scan.next(); 

System.out.print ("What is your favorite number?"); 
number = scan.nextInt();  // accept number to square

numSq = number * number; // multiply number by itself to find the square 

System.out.println(name + ", the square of your number is " + 
numSq); 

} 
}

