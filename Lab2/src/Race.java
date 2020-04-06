public class Race
{
    public static int count;

    public static void main(String[] args)
    {
        Counter counter = new Counter(0);
        count = 100000;
        IncrementThread it = new IncrementThread(counter);
        DecrementThread dt = new DecrementThread(counter);

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
