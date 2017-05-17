import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by bilalsay on 26/04/2017.
 */
public class App {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of input file");

        String fileName = sc.next();
        if (!fileName.endsWith(".txt")) {
            System.out.println("Lütfen geçerli bir txt dosya ismi girin");
            System.exit(0);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {

            Mapp map = new Mapp();
            Object[] lines = br.lines().toArray();

            City headQuart = map.mapLoad(lines).stream().min((c1,c2) -> map.getTotalWeight(c1) - map.getTotalWeight(c2)).get();
            System.out.println(" The optimal city is " + headQuart.getId() + " to install headquarters");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
