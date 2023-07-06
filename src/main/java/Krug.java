public class Krug implements Ploshad, Forma{
    int r;

    static final float PI = 3.14f;




    public Krug(int r) {
        this.r = r;

    }



    @Override
    public float RezPlochKrug() {
        return 2* PI *r*r;
    }

    @Override
    public void info() {
        System.out.println("Круг");
    }
}
