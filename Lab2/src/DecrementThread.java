public class DecrementThread extends CounterModificationThread
{
    public DecrementThread(Counter counter, int operationsCount)
    {
        super(counter, operationsCount);
    }

    @Override
    protected void operation()
    {
        counter.dec();
    }
}
