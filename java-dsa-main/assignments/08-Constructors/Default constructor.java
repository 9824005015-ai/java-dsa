class Student {
    String name;
    int age;
    Student() {
        name = "Nithish";
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
Nithish - 21 years
