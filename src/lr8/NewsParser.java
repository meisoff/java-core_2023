package lr8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try {
            // Get HTML code from the page
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Extract news list
            Elements newParent = doc
                    .select("body > table > tbody > tr > td > div >" +
                            " table > tbody > tr:nth-child(5) > td:nth-child(3) " +
                            "> table > tbody > tr > td:nth-child(1)");

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newParent.get(0).childNodes();
                    System.out.println("Theme: " + ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0) + "\n");

                    System.out.println("Date: " + ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0) + "\n");

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
