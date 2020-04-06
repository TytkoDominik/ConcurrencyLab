public class IncrementThread extends CounterModificationThread
{
    public IncrementThread(Counter counter, int operationsCount)
    {
        super(counter, operationsCount);
    }

    @Override
    protected void operation()
    {
        counter.inc();
    }
}
