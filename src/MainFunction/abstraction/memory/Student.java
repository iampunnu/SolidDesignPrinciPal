package MainFunction.abstraction.memory;

import java.util.List;

public class Student {
    String name;
    int age;
    List<String> subject;
    Student(){

    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
        this.subject=s.subject;
    }

}
