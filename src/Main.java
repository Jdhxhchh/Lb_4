import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово для перевірки на паліндром: ");
        String inputWord = scanner.nextLine();

        if (PalindromeChecker.isPalindrome(inputWord)) {
            System.out.println("Це слово є паліндромом!");
        } else {
            System.out.println("Це слово не є паліндромом.");
        }
    }
}
