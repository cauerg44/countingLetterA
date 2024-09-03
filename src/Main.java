import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or phrase: ");
        String string = sc.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char letterA = string.charAt(i);
            if (letterA == 'a' || letterA == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Appearances: " + count);
        } else {
            System.out.println("There is not letter 'C' in the string typed.");
        }

        sc.close();
    }
}