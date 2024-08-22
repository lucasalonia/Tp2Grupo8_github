/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2grupo8_github;

/**
 *
 * @author Adriana
 */
public class Reloj {
    protecte horas;
    protecte minutos;
    protecte segundos;

   
    public Reloj(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

   
    public void setHora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    
    public void incrementarSegundo() {
        this.segundos++;
        if (this.segundos >= 60) {
            this.segundos = 0;
            this.minutos++;
            if (this.minutos >= 60) {
                this.minutos = 0;
                this.horas++;
                if (this.horas >= 24) {
                    this.horas = 0;
                }
            }
        }
    }
}