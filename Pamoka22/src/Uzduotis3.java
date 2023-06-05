public class Uzduotis3 {
    public static void main(String[] args) {
        double x = 17.35;
        double y = 18;
        double g = 20.47;
        double h = 16.37;
        double perimetras = staciakampioPerimetras(x, y, g, h);
        System.out.println("perimetras = " + perimetras);
        double d = 2;
        double f = 4;
        double j = 2;
        double k = 4.1;
        double perimetras2 = staciakampioPerimetras(d, f, j, k);
        System.out.println("perimetras2 = " + perimetras2);



    }
    public static double staciakampioPerimetras (double a,double b,double c,double d) {
        return (a + b + c + d);
    }

}
