package it.itis.cuneo;

public class Fattoriale extends Thread{

    double n;

    public Fattoriale() {
    }

    public Fattoriale(double n) {
        this.n = n;
    }

    public void run(){
        n = n * (n-1);
        System.out.println(n);
    }
}
