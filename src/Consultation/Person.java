package Consultation;

/**
 * @author : Sergey Danilko
 * created : 12.11.2024
 **/

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String infoPerson() {
        // Формирование строки по шаблону с подстановкой значений
        return String.format("Person %s, Age: %d, Hobby: %s", name, age, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
