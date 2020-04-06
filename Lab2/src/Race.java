public class Race
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(0);
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
