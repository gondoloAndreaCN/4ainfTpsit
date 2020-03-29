package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Thread5 extends Thread{
    private Buffer buffer;

    public Thread5(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setY( buffer.getX() + 4 );

        System.out.println("c2.x: " + buffer.getY());
    }
}
