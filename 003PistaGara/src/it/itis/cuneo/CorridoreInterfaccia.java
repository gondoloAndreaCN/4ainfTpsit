package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 30/01/2020.
 */
public class CorridoreInterfaccia implements Runnable {
    public static final int Min=0;
    public static final int Max=2;
    public static final int Delaymin=500;
    public static final int Delaymax=1000;
    private static final int ARRIVO = 10 ;
    private String nome;
    private int som;
    private int num;

    public CorridoreInterfaccia(){
        this.som = 0;
    }

    public CorridoreInterfaccia(String nome){
        this.nome=nome;
        this.som=0;
    }

    public void run(){
        int r=0;
        int delay=0;
        while(this.som<= ARRIVO) {
            delay = (int)Math.round((Math.random() * (Delaymax - Delaymin)) + Delaymin);
            try {
                //modifica da this.sleep a Thread.sleep
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r = (int) Math.round((Math.random() * (Max - Min)) + Min);
            this.som += r;
            System.out.println(this.nome + ": valore generato:" + r + " - somma attuale:" + this.som + " - ritardo" + delay + "ms");
        }
        System.out.println(this.nome + ": e' arrivao primo");
    }
}
