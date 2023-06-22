package Uzduotis132;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas a1 = new Apskritimas(5);
        Apskritimas a2 = new Apskritimas();
        a2.setSpindulys(11);



        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println("a1.diametras() = " + a1.diametras());
        System.out.println("a2.diametras() = " + a2.diametras());

        a1.padidinaSpinduli(15);
        a2.padidinaSpinduli(9);

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);



    }
}


