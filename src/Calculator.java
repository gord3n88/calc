import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        String[] elements = expression.split(" ");

        if (elements.length != 3) {
            System.out.println("Некорректное выражение");
            return;
        }

        double num1 = Double.parseDouble(elements[0]);
        double num2 = Double.parseDouble(elements[2]);
        String operator = elements[1];

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}