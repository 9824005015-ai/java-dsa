class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nithish", 21); 
        s1.display();
    }
}
Output:-
Nithish - 21 years
