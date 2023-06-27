import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {

    }
    public static Preke [] nuskaitytiPrekesIsFailo (String failoPavadinimas) {
        File failas = new File (failoPavadinimas);
        try {
            Scanner skaitytuvas = new Scanner(failas);
            skaitytuvas.nextLine();
            int n = skaitytuvas.nextInt()
        } catch (FileNotFoundException e) {
            System.out.println("Tokio failo nėra");
            throw new RuntimeException(e);

        }
        return null;
    }
}
