public class Counter
{
    private int _value;
    private MySemaphore _semaphore;

    public Counter(int n)
    {
        _value = n;
        _semaphore = new MySemaphore();
    }

    public synchronized void inc()
    {
        _semaphore.P();
        int n;
        n = _value;
        n = n + 1;
        _value = n;
        _semaphore.V();
    }

    public synchronized void dec()
    {
        _semaphore.P();
        int n;
        n = _value;
        n = n - 1;
        _value = n;
        _semaphore.V();
    }

    public int getValue()
    {
        return _value;
    }
}
