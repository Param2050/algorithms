package practice.java;

public class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {
        Person person = new Person("Param", 30);
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
    }

}
