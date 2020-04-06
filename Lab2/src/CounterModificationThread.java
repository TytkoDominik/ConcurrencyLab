public class CounterModificationThread extends Thread
{
    protected Counter counter;

    public CounterModificationThread(Counter counter)
    {
        this.counter = counter;
    }

    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            operation();
        }
    }

    protected void operation()
    {
    }
}
