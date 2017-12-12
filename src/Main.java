import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        String a =scanner.nextLine();
        char c = a.charAt(0);
        char b = a.charAt(1);
        int first = Character.getNumericValue(c);
        int last = Character.getNumericValue(b);
        int result = first + last;
        System.out.println("Сумма двух чисел равна = "+result);
    }
}
