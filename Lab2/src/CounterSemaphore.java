public class CounterSemaphore
{
        private boolean _state = true;
        private int _wait = 0;

        public CounterSemaphore()
        {
                _state = true;
                _wait = 0;
        }

        public synchronized void P()
        {
                if (_state)
                {
                        _state = false;
                }
                else
                {
                        try
                        {
                                _wait++;
                                wait();
                        }
                        catch (InterruptedException e)
                        {
                                e.printStackTrace();
                        }
                }
        }

        public synchronized void V()
        {
                if (_wait > 0)
                {
                        notify();
                        _wait--;
                }
                else
                {
                        _state = true;
                }
        }
}
