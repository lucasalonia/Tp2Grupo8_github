
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
        reloj.setHora("16");
        System.out.println("Hora inicial: "+reloj.getHora());
        
        reloj.setHora("Domingo");
        System.out.println("Dia inicial: "+reloj.getDia());
        
        System.out.println("MENU");
        System.out.println("1. Cuenta pasos.");
        System.out.println("2. Consultar hora");
        System.out.println("3. Consultar dia");
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
                    System.out.println("¿Que distancia recorrio");
                    int distancia = leer.nextInt();
                    reloj.cuentaPasos(distancia);
                    break;
                 case 2:
                     System.out.println("La hora es: ");
                     reloj.getHora();
                     break;
                case 3:
                    System.out.println("El dia es: ");
                     reloj.getDia();
                    break;
                case 4:
                    reloj.incrementarDia();
                    System.out.println("El dia avanza a: "+reloj.getDia());
                    break;
                case 5:
                    reloj.incrementarHora();
                    System.out.println("La hora avanza a: "+reloj.getHora());
                    break;
                case 6:
                    persona.decirHora(reloj);
                    break;
                case 7:
                    persona.comer();
                    break;
                case 8:
                    System.out.println("Pantalla");
                    break;
                case 9:
                    persona.hablar();
                    break;
                case 10:
                    System.out.println("La frecuencia es: "+reloj.frecuenciaAleatoria());
                    break;
               case 11:
                   salir=false;
                    break;      
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        
    }
    
}
