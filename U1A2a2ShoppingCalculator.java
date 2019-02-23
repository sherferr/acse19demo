/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1a2a2shoppingcalculator;

import java.util.Scanner;
import java.text.*; 

/**
 *
 * @author sherferr
 */
public class U1A2a2ShoppingCalculator {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program 2: Shopping! 
        // This program should prompt the user for the number of USB storage devices 
        // they would like to purchase, the number of keyboards they would like to purchase, 
        // and the number of computer mice they would like to purchase. 
        // The program should then calculate and output a subtotal for their order, 
        //the amount of taxes, and grand total based on the following prices:
        // USB storage device: $19.99
        // Keyboard: $49.99
        // Computer Mouse: $25.99
        
        int numUSBs;
        int numKeyboards;
        int numMice;
        final double PRICE_USBS = 19.99;
        final double PRICE_KEYBOARDS = 49.99;
        final double PRICE_MICE = 25.99;
        double usbTotal;
        double keyboardTotal;
        double miceTotal;
        double subtotal;
        
        DecimalFormat x = new DecimalFormat("###.##"); 
        
        
        
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("Greetings. This program will calculate your order subtotal.");
        System.out.println("");
        System.out.println("How many USB storage devices would you like to buy?");
        numUSBs = keyedInput.nextInt();
        System.out.println("How many keyboards would you like to buy?");
        numKeyboards = keyedInput.nextInt();
        System.out.println("How many mice would you like to buy?");
        numMice = keyedInput.nextInt();
        
        //calculations
        
        usbTotal = numUSBs  * PRICE_USBS;
        keyboardTotal = numKeyboards * PRICE_KEYBOARDS;
        miceTotal = numMice * PRICE_MICE;
        subtotal = (usbTotal+keyboardTotal+miceTotal);
     
        
        
        System.out.println("Your subtotal comes to: $" + x.format(subtotal));
        
        
       
    }
    
}
