import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int보다 더 큰 범위의 자료형을 받아야한다.
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();

        System.out.println(a+b+c);
    }
}