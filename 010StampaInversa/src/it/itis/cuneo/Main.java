package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String stringa;


    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("inserisci una stringa:\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        {
            try {
                stringa = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Thread thread = new Thread(stringa,0);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
