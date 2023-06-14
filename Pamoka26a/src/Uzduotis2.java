public class Uzduotis2 {
    public static void main(String[] args) {
        String zodis1 = "ananasas";
        String zodis2 = "Sakinys.";
        String zodis3 = "meška";
        char x1 = paskutineRaide(zodis1);
        char x2 = paskutineRaide(zodis2);
        char x3 = paskutineRaide(zodis3);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);


    }


    public static char paskutineRaide (String zodis) {
        char paskutine = zodis.charAt(zodis.length() -1 );
        return paskutine;



    }


}
