import java.util.Scanner;

public class Testik {
    public static void main(String[] args) {
    }
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите cnjhjye A: ");
    int a;
    a = scanner.nextInt();
    if (a > 0) {
        System.out.println(a);
    } else {
        System.out.println("Не подходит!");
        return;
    }

    System.out.print("Введите одну сторону b: ");
    int b;
    b = scanner.nextInt();
    if (b > 0) {
        System.out.println(b);
    } else {
        System.out.println("Не подходит!");
        return;
}
