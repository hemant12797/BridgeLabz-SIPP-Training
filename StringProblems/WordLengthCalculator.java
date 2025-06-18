import java.util.Scanner;

public class WordLengthCalculator {
    
    // Method to split text into words
    private static String[] splitWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        
        return words;
    }
    
    // Method to find string length without using length()
    private static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }
    
    // Method to create word-length pairs
    private static String[][] createWordLengthPairs(String[] words) {
        String[][] pairs = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            pairs[i][0] = words[i];
            pairs[i][1] = String.valueOf(findLength(words[i]));
        }
        return pairs;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to analyze: ");
        String input = scanner.nextLine();
        
        String[] words = splitWords(input);
        String[][] wordLengths = createWordLengthPairs(words);
        
        System.out.println("\nWord Analysis:");
        System.out.println("Word     | Length");
        System.out.println("---------|--------");
        for (String[] pair : wordLengths) {
            System.out.printf("%-8s | %s%n", pair[0], pair[1]);
        }
        
        scanner.close();
    }
}