public class Uzduotis5 {
    public static void main(String[] args) {
        String zodis = "ananasas";
        int i1 = 5;
        int i2 = 7;
        boolean d1 = arVienodos (zodis, i1, i2);
        System.out.println("d1 = " + d1);

        String zodis2 = "ananasas";
        int i3 = 0;
        int i4 = 7;
        boolean d2 = arVienodos(zodis2, i3, i4);
        System.out.println("d2 = " + d2);

    }
    public static boolean arVienodos (String zodis, int i1, int i2){
        char c1 = zodis.charAt(i1);
        char c2 = zodis.charAt(i2);

        if (c1 == c2){
            return true;
        }
        else {
            return false;
        }

    }

}
