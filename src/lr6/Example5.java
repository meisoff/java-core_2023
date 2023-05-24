package lr6;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "которые Начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        String substring = "на";

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
}
