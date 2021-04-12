package com.company;

public class Person {
    /**1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     * 4. Создать массив из 5 сотрудников.
     * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String post, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("Full name: %s \nPost: %s \nEmail: %s \nPhone: %s \nSalary: %d \nAge: %d"
                ,this.fullName, this.post, this.email, this.phone, this.salary, this.age);
    }

    public int getAge() {
        return age;
    }
}
