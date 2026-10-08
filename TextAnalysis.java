import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2-3 lines of text:");
        String text = sc.nextLine() + "\n" + sc.nextLine() + "\n" + sc.nextLine();

        // Number of lines
        String[] lines = text.split("\n");
        System.out.println("Number of lines: " + lines.length);

        // Number of words
        String[] words = text.toLowerCase().split("\\s+");
        System.out.println("Number of words: " + words.length);

        // Number of vowels
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Number of vowels: " + vowels);

        // Word-wise count
        System.out.println("Word-wise count:");

        for (int i = 0; i < words.length; i++) {

            int count = 1;
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                }

                System.out.println(words[i] + " = " + count);
            }
        }
    }
}