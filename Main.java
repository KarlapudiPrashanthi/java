import java.util.Scanner;

public class Main {

    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        System.out.println(
            (fact(a) + fact(b) + fact(c) == n)
            ? "Special Number"
            : "Not a Special Number"
        );
    }
}