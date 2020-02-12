package it.itis.cuneo;

import java.io.IOException;

/**
 * Created by inf.gondoloa1112 on 12/12/2019.
 */
public class CampoTennis {
    private long punteggio1, punteggio2;

    public long getPunteggio1() {
        return punteggio1;
    }

    public void setPunteggio1(long punteggio1) {
        this.punteggio1 = punteggio1;
    }

    public long getPunteggio2() {
        return punteggio2;
    }

    public void setPunteggio2(long punteggio2) {
        this.punteggio2 = punteggio2;
    }

    public static void main(String[] args) throws IOException {
        CampoTennis campoTennis = new CampoTennis();
        Giocatore giocatore = new Giocatore("giocatore1",campoTennis);
        giocatore.start();
        Giocatore giocatore1 = new Giocatore("giocatore2",campoTennis);
        Giocatore.giocatore1.start();
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("\n punteggio1: " + campoTennis.getPunteggio1() + "\n punteggio2: " + campoTennis.getPunteggio2());
    }


}
