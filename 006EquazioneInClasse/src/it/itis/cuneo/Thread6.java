package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Thread6 extends Thread{
    private Buffer buffer;

    public Thread6(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setZ( buffer.getY() * 5 );

        System.out.println("c2.x: " + buffer.getZ());
    }
}
