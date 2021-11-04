import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("files/" + args[0]);
        BufferedReader myInput = new BufferedReader(new FileReader(file1));
        File file2 = new File("files/" + args[1]);
        BufferedWriter myOutput = new BufferedWriter(new FileWriter(file2));

        String text;
        while ((text = myInput.readLine()) != null) {
            myOutput.write(text + "\n");
        }
        myInput.close();
        myOutput.close();
    }
}