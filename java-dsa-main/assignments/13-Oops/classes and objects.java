class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Nithish";
        student.age = 21;

        student.displayDetails();
    }
}
