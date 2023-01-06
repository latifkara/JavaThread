package odev;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        ThreadEvenOddRace calc1 = new ThreadEvenOddRace(5000, true);
        Thread thread1 = new Thread(calc1);

        ThreadEvenOddRace calc2 = new ThreadEvenOddRace(5000, false);
        Thread thread2 = new Thread(calc2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        calc1.printOdd();
        calc2.prinEven();
    }
}
