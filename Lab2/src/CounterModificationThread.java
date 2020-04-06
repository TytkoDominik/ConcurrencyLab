public class CounterModificationThread extends Thread
{
    protected Counter counter;
    private int _operationsCount;

    public CounterModificationThread(Counter counter, int operationsCount)
    {
        this.counter = counter;
        _operationsCount = operationsCount;
    }

    public void run()
    {
        for (int i = 0; i < _operationsCount; i++)
        {
            operation();
        }
    }

    protected void operation()
    {
    }
}
