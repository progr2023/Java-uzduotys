public class Uzduotis6 {
    public static void main(String[] args) {
        String s1 = "ananasas";
        String s2 = "anakonda";
        String x1 = kuriArciau(s1, s2);
        System.out.println(x1);

        String s3 = "antanas";
        String s4 = "mašina";
        String x2 = kuriArciau(s3, s4);
        System.out.println(x2);

        String s5 = "ananasas";
        String s6 = "ąsotis";
        String x3 = kuriArciau(s5, s6);
        System.out.println(x3);

    }

    public static String kuriArciau (String s1, String s2) {


        if (s1.compareTo(s2)< 0){
            return s1;
        }
        else if (s1.compareTo(s2)> 0){
            return s2;
        }
        else {
            return s1;
        }


    }

}
