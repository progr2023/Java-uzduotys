public class Uzduotis1 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        int x1 = 5;
        boolean b1 = kurisIlgesnis(zodis1, x1);
        System.out.println("b1 = " + b1);



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
