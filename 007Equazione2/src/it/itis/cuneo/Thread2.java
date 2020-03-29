package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Thread2 extends Thread{
    private Buffer buffer;

    public Thread2(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setY( buffer.getX() + buffer.getA() );

        System.out.println("c1.y: " + buffer.getY());
    }

}
