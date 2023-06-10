package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class LinkParser {
    private static final int MAX_RETRY_COUNT = 3; // Максимальное количество попыток переподключения
    private static final int RETRY_DELAY_MS = 2000; // Задержка (в миллисекундах) перед повторной попыткой подключения

    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        String outputFilePath = "links.txt"; // Путь к файлу для сохранения результатов

        int retryCount = 0;
        boolean success = false;

        while (retryCount < MAX_RETRY_COUNT && !success) {
            try {
                Document doc = Jsoup.connect(url).get();
                Elements links = doc.select("a[href]");

                FileWriter writer = new FileWriter(outputFilePath); // Создание FileWriter для записи в файл

                for (Element link : links) {
                    String absoluteUrl = link.attr("abs:href");
                    writer.write(absoluteUrl + "\n"); // Запись ссылки в файл, каждая ссылка на новой строке
                }

                writer.close(); // Закрытие FileWriter после записи

                System.out.println("Результаты сохранены в файл: " + outputFilePath);
                success = true;
            } catch (IOException e) {
                System.out.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
                retryCount++;

                if (retryCount < MAX_RETRY_COUNT) {
                    System.out.println("Попытка переподключения через " + RETRY_DELAY_MS + " мс...");
                    try {
                        Thread.sleep(RETRY_DELAY_MS);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

        if (!success) {
            System.out.println("Не удалось получить HTML-код страницы после " + MAX_RETRY_COUNT + " попыток.");
        }
    }
}


