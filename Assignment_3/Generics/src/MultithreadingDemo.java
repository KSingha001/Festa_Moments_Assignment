class NumberThread implements Runnable {

    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class AlphabetThread implements Runnable {

    public void run() {
        for(char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) {

        NumberThread num = new NumberThread();
        AlphabetThread alpha = new AlphabetThread();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(alpha);

        t1.start();
        t2.start();
    }
}