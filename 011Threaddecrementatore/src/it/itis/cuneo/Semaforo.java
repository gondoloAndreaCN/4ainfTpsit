package it.itis.cuneo;

public class Semaforo {
    private int value;

    public Semaforo(){
        value = 0;
    }

    public Semaforo(int v){
        value = v;
    }

    public synchronized void up(){
        value++;
        notify();
    }

    public synchronized void down(){
        while(value == 0){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        value --;
    }
}
