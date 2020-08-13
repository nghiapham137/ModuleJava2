import java.io.*;

public class CSVReader {
    public static void main(String[] args) {

        String csvFile = "country.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            File file;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code = " + country[4] + " ,name = " + country[5] + "]");

            }
        } catch (IOException e) {
            e.printStackTrace();
          }
        }

    }

