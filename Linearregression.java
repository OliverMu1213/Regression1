import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Linearregression {

    public static void main(String[] args) throws FileNotFoundException {
        String a = "";
        Scanner user = new Scanner(new File("/Users/luyu_mu/Downloads/EgData.csv"));
        user.useDelimiter(",");
        while(user.hasNext()){
            System.out.print(user.next()+"|");
        }

    }

}
