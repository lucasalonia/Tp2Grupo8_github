/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2grupo8_github;

import java.util.Scanner;

/**
 *
 * @author salon
 */
public class Tp2Grupo8_github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        Persona persona = new Persona();
//        RelojFit reloj = new RelojFit();
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
        
//        int opcion = leer.
//        switch (opcion) {
//            case 1:
//                
//                break;
//            default:
//                throw new AssertionError();
//        }
        
        
    }
    
}
