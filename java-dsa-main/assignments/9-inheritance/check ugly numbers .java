class NumberChecker {
    NumberChecker() {
        System.out.println("Number Checker ready");
    }
}

class UglyNumber extends NumberChecker {
    UglyNumber() {
        System.out.println("Ugly Number Checker ready");
    }

    boolean isUgly(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }
}

public class Main {
    public static void main(String[] args) {
        UglyNumber obj = new UglyNumber();
        int num = 30; // Chane the number that you want find if it is Ugly or NOT.

        if (obj.isUgly(num)) {
            System.out.println(num + " is an Ugly Number");
        } else {
            System.out.println(num + " is NOT an Ugly Number");
        }
    }
}
