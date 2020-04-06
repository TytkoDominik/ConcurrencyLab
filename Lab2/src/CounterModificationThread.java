public class CounterModificationThread extends Thread
{
    protected Counter counter;

    public CounterModificationThread(Counter counter)
    {
        this.counter = counter;
    }

    public void run()
    {
        for (int i = 0; i < Race.count; i++)
        {
            operation();
        }
    }

    protected void operation()
    {
    }
}
