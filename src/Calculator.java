import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();
        String[] elements = expression.split(" ");

        if (elements.length != 3) throw new IllegalArgumentException("Некорректное выражение");

        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        String operator = elements[1];
        int result;

        if (num1 > 0 && num1 <=10 && num2 > 0 && num2 <=10) {
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> throw new IllegalArgumentException("Некорректный оператор");
            }
            System.out.println("Результат: " + result);
        }
        else throw new IllegalArgumentException("Принимаемые значения должны быть от 1 до 10 включительно");
    }
}