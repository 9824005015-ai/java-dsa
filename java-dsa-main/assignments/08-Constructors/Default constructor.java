class Student {
    String name;
    int age;
    Student() {
        name = "Saketh";
        age = 21;
    }

    void display() {
        System.out.println(name + " - " + age + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  
        s1.display();
    }
}

Output:-
Saketh - 21 years
