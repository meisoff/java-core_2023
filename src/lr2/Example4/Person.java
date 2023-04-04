package lr2.Example4;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор класса Person
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Методы для установки и получения имени
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Методы для установки и получения возраста
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Методы для установки и получения пола
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

