import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Average number: " + numbers(num, num1, num2));
    }

    public static int numbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum/3;
    }
}
