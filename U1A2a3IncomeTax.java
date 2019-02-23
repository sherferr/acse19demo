/*
 * Modified at the ACSE conference.
 * Just for kicks!
 */
package u1a2a3incometax;

import java.util.Scanner;

/**
 *
 * @author sherferr
 */
public class U1A2a3IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This program should prompt the user to enter in their salary. 
        // The program will then determine the amount of income tax that 
        // they owe. The income tax amount should be determined using data 
        // from the Government of Canada tax brackets and rates.
        // Teacher's note: I am assuming a tax rate of 15% for simplicities' 
        // sake. Multiple tax brackets would require the use of selection 
        // structures and this comes later in the course.
        
        double salary;
        double taxPayable;
        double taxRate= 0.15;
        
        System.out.println("Please enter your annual salary: $");
        Scanner input = new Scanner (System.in);  
        salary = Double.parseDouble (input.next()); 
        
        // calculate tax owing
        taxPayable = salary * taxRate;
        System.out.println("Your tax payable on $" + salary + " would be: $" + taxPayable);
        
        
    }
    
}
