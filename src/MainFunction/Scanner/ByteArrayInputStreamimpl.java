package MainFunction.Scanner;

import java.io.*;

public class ByteArrayInputStreamimpl {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        ObjectOutputStream o=new ObjectOutputStream(byteArrayOutputStream);
        o.writeObject("this is me");
        ObjectInputStream objectInputStream=new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        System.out.println(objectInputStream.readObject().toString());
    }
}
