import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Linearregression {

    public static void main(String[] args) throws FileNotFoundException {
        String a = "";
        Scanner scanner = new Scanner(new File("/Users/luyu_mu/Downloads/EgData.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }

    }

}