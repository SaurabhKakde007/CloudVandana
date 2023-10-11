package PangramChecker3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toUpperCase(); // Convert input to uppercase

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            set.add(ch);
        }

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.remove(ch);
            }
        }

        return set.isEmpty();
    }
}

