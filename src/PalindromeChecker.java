// PalindromeChecker.java
public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        // Видаляємо пробіли та переводимо все в нижній регістр
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        // Використовуємо StringBuilder для зручності порівняння назад і вперед
        StringBuilder reversedWord = new StringBuilder(cleanWord).reverse();

        // Порівнюємо слово та його обернену версію
        return cleanWord.equals(reversedWord.toString());
    }
}
