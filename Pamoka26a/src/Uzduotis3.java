public class Uzduotis3 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        String zodis2 = "ropė";

        int x1 = kurisIlgesnis(zodis1, zodis2);
        System.out.println("x1 = " + x1);

        String zodis3 = "kelmas";
        String zodis4 = "skruzdėlynas";

        int x2 = kurisIlgesnis(zodis3, zodis4);
        System.out.println("x2 = " + x2);

        String zodis5 = "mašina";
        String zodis6 = "metras";
        
        int x3 = kurisIlgesnis(zodis5, zodis6);
        System.out.println("x3 = " + x3);

    }
    public static int kurisIlgesnis (String zodis1, String zodis2) {
        if (zodis1.length() > zodis2.length()){
            return -1;

        }
        else if (zodis2.length() > zodis1.length()){
            return 1;
        }
        else {
            return 0;
        }
    }


}
