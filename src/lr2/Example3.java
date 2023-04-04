package lr2;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String plainText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine(); // очистка буфера после ввода числа

        String cipherText = encrypt(plainText, key);
        System.out.println("Текст после преобразования: " + cipherText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(cipherText, key);
            System.out.println("Расшифрованный текст: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }

        scanner.close();
    }

    public static String encrypt(String plainText, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);

            if (Character.isLetter(ch)) {
                char shifted = (char) ((ch + key - 1040) % 32 + 1040); // шифрование символа
                cipherText.append(shifted);
            } else {
                cipherText.append(ch);
            }
        }

        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key) {
        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);

            if (Character.isLetter(ch)) {
                char shifted = (char) ((ch - key - 1040 + 32) % 32 + 1040); // дешифрование символа
                plainText.append(shifted);
            } else {
                plainText.append(ch);
            }
        }

        return plainText.toString();
    }
}