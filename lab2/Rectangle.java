/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
/**
 *
 * Matt Thomas 
 */
public class Rectangle{
    


public static void main(String[] args){

Scanner console = new Scanner(System.in);

int width;
int area;
int perimeter;
int length;

System.out.print("Enter the length: ");

length = console.nextInt();

System.out.println();


System.out.print(" Enter the width: ");

width = console.nextInt();

System.out.println();

area = length * width; // area is equal to length times width in a rectangle

System.out.println("Area = " + area);

perimeter = 2 * (length + width); // perimiter is all sides added together

System.out.println("Perimeter = " + perimeter);




} 
}