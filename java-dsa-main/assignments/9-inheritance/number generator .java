import java.util.Random;

class NumberGenerator {
    NumberGenerator() {
        System.out.println("Number Generator ready");
    }
}

class LucasRandom extends NumberGenerator {
    LucasRandom() {
        System.out.println("Lucas Range Generator ready");
    }

    void generate() {
        int[] lucas = {2, 1, 3, 4, 7, 11, 18, 29, 47, 76}; // first 10 Lucas numbers
        int min = lucas[0], max = lucas[0];

        for (int num : lucas) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        Random rand = new Random();
        int randomNum = rand.nextInt(max - min + 1) + min;

        System.out.println("Range: " + min + " to " + max);
        System.out.println("Random Number: " + randomNum);
    }
}

public class Main {
    public static void main(String[] args) {
        LucasRandom obj = new LucasRandom();
        obj.generate();
    }
}
