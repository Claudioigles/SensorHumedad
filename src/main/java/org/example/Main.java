package org.example;

public class Main {

    public static double[] lecturaHumedad(){
        return new double[]{23,40,55,72,90.0};
    }
    public static void main(String[] args){
        double [] lecturaSimulada= lecturaHumedad();
        int movMotor=90;

        for (int i=0; i < lecturaSimulada.length; i++){
            System.out.println("Lectura de humedad #" + (i + 1) + ": " + lecturaSimulada[i] + "%");

            // Evalúa el estado de la humedad
            if (lecturaSimulada[i] <= 23) {
                movMotor=25;
                System.out.println("Falta agua");
            } else if (lecturaSimulada[i] <= 40) {
                System.out.println("Falta agua");
                movMotor=35;
            } else if (lecturaSimulada[i] <= 55) {
                System.out.println("Falta poca agua");
                movMotor=55;
            } else if (lecturaSimulada[i] <= 72) {
                System.out.println("No agregue agua");
                movMotor=90;
            } else {
                System.out.println("No agregue agua");
                movMotor=90;
            }
        }
    }
}