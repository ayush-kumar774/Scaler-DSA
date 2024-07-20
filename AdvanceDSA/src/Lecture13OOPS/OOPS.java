package Lecture13OOPS;

import static Lecture13OOPS.Student.printStaticVar;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Anshu", 24, "Male", 99, 100);
        printStaticVar();
        Student s2 = new Student("Sumit", 23, "Male", 78.9, 100);
        printStaticVar();
        System.out.println(s1);
        System.out.println(s2);

    }
}
// Class takes no space in memory.
// Multiple instances of the same class can be created.

class Student {
    private String name;
    private int age;
    private String gender;
    private double psp;
    private double contestMarks;
    static int staticVar = 0;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                ", contestMarks=" + contestMarks +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printStaticVar() {
        System.out.println(staticVar);
    }
    public Student(String name, int age, String gender, double psp, double contestMarks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.psp = psp;
        this.contestMarks = contestMarks;
        staticVar++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getContestMarks() {
        return contestMarks;
    }

    public void setContestMarks(double contestMarks) {
        this.contestMarks = contestMarks;
    }
}