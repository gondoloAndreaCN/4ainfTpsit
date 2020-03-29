package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 13/02/2020.
 */
public class Thread3 extends Thread{
    private Buffer buffer;

    public Thread3(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        buffer.setZ( buffer.getY() );

        System.out.println("c1.z: " + buffer.getZ());
    }
}
