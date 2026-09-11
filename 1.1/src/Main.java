import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int n;
        n = scanner.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println("Факториал равен " + result);
    }
}
