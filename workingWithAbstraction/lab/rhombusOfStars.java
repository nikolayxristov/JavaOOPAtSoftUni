package workingWithAbstraction.lab;

import java.util.Scanner;

public class rhombusOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 1; i <= n; i++) {
                printRow(i, n - i);
            }
            for (int i = n - 1; i > 0 ; i--) {
                printRow(i, n - i);
            }
        }

    }

    private static void printRow(int numberOfStars, int numberOfSpaces) {
        for (int i = 0; i < numberOfSpaces ; i++) {
            System.out.print(" ");
        }

        for (int j = 0; j < numberOfStars; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
