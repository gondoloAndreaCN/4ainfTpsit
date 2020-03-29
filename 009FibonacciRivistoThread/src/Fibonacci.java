import java.io.File;

/**
 * Created by inf.gondoloa1112 on 20/02/2020.
 */
public class Fibonacci extends Thread{

    private int p;

    private int fibonacci;

    public Fibonacci(int p){
        this.p = p;
    }

    public int getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(int fibonacci) {
        this.fibonacci = fibonacci;
    }



    public void run(){
        //int fibonacci;

        if(p >= 2){
            Fibonacci f1 = new Fibonacci(p - 1);
            f1.start();
            Fibonacci f2 = new Fibonacci(p - 1);
            f2.start();
            try {
                f1.join();
                f2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fibonacci = f1.getFibonacci() + f2.getFibonacci();
        }else{
            fibonacci = 1;
        }
        //return fibonacci;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(5);
        System.out.println();

    }

}
