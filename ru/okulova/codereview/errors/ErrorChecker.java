package CodeReview4.ru.okulova.codereview.errors;
import java.util.Scanner;

public class ErrorChecker {
    Scanner keyboard = new Scanner(System.in);
    public int checkInteger() {
        int checkNumber;
        String line;
        while (true) {
            line = keyboard.next().trim();
            try {
                checkNumber = Integer.parseInt(line);
                System.out.println();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка. Введено неверное число.");
                System.out.print("Введите целое число: ");
            }
        }
        return checkNumber;
    }

    public String checkString() {
        String line;
        boolean valid;
        while (true) {
            line = keyboard.next().trim();
            valid = true;
            for (int i = 0; i < line.length(); i++ ) {
                char character = line.charAt(i);
                if (!Character.isLetter(character)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return line;
            } else {
                System.out.println("Ошибка. Строка должна состоять только из букв.");
                System.out.println("Введите новое значение: ");
            }
        }
    }
}