import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvfiletoArray {
    public static void main(String[] args) {
        ArrayList<Double> xsum = new ArrayList<>();
        ArrayList<Double> ysum = new ArrayList<>();

        double difference = 0;
        String csvFile = "file location";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        double xdi =0;
        double ydi =0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] sheet = line.split(cvsSplitBy);
                String x =sheet[0];
                String y =sheet[1];
                System.out.println(x+ "   "+y);
                System.out.println();
                if(isDouble(x)&&isDouble(y)){
                    xsum.add(Double.parseDouble(x));
                    ysum.add(Double.parseDouble(y));

                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




        double[] Xlist = new double[ysum.size()];
        double[] Ylist = new double[ysum.size()];

        for (int i = 0; i < Xlist.length; i++) {

            Xlist[i] = xsum.get(i);
        }
        for (int i = 0; i < Ylist.length; i++) {

            Ylist[i] = ysum.get(i);
        }
        


    }


    public static boolean isDouble(String number ){
        try{
            Double.parseDouble(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
