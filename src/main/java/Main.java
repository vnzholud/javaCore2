import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int r;

        Scanner scanner;
        scanner = new Scanner(System.in);

        Krug krug = new Krug(5);
        Kvadrat kvadrat = new Kvadrat(4,4);

        System.out.println("Площадь круга равна: " + krug.RezPlochKrug());
        System.out.println("Площадь квадрата равна: " + kvadrat.RezPlochKvadrat());
        System.out.println("__________________________");
        testPl(kvadrat);
        testPl(krug);
        testPl(krug);
        testPl(krug);
        testPl(kvadrat);
        System.out.println("_____________");
        test(krug);
        test(kvadrat);
        test(()->{
            System.out.println("Фигура");
        });

    }

    static void testPl(Ploshad figura) {

        if(figura instanceof Krug){
            System.out.println("Площадь круга равна: " + figura.RezPlochKrug());
        } else {
            System.out.println("Площадь квадрата равна: " + figura.RezPlochKvadrat());
        }
    }

    static void test(Forma forma){
        forma.info();
    }

}
