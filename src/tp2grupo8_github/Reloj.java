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
                System.out.println("Dia no especifica");
                break;
        }
    }
//     public void incrementarHora(){
//         int hora = Integer.parseInt(this.hora);
//         hora=hora++;
//         this.hora = String.valueOf(hora);
//     }
//    if (0<=hora<=7){
//            System.out.println("buenas noches");
//                    
//    }else if (8<=hora<=12){
//            System.out.println("buen dia");
//            
//    }else if (13<=horas<=23){
//            System.out.println("buenas tardes ");
//}
    
        public void incrementarHora() {
        // Convertir la hora de String a int
        int horaInt = Integer.parseInt(this.hora);

        // Incrementar la hora en 1
        horaInt = (horaInt + 1) % 24; // Asegura que la hora se mantenga en el rango 0-23

        // Convertir de nuevo la hora a String
        this.hora = String.format("%02d", horaInt); // Formato de dos dígitos (ej: "09" en vez de "9")

        // Saludar según la hora del día
        if (horaInt >= 0 && horaInt <= 7) {
            System.out.println("Buenas noches");
        } else if (horaInt >= 8 && horaInt <= 12) {
            System.out.println("Buen día");
        } else if (horaInt >= 13 && horaInt <= 23) {
            System.out.println("Buenas tardes");
        }
    }
    
}