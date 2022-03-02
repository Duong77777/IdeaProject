import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {
    public static void main (String[] args) throws FileNotFoundException {
        File f = new File("src/main/resources/data.txt");
        Scanner scanner = new Scanner(f);
        String name = scanner.nextLine();
        String location = scanner.next();
        double score = scanner.nextDouble();
        boolean graduated = scanner.nextBoolean();
        System.out.printf("name: %s\nlocation: %s\nAvg score: %.2f\ngraduated: %s\n", name, location, score, graduated);
        scanner.close();
    }
}
