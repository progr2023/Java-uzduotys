public class Uzduotis4 {
    public static void main(String[] args) {
        String zodis1 = "ananasas";
        int raidesVieta = 5;
        kuriRaide(zodis1, raidesVieta);

        String zodis2 = "Sakinys.";
        int raidesVieta2 = 3;
        kuriRaide(zodis2, raidesVieta2);

        String zodis3 = "meška";
        int raidesVieta3 = 2;
        kuriRaide(zodis3, raidesVieta3);

        String zodis4 = "meška";
        int raidesVieta4 = 10;
        kuriRaide(zodis4, raidesVieta4);






    }
    public static void kuriRaide (String zodis, int indeksas) {


        if (indeksas > zodis.length()){
            System.out.println("Per didelis indeksas");

        }
        else {
            char a1 = zodis.charAt(indeksas);
            System.out.println("a1 = " + a1);
        }





    }
}
