package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Thread4 extends Thread{
    private Buffer buffer;

    public Thread4(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setX( buffer.getB() * 5 );

        System.out.println("c2.x: " + buffer.getX());
    }
}
