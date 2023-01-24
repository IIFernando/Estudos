package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double deposit;

        System.out.print("Enter account number: ");
        int accountN = sc.nextInt();
        System.out.print("Enter account holder: ");
        String accountH = sc.next();
        System.out.print("Is there na initial deposit (y/n)? ");
        String r = sc.next();

        if (r == "y") {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();

        }

    }
}
