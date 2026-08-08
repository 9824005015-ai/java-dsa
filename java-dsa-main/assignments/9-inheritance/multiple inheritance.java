interface A {
    void showA();
}
interface B {
    void showB();
}
interface C {
    void showC();
}

class D implements A, B, C {
    public void showA() {
        System.out.println("Harsha");
    }
    public void showB() {
        System.out.println("Lokesh");
    }
    public void showC() {
        System.out.println("Nithish");
    }
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
