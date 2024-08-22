
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
        System.out.println("2. Setear hora");
        System.out.println("3. Setear dias");
        System.out.println("4. Incrementar Dia");
        System.out.println("5. Incrementar Hora");
        System.out.println("6. Decir hora");        
        System.out.println("7. Comer");       
        System.out.println("8. Limpiar pantalla");
        System.out.println("9. Hablar");
        System.out.println("10. Traducir frecuencia");
        System.out.println("11. Salir");
        
        boolean salir = true;
        while(salir==true){
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    break;
                 case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
               case 11:
                   salir=false;
                    break;      
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
}
