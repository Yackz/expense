package csku.console;

import java.io.*;

public class Writer {
    private static final String fileName = "account.txt";

    static public void add(String detail) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(detail);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
