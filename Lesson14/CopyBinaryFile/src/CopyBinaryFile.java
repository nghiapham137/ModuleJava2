import java.io.*;

public class CopyBinaryFile {
//    private  static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Please provide input and output files");
//            System.exit(0);
//        }

        File inputFile = new File("goal.txt");
        if (!inputFile.exists()) {
            System.err.println("File ko tồn tại");
        }
        File outputFile = new File("target.txt");
        if (!outputFile.exists()) {
            System.err.println("File ko tồn tại");
        }

        try {
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);

            long fileSize = inputFile.length();
            byte[] buffer = new byte[(int) fileSize];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }
            System.out.println("filed is copied");
            System.out.println(buffer.length);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
