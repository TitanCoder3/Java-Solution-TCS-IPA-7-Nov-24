import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum = sum + Integer.parseInt(String.valueOf(c));
            }
        }
        if (sum <= 15)
            System.out.println(sum);
        else
            System.out.println("No Digit Found.");

        sc.close();
    }
}
