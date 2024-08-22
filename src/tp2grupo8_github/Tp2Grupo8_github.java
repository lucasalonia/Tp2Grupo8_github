
package tp2grupo8_github;

import java.util.Scanner;


public class Tp2Grupo8_github {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona persona = new Persona();
        RelojFit reloj = new RelojFit();
        String nombre;
        String apellido;
        int edad;
        double altura;
        System.out.println("¿Deseaa ingresar valores para la persona?.si/no. En el caso que sea negativa se llenaran con valores predeterminados. ");
        String confirmar = leer.nextLine();
        
        if(confirmar.equalsIgnoreCase("si")||confirmar.equalsIgnoreCase("s")){
            System.out.println("Ingrese nombre de la persona:");
            nombre = leer.nextLine();
            System.out.println("Ingrese apellido:");
            apellido= leer.nextLine();
            System.out.println("Ingrese edad:");
            edad = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese altura:");
            altura = leer.nextDouble();
            leer.nextLine();
        }else{
            nombre = "Humberto";
            apellido = "Velez";
            edad = 48;
            altura = 1.80;
        }
        
        System.out.println("MENU");
        System.out.println("1. Cuenta pasos.");
        System.out.println("2. Imcrementar Dia");
        System.out.println("3. Imcrementar Hora");
        System.out.println("4. Decir hora");        
        System.out.println("5. Comer");       
        System.out.println("6. Limpiar pantalla");
        System.out.println("7. Hablar");
        System.out.println("8. Traducir frecuencia");
        System.out.println("9. Pulsaciones");
        
        
        
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
}
