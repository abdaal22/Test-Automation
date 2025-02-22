import java.util.Scanner;

public class MorseCodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert '1' for English to Morse & Insert '2' for Morse to English:");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println(choice == 1 ? "Insert English text:" : choice == 2 ? "Insert Morse code:" : "Invalid choice!");
        if (choice != 1 && choice != 2) {
            scanner.close();
            return;
        }

        String input = scanner.nextLine();
        try {
            System.out.println(choice == 1 ? "Morse Code: " + MorseCodeConverter.toMorse(input)
                    : "English Text: " + MorseCodeConverter.toEnglish(input));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
