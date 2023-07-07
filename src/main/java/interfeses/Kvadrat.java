package interfeses;

public class Kvadrat implements Ploshad, Forma{
    int a;
    int b;


    public Kvadrat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int RezPlochKvadrat() {
        return a*b;
    }


    @Override
    public void info() {
        System.out.println("Квадрат");
    }
}
