package MainFunction.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

       Class c= Class.forName("MainFunction.Reflection.Student2");
       Student2 s=(Student2)c.newInstance();
       c.getConstructor();
       s.getSchool();
       // Method m= c.getDeclaredMethod("details",null);
     // m.setAccessible(true);
   //   m.invoke(s);

    }
}
