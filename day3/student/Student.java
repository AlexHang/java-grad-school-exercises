package day3;

public class Student implements Comparable{
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        return Double.compare(s.grade,this.grade);
    }
}
