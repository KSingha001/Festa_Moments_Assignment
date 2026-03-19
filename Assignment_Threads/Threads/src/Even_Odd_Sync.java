class NumberPrinter 
{
    int number = 1;
    int limit = 10;

    synchronized void printOdd() 
    {
        while (number <= limit) 
        {
            if (number % 2 == 0) 
            {
                try 
                {
                    wait();
                } catch (Exception e) {}
            } 
            else 
            {
                System.out.print(number + " ");
                number++;
                notify();
            }
        }
    }

    synchronized void printEven() 
    {
        while (number <= limit) 
        {
            if (number % 2 != 0) 
            {
                try 
                {
                    wait();
                } catch (Exception e) {}
            } 
            else 
            {
                System.out.print(number + " ");
                number++;
                notify();
            }
        }
    }
}

class OddThread extends Thread {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

class EvenThread extends Thread 
{
    NumberPrinter np;

    EvenThread(NumberPrinter np) 
    {
        this.np = np;
    }

    public void run() 
    {
        np.printEven();
    }
}

public class Even_Odd_Sync
{
    public static void main(String[] args) 
    {
        NumberPrinter np = new NumberPrinter();

        OddThread t1 = new OddThread(np);
        EvenThread t2 = new EvenThread(np);

        t1.start();
        t2.start();
    }
}