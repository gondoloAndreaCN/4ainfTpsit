package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 30/01/2020.
 */
public class Pista {
    public static void main(String[] args) {
        Corridore corridore1 = new Corridore("tolo");
        Corridore corridore2 = new Corridore("alessia");



        //da qui in giu interfaccia

        Runnable corridore3Runnable = new CorridoreInterfaccia("pano");
        Thread corridore3 = new Thread(corridore3Runnable);


        Runnable corridore4Runnable = new CorridoreInterfaccia("viada");
        Thread corridore4 = new Thread(corridore4Runnable);


        Runnable corridore5Runnable = new CorridoreInterfaccia("nicosia");
        Thread corridore5 = new Thread(corridore5Runnable);


        corridore1.start();
        corridore2.start();
        corridore3.start();
        corridore4.start();
        corridore5.start();
    }
}
