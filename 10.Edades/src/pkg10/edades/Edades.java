/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.edades;

import java.util.Scanner;

/**
 *
 * @author terry
 */
public class Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = read.nextInt();
        
        if(edad<12)
            System.out.println("Eres un niño");
        else if(edad>=12 && edad<=17)
            System.out.println("Eres un adolescente");
        else if(edad>=18 && edad<=60)
            System.out.println("Eres un mayor de edad");
        else
            System.out.println("Ruco");
    }
    
}
