/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aristotleprovatas_assignment2task4;

/**
 *
 * @author 6312971
 */
public class AristotleProvatas_Assignment2Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numStars = 1;
        int numLines = 1;
        int starsNeeded = 1;
        
        while (numLines <= 10) {
            while (numStars <= starsNeeded) {
                System.out.print('*');
                numStars++;
            }
            System.out.println();
            starsNeeded++;
            numStars = 1;
            numLines++;
        }
        
        numLines = 1;
        starsNeeded = 10;
        System.out.println();
        
        while (numLines <= 10) {
            while (numStars <= starsNeeded) {
                System.out.print('*');
                numStars++;
            }
            System.out.println();
            starsNeeded -= 1;
            numStars = 1;
            numLines++;
        }
        
        numLines = 1;
        starsNeeded = 10;
        System.out.println();
        int spacesNeeded = 10 - starsNeeded;
        int numSpaces = 0;
        
        while (numLines <= 10) {
            
            while (numStars <= starsNeeded) {
                while (numSpaces != spacesNeeded){
                    System.out.print(' ');
                    numSpaces++;
                }
                
                System.out.print('*');
                numStars++;
            }
            System.out.println();
            starsNeeded -= 1;
            spacesNeeded = 10 - starsNeeded;
            numStars = 1;
            numSpaces = 0;
            numLines++;
        }
        
        numLines = 1;
        starsNeeded = 1;
        System.out.println();
        spacesNeeded = 10 - starsNeeded;
        numSpaces = 1;
        
        while (numLines <= 10) {
            
            while (numStars <= starsNeeded) {
                while (numSpaces <= spacesNeeded){
                    System.out.print(' ');
                    numSpaces++;
                }
                
                System.out.print('*');
                numStars++;
            }
            System.out.println();
            starsNeeded++;
            spacesNeeded = 10 - starsNeeded;
            numStars = 1;
            numSpaces = 1;
            numLines++;
        }
    }    
}