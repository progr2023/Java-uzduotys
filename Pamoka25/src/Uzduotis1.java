import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {
        Scanner skait = new Scanner (System.in);
        System.out.println("Įveskite apskritimo spindulį");
        double r = skait.nextDouble();
        System.out.println("Plotas su " + r + " spinduliu yra: " + apskritimoPlotas(r));
        System.out.println("Diametras su " + r + " spinduliu yra " + diametras(r));
        System.out.println("Apskritimo ilgis su " + r + " spinduliu yra " + apskritimoIlgis(r));

    }
    public static double apskritimoPlotas (double r){
        return Math.PI * r * r;

    }
    public static double diametras (double r) {
        return 2 * r;
    }
    public static double apskritimoIlgis (double r) {
        return Math.PI * r * 2;
    }


}
