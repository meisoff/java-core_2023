package lr8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("example/songs.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Root element: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("songs");
            JSONObject songs = new JSONObject();

            for (Object o: jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nCurrent element: song");
                System.out.println("Song's name: " + book.get("title"));
                System.out.println("Author: " + book.get("author"));
                System.out.println("Year: " + book.get("year"));
            }

            findsong(jsonArray);
            jsonArray = addSong(jsonArray);
            jsonArray = deleteSong(jsonArray);
            songs.put("songs", jsonArray);

            try (FileWriter file = new FileWriter("example/songs.json")) {
                file.write(songs.toJSONString());
                System.out.println("Json success created!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findsong(JSONArray jsonArray) {
        System.out.println("-----------------");
        System.out.println("Ищем песню");
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора");
        String author = scanner.nextLine();

        for (Object o: jsonArray) {
            JSONObject song = (JSONObject) o;

            if (song.get("author").equals(author)) {
                System.out.println("Song's name: " + song.get("title"));
                System.out.println("Author: " + song.get("author"));
                System.out.println("Year: " + song.get("year"));
            }
        }
    }

    public static JSONArray addSong(JSONArray jsonArray) {
        System.out.println("-----------------");
        System.out.println("Добавляем песню");
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название");
        String title = scanner.nextLine();
        System.out.println("Введите автора");
        String author = scanner.nextLine();
        System.out.println("Введите год");
        Integer year = scanner.nextInt();

        JSONObject newSong = new JSONObject();
        newSong.put("title", title);
        newSong.put("author", author);
        newSong.put("year", year);

        jsonArray.add(newSong);
        return jsonArray;
    }

    public static JSONArray deleteSong(JSONArray jsonArray) {
        System.out.println("-----------------");
        System.out.println("Удаляем песню");
        System.out.println("-----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название");
        String title = scanner.nextLine();

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }}

        return jsonArray;

    }
}
