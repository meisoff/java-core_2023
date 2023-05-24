package lr6;

import java.util.List;
import java.util.stream.Collectors;


public class Example9 {

    public static void main(String[] args) {
        String string = "Напишите функцию6, Которая принимает на вход список " +
                "строк и возвращает6 новый6 список, Содержащий6 только те строки, " +
                "которые Начинаются6 с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = checkLen(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e: stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> checkLen(List<String> list) {
        return list.stream()
                .filter(Example9::checkByInt)
                .collect(Collectors.toList());
    }

    public static Boolean checkByInt(String word) {

        boolean hasDigits = true;
        for(int i = 0; i < word.length() && hasDigits; i++) {
            if(!Character.isAlphabetic(word.charAt(i))) {
                hasDigits = false;
            }
        }
        return hasDigits;
    }
}
