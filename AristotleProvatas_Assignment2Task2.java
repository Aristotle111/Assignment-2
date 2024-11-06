 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotleprovatas_assignment2task2;
/**
 *
 * @author 6312971
 */
public class AristotleProvatas_Assignment2Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int side1 = 0;
        int side2 = 0; 
        int hypotenuse = side1 * side2;
        System.out.printf("%-8s%-8s%s\n", "Side 1", "side 2", "Hypotenuse");
        
        int maxI = 500;
        for (side1 = 1; side1 <= maxI; side1++){
            for (side2 = 1; side2 <= maxI; side2++){
                for (hypotenuse = 1; hypotenuse <= maxI; hypotenuse++){
                    if ((side1 * side1) + (side2 * side2) == (hypotenuse * hypotenuse))
                    System.out.printf("%-8d%-8d%d\n",side1,side2,hypotenuse);
                }
            }
        }
    }
}
    