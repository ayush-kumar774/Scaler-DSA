package Lecture21LinkedListIntroductionAndBasicProblems;

public class RefInstance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;

        Student s2 = s1;

        s2.display();
    }
}
class Student {
    int age ;
    String name;

    void display() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old");
    }

    void sayHello(String name) {
        System.out.println(this.name + " says hello to " + name);
    }
}