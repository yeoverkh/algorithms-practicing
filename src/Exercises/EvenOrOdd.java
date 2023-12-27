package Exercises;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            while (true) {
                Integer input = scanner.nextInt();
                if (input < 0) input *= -1;
                System.out.println(input % 2 == 1 ? "Odd" : "Even");
            }

        }
    }
}
