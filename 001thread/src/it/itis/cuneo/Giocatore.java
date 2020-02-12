package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 12/12/2019.
 */
public class Giocatore extends Thread {
    public static final int MAX=6;
    public static final int MIN=2;
    private String name;
    private CampoTennis campoTennis;

    public Giocatore(String giocatore1, CampoTennis campoTennis){
        this.name=name;
        this.campoTennis=campoTennis;
    }
    public Giocatore(CampoTennis campoTennis){
        this.name=name;
        this.campoTennis=campoTennis;
    }

    public void run(){
        //miport Math.*;
        //MAth.random():0...1
        //(MAth.random()*(MAX-MIN): -> 0...4
        long estrazione =Math.round( Math.random()*(MAX-MIN)+MIN);
        System.err.println(name  + " : estrazione");
        campoTennis.setPunteggio1(estrazione);
    }
}
