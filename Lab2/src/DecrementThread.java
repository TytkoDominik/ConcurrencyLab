public class DecrementThread extends CounterModificationThread
{
    public DecrementThread(Counter counter)
    {
        super(counter);
    }

    @Override
    protected void operation()
    {
        counter.dec();
    }
}
