package MainFunction.Scanner;

import java.io.*;

public class Streamclass {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream=new FileOutputStream("pravee.txt");
        Writer outputStreamWriter=new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write("hey this is me".toCharArray());
        outputStreamWriter.close();


    }
}
