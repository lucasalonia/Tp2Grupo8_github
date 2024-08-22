/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2grupo8_github;

/**
 *
 * @author nelso
 */
public class Persona {
    
     private String nombre, apellido;
    private int edad;
    private double altura;
    //private Reloj unReloj = null;

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        //this.unReloj = unReloj;
    }



    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public  void comer() {
            System.out.println("comiendo......");
}
    public void hablar() {
            System.out.println("Hola como te encuentras ");
    }
//        public void decirHora() {
//        if (unReloj != null) {
//            System.out.println("La hora es: " + unReloj.getHora());
//        } else {
//            System.out.println("No tengo un reloj asociado.");
//        }
//    }
    
    
    
}
