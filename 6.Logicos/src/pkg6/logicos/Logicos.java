package pkg6.logicos;

public class Logicos {

    public static void main(String[] args) {
        boolean v = true;
        boolean f = false;
        
        System.out.println("v && f = " +(v && f));
        // falso
        
        System.out.println("v || f = " +(v || f));
        // verdadero
        
        System.out.println("!(v && f) = " +!(v && f));
        // verdadero
        
    }
    
}
