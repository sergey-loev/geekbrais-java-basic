package com.company;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Accountant", "pepetrov@mailbox.com", "892334523", 35000, 40);
        persArray[2] = new Person("Vasiliev Vasiliy", "Locksmith", "vavasiliev@mailbox.com", "892345683", 16000, 55);
        persArray[3] = new Person("Maximov Maxim", "PR manr", "mamaximov@mailbox.com", "892334566", 50000, 37);
        persArray[4] = new Person("Konstantinov Konstantin", "Director", "kokonstantinov@mailbox.com", "892377777", 150000, 60);

        for (Person member:persArray){
            if(member.getAge() >= 40){
                member.printInfo();
                System.out.println("\n");
            }
        }
    }
}
