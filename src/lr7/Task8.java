package lr7;

import java.io.*;
import java.util.ArrayList;

public class Task8 {

    public static void main(String[] args) {

        String filename = "example/eople.json";
        // создадим список объектов, которые будем записывать
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Ivan Ivanov", 30));
        people.add(new Person("Kirill Manager", 35));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("Файл сохранен");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople= new ArrayList<Person>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {

            newPeople=((ArrayList<Person>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Имя: %s \t Возраст: %d \n", p.getName(), p.getAge());
    }
}
