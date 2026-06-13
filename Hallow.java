import java.util.Scanner;

public class Hallow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 2;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(num + "\t");
                    num += 2;
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}