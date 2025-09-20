import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();

        if (n > m) {
            System.out.println(n-m);
        } else if (n < m) {
            System.out.println(m-n);
        }
    }
}