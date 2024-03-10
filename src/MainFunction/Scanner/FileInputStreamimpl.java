package MainFunction.Scanner;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamimpl {
    public static void main(String[] args)  {
        System.out.println(tem());


}
  public static int tem(){

        try {
            int a=10/0;
            return a;
        }
        catch (Exception e){
            return 2;
        }
        finally {
            System.out.println("abc");
        }
  }

}
