import java.util.Scanner;

public class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int thousands = n / 1000;
        int hundreds = (n % 1000) / 100;
        int tens = (n % 100) / 10;
        int ones = n % 10;

        System.out.println("1000s = " + thousands);
        System.out.println("100s = " + hundreds);
        System.out.println("10s = " + tens);
        System.out.println("1s = " + ones);
    }
}