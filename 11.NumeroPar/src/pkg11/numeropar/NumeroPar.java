/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.numeropar;

/**
 *
 * @author terry
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 2;
        
        if(numero > 0) {
            if(numero % 2 == 0)
                System.out.println("Es un numero par");
            else 
                System.out.println("Es un numero impar");
        } else
            System.out.println("Introduzca un numero positivo");
    }
    
}
