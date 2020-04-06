public class Race
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(0);
        int operationsCount = 100000;
        IncrementThread it = new IncrementThread(counter, operationsCount);
        DecrementThread dt = new DecrementThread(counter, operationsCount);

        it.start();
        dt.start();

        try
        {
            it.join();
            dt.join();
        }
        catch (InterruptedException ie)
        {  }

        System.out.println("Value = " + counter.getValue());
    }
}
