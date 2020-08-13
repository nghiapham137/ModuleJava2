import java.io.*;

public class CopyTextFile {
    public static void main(String[] args) throws IOException {
        try {
            File infile = new File("Source.txt");
            if (!infile.exists()) {
                System.out.println("File is not existed");
            }else {
                BufferedReader fileReader = new BufferedReader(new FileReader(infile));

                String line;
                int count = 0;
                while ((line = fileReader.readLine()) != null) {
                    count+= line.length();
                    File outfile = new File("Target.txt");
                    if (outfile.exists()) {
                        System.out.println("Target file is existed");
                    }
                    BufferedWriter writer = new BufferedWriter(new FileWriter(outfile));
                    writer.write(line);

                    writer.flush();
                    writer.close();
                }
                System.out.println("File is copied successful");
                System.out.println(count);
                fileReader.close();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        InputStream inStream = null;
//        OutputStream outStream = null;
//
//        try {
//
//             inStream = new FileInputStream("Source.txt");
//             outStream = new FileOutputStream("Target.txt");
//
//
//            int length;
//            byte[] buffer = new byte[1024];
//
//            while ((length = inStream.read(buffer)) > 0) {
//                outStream.write(buffer,0,length);
//
//            }
//
//            System.out.println("File is copied successful");
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            inStream.close();
//            outStream.close();
//        }
    }
}
