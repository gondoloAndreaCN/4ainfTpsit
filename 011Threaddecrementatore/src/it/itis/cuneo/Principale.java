package it.itis.cuneo;

public class Principale {
    private int shm;
    private Semaforo semaforo;

    public int getShm() {
        return shm;
    }

    public void setShm(int shm) {
        this.shm = shm;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public Principale() {
    }

    public Principale(int shm, Semaforo semaforo) {
        this.shm = shm;
        this.semaforo = semaforo;
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo(1);
        Principale principale = new Principale(20,semaforo);
        Thread thread = new Thread(principale);
        Thread thread1 = new Thread(principale);
        Thread thread2 = new Thread(principale);

        thread.start();
        thread1.start();
        thread2.start();

        try{
            thread.join();
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("thread 1:" + thread.getCicli());
        System.out.println("thread 2:" + thread1.getCicli());
        System.out.println("thread 3:" + thread2.getCicli());
    }
}
