/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotleprovatas_assignment2task3;
import java.util.Scanner;
/**
 *
 * @author 6312971
 */
public class AristotleProvatas_Assignment2Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int productNum;
        int quantitySold;
        double total = 0;
        double price = 0;
        
        while (true) {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            productNum = input.nextInt();
            if (productNum == 0) {
                break;
            }
            
            switch (productNum){
                case 1 -> price = 2.98;
                case 2 -> price = 4.50;
                case 3 -> price = 9.98;
                case 4 -> price = 4.49;
                case 5 -> price = 6.87;
            }
            System.out.print("Enter quantity sold: ");
            quantitySold = input.nextInt();
            total += price * quantitySold;
        }
        System.out.println("Total retail value of all products sold is: "+total);
    }
}
