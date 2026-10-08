import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (arr[i].equals(input)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                arr[count] = input;
                count++;
            } else {
                System.out.println("Duplicate! Not added.");
            }
        }

        System.out.println("Unique Strings:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}