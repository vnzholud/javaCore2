package threads;

public class CounterNoSyn {
    private int c;

    public CounterNoSyn() {
        c = 0;
    }

    public void inc() {
        c++;
    }

    public void dec() {
        c--;
    }

    public int getC() {
        return c;
    }
}
