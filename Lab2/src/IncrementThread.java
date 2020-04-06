public class IncrementThread extends CounterModificationThread
{
    public IncrementThread(Counter counter)
    {
        super(counter);
    }

    @Override
    protected void operation()
    {
        counter.inc();
    }
}
