package HW3;

// Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)
// Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на 
// соответствие следующим правилам:
// Пароль должен быть не менее 8 символов.
// Пароль должен содержать хотя бы одну цифру.
// Пароль должен содержать хотя бы одну заглавную букву.
// Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

import java.util.Scanner;

/**
 * PasswordChecker
 */
public class PasswordVerifier {
    public static void main(String[] args) {
        boolean continueInput = true;
        do {
            try {
                Password password = checkPassword();
                System.out.println("Пароль принят.");
                continueInput = false;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        } while (continueInput);
    }

    static Password checkPassword() throws PasswordVerifier.InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            throw new InvalidInputException("Пароль должен быть не менее 8 символов.");
        }

        boolean flag = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                flag = true;
        }
        if (!flag)
            throw new InvalidInputException("Пароль должен содержать хотя бы одну цифру.");

        flag = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                flag = true;
        }
        if (!flag)
            throw new InvalidInputException("Пароль должен содержать хотя бы одну заглавную букву.");
        return new Password(password);
    }

    static class Password {
        String password;

        Password(String password) {
            this.password = password;
        }
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}