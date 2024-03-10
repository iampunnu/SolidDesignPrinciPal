package MainFunction.Scanner;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputfromScanner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Village v=new Village();
        v.setArea(100);
        v.setName("dhema");
        v.setPopulation(1200l);
        v.setPradhan("champu");
        String exampleString = "{\n" + "    \"username\":\"praveensingh\",\n" + "    \"password\":\"singh\",\n" + "    \"array\":[\"ankur\",\"singh\"],\n" + "\n" + "    \"object\":{\"key\":\"value\",\"key2\":\"value\"}\n" + "}";
        Object o="sdf";
        System.out.println(exampleString.getBytes(StandardCharsets.ISO_8859_1));
        InputStream stream = new ByteArrayInputStream(exampleString.getBytes(StandardCharsets.ISO_8859_1));

      /*  Scanner sc=new Scanner(stream,"UTF-8");
      //  ObjectInputStream oj=new ObjectInputStream(stream);
        System.out.println("going to print inputStream");
        while (sc.hasNext()){UTF_8
            System.out.println(sc.next());
        }*/
      //  BufferedInputStream inputStreamReader=new BufferedInputStream(stream);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(stream));
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
        FileOutputStream f=new FileOutputStream("ott.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(f);
        objectOutputStream.writeObject(v);
        objectOutputStream.close();

       // System.out.println(v1);




    }
}
