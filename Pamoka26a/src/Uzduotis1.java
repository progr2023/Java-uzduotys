public class Uzduotis1 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        int x1 = 5;
        boolean b1 = kurisIlgesnis(zodis1, x1);
        System.out.println("b1 = " + b1);

        String zodis2 = "ropė";
        int x2 = 7;
        boolean b2 = kurisIlgesnis(zodis2, x2);
        System.out.println("b2 = " + b2);



    }
    public static boolean kurisIlgesnis (String zodis, int x){
        if (zodis.length()>x){
            return true;

        }
        else {
            return false;
        }
    }

}
