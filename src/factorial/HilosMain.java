package factorial;

public class HilosMain {

    public static void main(String[] args) {
        for( String s: args) {
            int n = Integer.parseInt(s);
            Thread t = new Thread( new Hilo(n) );
            t.start();
        }
    }
}