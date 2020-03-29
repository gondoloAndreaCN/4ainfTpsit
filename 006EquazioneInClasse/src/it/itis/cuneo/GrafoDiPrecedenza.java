package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class GrafoDiPrecedenza {

    public static void main(String[] args) {

        Buffer c1 = new Buffer();
        Buffer c2 = new Buffer();

        c1.setA(2);
        c2.setA(2);


        Thread1 th1 = new Thread1(c1);
        Thread4 th4 = new Thread4(c2);
        Thread2 th2 = new Thread2(c1);
        Thread5 th5 = new Thread5(c2);
        Thread3 th3 = new Thread3(c1);
        Thread6 th6 = new Thread6(c2);
        Thread7 th7 = new Thread7(c1, c2);


        th1.start();
        th4.start();
        try {
            Thread.sleep((long) Math.random() * 5000);
            th1.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th2.start();
        th5.start();
        try {
            Thread.sleep((long) Math.random() * 5000);
            th2.join();
            th5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.start();
        th6.start();
        try {
            Thread.sleep((long) Math.random() * 5000);
            th3.join();
            th6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th7.start();
        try {
            Thread.sleep((long) Math.random() * 5000);
            th7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Risultato: " + c1.w);
    }
}
