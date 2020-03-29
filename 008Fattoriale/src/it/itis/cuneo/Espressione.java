package it.itis.cuneo;

public class Espressione extends Thread {
    public static void main(String[] args) {
        double n = 5; //valore random
        Buffer buffer = new Buffer(n);
        Fattoriale fattoriale = new Fattoriale(n);
        fattoriale.start();
        System.out.println("il fattoriale è: ");
    }


}
