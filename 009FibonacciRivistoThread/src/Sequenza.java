/**
 * Created by inf.gondoloa1112 on 20/02/2020.
 */
public class Sequenza {

    private int n = 2;



    public int fib(int p){
        int fibonacci;

        /*n =  p - 2;
        if (n >= 1){
            fibonacci = fibonacci(n + 1) + fibonacci(n);
        }else{
            fibonacci = 1;
        }


        System.out.println("finbonacci (" + p + "): " + fibonacci);
        */


        if(p >= 2){
            fibonacci = fib(p-1) + fib(p - 2);
        }else{
            fibonacci = 1;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Sequenza fibonacci = new Sequenza();
        int valAtt;
        int valPrec = 1;
        double rapporto;
        for (int i = 0; i <= 45; i++){
            valAtt = fibonacci.fib(i);
            rapporto = (double) valAtt / valPrec;
            System.out.println("Rapporto(" + i + ")" + rapporto);
            valPrec = valAtt;
        }

        fibonacci.fib(3);
    }

}
