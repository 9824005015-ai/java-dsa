class Student {

    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Nithish", 21);

        student1.display();

        System.out.println();

        student2.display();
    }
}
