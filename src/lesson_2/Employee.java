package lesson_2;/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст. Конструктор класса должен
заполнять эти поля при создании объекта. Внутри класса "Сотрудник" написать метод, который выводит информацию об
объекте в консоль.
 */

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Employee:" +
                "fullName= " + fullName +
                ", jobTitle= " + position +
                ", email= " + email +
                ", phone= " + phone +
                ", salary= " + salary +
                ", age= " + age
        );
    }
}