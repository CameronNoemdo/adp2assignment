package za.ac.cput;

import java.util.*;

/** Student name: Cameron Noemdo
 * Student number: 219115443
 */

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

    public static Map<Integer, String> hashmapAdd()
    {
        Map<Integer, String> students=new TreeMap<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        int s1Number=217;
        int s2Number=218;
        int s3Number=219;
        students.put(s1Number,s1.student);
        students.put(s2Number,s2.student);
        students.put(s3Number,s3.student);

        return students;
    }

    public static Map<Integer, String> hashmapRemove()
    {
        Map<Integer, String> students=new TreeMap<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        int s1Number=217;
        int s2Number=218;
        int s3Number=219;
        students.put(s1Number,s1.student);
        students.put(s2Number,s2.student);
        students.put(s3Number,s3.student);
        students.remove(217);

        return students;
    }

    public static boolean hashmapFind()
    {
        Map<Integer, String> students=new TreeMap<>();
        int s1Number=217;
        int s2Number=218;
        int s3Number=219;
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        students.put(s1Number,s1.student);
        students.put(s2Number,s2.student);
        students.put(s3Number,s3.student);

        return students.containsValue("Mary");
    }

    public static Set<String> hashsetAdd()
    {
        Set<String> names=new HashSet();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        Student s4=new Student("Doe");
        names.add(s1.student);
        names.add(s2.student);
        names.add(s3.student);
        names.add(s4.student);

        return names;
    }

    public static Set<String> hashsetRemove()
    {
        Set<String> names=new HashSet();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        names.add(s1.student);
        names.add(s2.student);
        names.add(s3.student);

        names.remove("John");

        return names;
    }

    public static boolean hashsetFind()
    {
        Set<String> names=new HashSet();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        names.add(s1.student);
        names.add(s2.student);
        names.add(s3.student);

        return names.contains("Doe");
    }

    public static List<String> arrayListAdd()
    {
        List<String> list=new ArrayList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        list.add(s1.student);
        list.add(s2.student);
        list.add(s3.student);
        return list;
    }

    public static List<String> arrayListRemove()
    {
        List<String> list=new ArrayList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        list.add(s1.student);
        list.add(s2.student);
        list.add(s3.student);

        list.remove(1);

        return list;
    }

    public static boolean arrayListFind()
    {
        List<String> list=new ArrayList<>();
        Student s1=new Student("John");
        Student s2=new Student("Doe");
        Student s3=new Student("Mary");
        list.add(s1.student);
        list.add(s2.student);
        list.add(s3.student);

        return list.contains("John");
    }
}
