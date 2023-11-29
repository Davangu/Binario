/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dec2bin;
import java.util.Scanner;

/**
 *
 * @author antolin
 */
public class Dec2Bin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	//int i=0; Remove i, because it's never used
        do {
        System.out.print("Introduzca un número que sea mayor que 0: ");                                                           
            n = sc.nextInt();
        } while (n <= 0); // Changed i to n

        System.out.print("\nBinario: ");
        decBin(n); // Changed the calling function from decBinario to decBin
        System.out.println();
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n <= 1) { // Changed 2 to 1 because the base cases are 0 and 1 to stop recursivity
             System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n%2); // Change the operator to get the "resto" of the division
        }
    }
    
}
