package lr7;
import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла в папке example: ");
        String data = scanner.nextLine();
        System.out.print("Введите слово для поиска: ");
        String substring = scanner.nextLine();
        String content = null;
        try {
            content = readFile("example/" + data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> strings = List.of(content.split(" "));
        List<String> stringsAfter = contains(strings, substring);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> contains(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.toLowerCase().contains(substring))
                .collect(Collectors.toList());
    }

    public static String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        return reader.lines().collect(Collectors.joining(System.lineSeparator()));
    }

}
