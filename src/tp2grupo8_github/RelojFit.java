/*
MATIAS MARTINEZ
3-Crear la subclase RelojFit de Reloj, con metodos cuentaPasos(coordenadas x, y), y frecuenciaAleatoria.
 */
package tp2grupo8_github;

import java.util.Random;


public class RelojFit extends Reloj {
    
    public int frecuenciaAleatoria() {
        Random random = new Random();
        return 60 + random.nextInt(100);  // Frecuencia entre 60 y 159 bpm
    }
    
    
}
