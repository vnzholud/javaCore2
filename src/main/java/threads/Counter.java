package threads;

public class Counter {
    private int c;
    private Object mon;

    public Counter() {
        c = 0;
        mon = new Object();
    }

    public void inc() {
        synchronized (mon){
            c++;
        }
    }

    public void dec() {
        synchronized(mon){
            c--;
        }
    }




//    public synchronized void inc() {
//        c++;
//    }
//
//    public synchronized void dec() {
//        c--;
//    }

    public int getC() {
        return c;
    }
}
