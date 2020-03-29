package it.itis.cuneo;

import java.util.Random;

public class Thread extends java.lang.Thread {
    public static final int MIN = 1000;
    public static final int MAX = 3000;

    private String stringa;
    private int index ;



    public Thread(String stringa, int index) {
        this.stringa = stringa;
        this.index = index;
    }

    public Thread() {}

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Main{" +
                "stringa='" + stringa + '\'' +
                ", index=" + index +
                '}';
    }

    public void run(){
        if(index < stringa.length()){
            Thread main = new Thread(stringa,index+1);
            main.start();
            try {
                main.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            int delay = random.nextInt((MAX-MIN) + 1) + MIN;
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\"" + stringa.charAt(index) + "\"");

        }
    }
}
