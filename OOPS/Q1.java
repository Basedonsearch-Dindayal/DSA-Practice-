package OOPS;
class Student {
    String name;
    int marks;
}

public class Q1{
    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.name = "John";
        s1.marks = 85;
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Marks: " + s1.marks);
    }
}