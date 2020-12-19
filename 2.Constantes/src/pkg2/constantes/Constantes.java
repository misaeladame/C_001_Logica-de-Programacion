package pkg2.constantes;

public class Constantes 
{
    public static void main(String[] args) 
    {
        final double pi = 3.14;
        double n1 = 2.5;
        double n2 = 7.2;
        double n3;
        
        n3 = pi;
        n2 = n3 + pi;
        n1 = n2 / n1;
        n3 = n2 + n1;
        n2 = n2 - pi;
        
        System.out.println("El valor de n1 es = " +n1);
        System.out.println("El valor de n2 es = " +n2);
        System.out.println("El valor de n1 es = " +n3);
        
    }    
}
