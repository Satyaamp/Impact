import java.util.Scanner;

public class Wordakshari_hackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] inputs = new String[n+1]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
        }

        // Set the last input to "####"
        inputs[n] = "####";

        System.out.println("Stored strings:");
        for (String input : inputs) {
            System.out.println(input);
        }

    }
}