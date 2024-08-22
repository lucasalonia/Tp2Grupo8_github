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
    protected String hora;
    protected String dia;
    protected String modelo;
    protected long numSerie ;

//    public void setHora(int horas, int minutos, int segundos) {
//        this.horas = horas;
//        this.minutos = minutos;
//        this.segundos = segundos;
//    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }

 

    public String mostrarHora() {
        return hora;
    }

    public void incrementarDia(){
        this.dia=dia.toLowerCase();
        switch (this.dia) {
            case "domingo":
                this.dia="lunes";
                break;
            case "lunes":
                this.dia="martes";
                break;
            case "martes":
                this.dia="miercoles";
                break;
            case "miercoles":
                this.dia="jueves";
                break;
            case "jueves":
                this.dia="viernes";
                break;
            case "viernes":
                this.dia="sabado";
                break;
            case "sabado":
                this.dia="domingo";
                break;
            default:
                System.out.println("No especifica dia");
                break;
        }
    }
     public void incrementarHora(){
         int hora = Integer.parseInt(this.hora);
         hora=hora+1;
         this.hora=String.valueOf(hora);
     }
}