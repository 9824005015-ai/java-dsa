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
        car1.display();  
    }
}

Output:-
Bugatti Chiron - $3000000.0
