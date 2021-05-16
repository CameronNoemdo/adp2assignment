package za.ac.cput;

import java.util.*;

public class Student
{
    public String student;

    public Student() {

    }

    public Student(String student)
    {
        this.student = student;
    }

    public static Collection<String> collectionAdd()
    {
        Collection<String> studentNames=new LinkedList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        studentNames.add(s1.student);
        studentNames.add(s2.student);
        studentNames.add(s3.student);

        return studentNames;
    }

    public static Collection<String> collectionRemove()
    {
        Collection<String> studentNames=new LinkedList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        studentNames.add(s1.student);
        studentNames.add(s2.student);
        studentNames.add(s3.student);

        studentNames.remove("John");

        return studentNames;
    }

    public static boolean collectionFind()
    {
        Collection<String> studentNames=new LinkedList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        studentNames.add(s1.student);
        studentNames.add(s2.student);
        studentNames.add(s3.student);

        return studentNames.contains("John");
    }
}
