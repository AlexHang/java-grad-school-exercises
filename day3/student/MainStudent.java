package day3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MainStudent {
    public static void main(String[] args) {
        Map<Integer, TreeSet<Student>> gradeMap=new HashMap<>();
        TreeSet<Student> studentTreeSet=new TreeSet<>();

        Student s1=new Student("Ionel",8.49);
        studentTreeSet.add(s1);

        gradeMap.put(1,studentTreeSet);
    }
}
