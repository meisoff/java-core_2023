package lr8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class XmlParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("example/songs.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("song");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nCurrent element: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Song's name: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Author: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Year: " + element.getElementsByTagName("year").item(0).getTextContent());

                }
            }
            addElement(doc, inputFile);
            findSong(nodeList);
            deleteElement(nodeList, doc, inputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addElement(Document doc, File inputFile) throws TransformerException, IOException {
        // Получение корневого элемента
        Element rootElement = doc.getDocumentElement();

        // Создание нового элемента книги
        Element newSongElement = doc.createElement("song");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите название песни");
        String song = scanner.nextLine();
        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(song));
        newSongElement.appendChild(titleElement);


        System.out.println("\nВведите автора");
        String author = scanner.nextLine();
        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));
        newSongElement.appendChild(authorElement);


        System.out.println("\nВведите год");
        String year = scanner.nextLine();
        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        newSongElement.appendChild(yearElement);

        // Добавление нового элемента книги в корневой элемент
        rootElement.appendChild(newSongElement);


        // Запись обновленного документа в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        FileWriter fileWriter = new FileWriter(inputFile);
        StreamResult result = new StreamResult(fileWriter);
        transformer.transform(source, result);
        System.out.println("XML файл успешно обновлен.");
    }

    public static void findSong(NodeList nodeList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора");
        String author = scanner.nextLine();
        System.out.println("Введите год");
        String year = scanner.nextLine();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element songElement = (Element) nodeList.item(i);

            String songAuthor = getTextContent(songElement, "author");
            String songYear = getTextContent(songElement, "year");

            if ((author == null || songAuthor.equalsIgnoreCase(author)) && (year == null || songYear.equalsIgnoreCase(year))) {
                //result.add(songElement);
                System.out.println("Song's name: " + songElement.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Author: " + songElement.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Year: " + songElement.getElementsByTagName("year").item(0).getTextContent());
            }
        }
    }

    public static String getTextContent(Element element, String tagName) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            Node node = nodeList.item(0);
            return node.getTextContent();
        }
        return "";
    }
    public static void deleteElement(NodeList nodeList, Document doc, File inputFile) throws IOException, TransformerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название песни");
        String title = scanner.nextLine();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element songElement = (Element) nodeList.item(i);

            String bookTitle = getTextContent(songElement, "title");

            if (bookTitle.equals(title)) {
                songElement.getParentNode().removeChild(songElement);
                System.out.println("Песня \"" + bookTitle + "\" успешно удалена.");
            }
        }

        // Запись обновленного документа в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);

        FileWriter fileWriter = new FileWriter(inputFile);
        StreamResult result = new StreamResult(fileWriter);
        transformer.transform(source, result);

        System.out.println("XML файл успешно обновлен.");
    }
}
