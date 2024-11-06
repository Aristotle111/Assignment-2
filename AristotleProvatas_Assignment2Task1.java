/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotleprovatas_assignment2task1;
import java.util.Scanner;
/**
 *
 * @author 6312971
 */
public class AristotleProvatas_Assignment2Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world population calculator");
        
        System.out.print("Enter the current world population: ");
        long pop = input.nextLong();
        
        System.out.print("Enter the current growth rate: (e.g, 1.14% would be .0114): ");
        double growth = input.nextDouble();
        
        System.out.print("Year  Estimated Population  Change from prior Year\n");
        
        int years = 1;
        while (years <= 75) {
            double pChange = (pop * growth);
            pop += pChange;
            System.out.printf("%4d %21d %23.0f\n",years,pop,pChange);
            years++;
        }
    }
    
}
