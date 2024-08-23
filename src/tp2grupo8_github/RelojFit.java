/*
MATIAS MARTINEZ
3-Crear la subclase RelojFit de Reloj, con metodos cuentaPasos(coordenadas x, y), y frecuenciaAleatoria.
 */
package tp2grupo8_github;

import java.util.Random;


//public class RelojFit extends Reloj {

   /* private int pasos;
    
    public void cuentaPasos(int distancia){
        pasos=0;
        pasos=distancia*1333; //1 km equivale a 1333 pasos
        
    }
    
    public int frecuenciaAleatoria() {
        Random random = new Random();
        return 60 + random.nextInt(100);  // Frecuencia entre 60 y 159 bpm
    }

    public int getPasos() {
        return pasos;
    }
*/
    
    public class RelojFit extends Reloj {
    private int pasos;
    private double xAnterior;
    private double yAnterior;

      public RelojFit() {
        this.pasos = 0;
        this.xAnterior = 0;
        this.yAnterior = 0;
    }
      
      
      
    // Método para contar pasos basado en el cambio de coordenadas y altura ,usar unidades en metro
    public void cuentaPasos(double x, double y,double altura) {
  
        double distanciaRecorrida =calcularDistancia(x,y);

        /* la longitud media del paso es aproximadamente el 40 % de la estatura de la persona. 
        Más concretamente, el coeficiente para cada sexo es 41.5 % para los hombres y 41.3 % para las mujeres*/
        System.out.println("DISTANCIA RECORRIDA" + distanciaRecorrida);
        double longitudDelPasoHombre= 0.415 * altura ;
        
        //calcula la cantidad de pasos
         int pasosDados= (int) (distanciaRecorrida /longitudDelPasoHombre);


        // Calcula los pasos dados (1333 pasos por kilómetro)
        //int pasosDados = (int) (distanciaEnKilometros * 1333);

        // Actualiza el contador de pasos
        this.pasos += pasosDados;

        // Actualiza las coordenadas anteriores
        this.xAnterior = x;
        this.yAnterior = y;
    }
    
     public   double trinomio(double x, double y){
        double res= Math.pow(x, 2) - (2 * x * y) + Math.pow(y, 2);
        return res;
    }
   
     public double calcularDistancia(double x, double y){
         double res=trinomio(x,this.xAnterior) + trinomio(y,this.yAnterior) ;
         double raiz= Math.sqrt(res);
         return Math.abs(raiz) ;
     }
     
      public int frecuenciaAleatoria() {
        Random random = new Random();
        return 60 + random.nextInt(100);  // Frecuencia entre 60 y 159 bpm
    }
     
    public int getPasos() {
        return pasos;
    }
    
}
