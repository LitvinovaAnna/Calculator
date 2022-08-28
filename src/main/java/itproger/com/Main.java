package itproger.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Действие");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        int res;

        switch (action) {
            case "+":
                res = num + num2;
                System.out.println("Результат " + res);
                break;
            case "-":
                res = num - num2;
                System.out.println("Результат " + res);
                break;
            case "*":
                res = num * num2;
                System.out.println("Результат " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = num / num2;
                    System.out.println("Результат " + res);
                }
                break;

            default:
                System.out.println("Что-то пошло не так");

        }
    }
}

