package factorial;

public class Hilo implements Runnable {

    private int numeros;

    public Hilo(int n) {
        this.numeros = n;}

    public void run () {
        int prod = 1;
            for(int i=numeros; i > 0; i--){
                prod = prod * i;
            }
        System.out.println(Thread.currentThread().getName() + ":" + prod);
    }
}
