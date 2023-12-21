package org.example;

public class Main {

    public static double[] lecturaHumedad(){
        return new double[]{23,40,55,72,90.0};
    }
    public static void main(String[] args){
        double [] lecturaSimulada= lecturaHumedad();

        for (int i=0; i < lecturaSimulada.length; i++){
            System.out.println("Lectura de humedad #" + (i + 1) + ": " + lecturaSimulada[i] + "%");

            // Evalúa el estado de la humedad
            if (lecturaSimulada[i] <= 23) {
                System.out.println("Falta agua");
            } else if (lecturaSimulada[i] <= 40) {
                System.out.println("Falta agua");
            } else if (lecturaSimulada[i] <= 55) {
                System.out.println("Falta poca agua");
            } else if (lecturaSimulada[i] <= 72) {
                System.out.println("No agregue agua");
            } else {
                System.out.println("No agregue agua");
            }
        }
    }
}