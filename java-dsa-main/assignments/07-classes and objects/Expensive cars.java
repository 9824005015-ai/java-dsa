class ExpensiveCars {
    String name;
    double price;

    ExpensiveCars(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " - $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        ExpensiveCars car1 = new ExpensiveCars("Bugatti Chiron", 3000000);
        ExpensiveCars car2 = new ExpensiveCars("Rolls-Royce Phantom", 460000);

        car1.display();
        car2.display();
    }
}

Output:-
Bugatti Chiron - $3000000.0
Rolls-Royce Phantom - $460000.0
