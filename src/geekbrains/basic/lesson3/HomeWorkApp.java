package geekbrains.basic.lesson3;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////

        /**1. Написать метод, принимающий на вход два целых числа и проверяющий,
        * что их сумма лежит в пределах от 10 до 20 (включительно),
        * если да – вернуть true, в противном случае – false.**/

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите любое целое число A: ");
        int numberA = scan.nextInt();

        System.out.println("Введите любое целое число B: ");
        int numberB = scan.nextInt();

        boolean checkResult = checkSum(numberA, numberB);
        System.out.println("Сумма принадлежит [10; 20]: " + checkResult);

        //////////////////////////////////////////////////////////////////////////

        /**2. Написать метод, которому в качестве параметра передается целое число,
         * метод должен напечатать в консоль, положительное ли число передали
         * или отрицательное. Замечание: ноль считаем положительным числом.**/

        System.out.println("Введите любое целое число для проверки: ");
        int number = scan.nextInt();

        checkNumberAndPrint(number);

        //////////////////////////////////////////////////////////////////////////

        /**3. Написать метод, которому в качестве параметра передается целое число.
         * Метод должен вернуть true, если число отрицательное,
         * и вернуть false если положительное.**/

        System.out.println("Введите любое целое число для проверки: ");
        number = scan.nextInt();

        boolean checkNumber = checkNumber(number);
        System.out.println("введенное число является отрицательным: " + checkNumber);

        //////////////////////////////////////////////////////////////////////////

        /**4. Написать метод, которому в качестве аргументов передается
         * строка и число, метод должен отпечатать в консоль указанную
         * строку, указанное количество раз;**/

        System.out.println("Сколько раз необходимо напечатать строку?");
        number = scan.nextInt();

        String str = "Строка будет напечатана еще %d раз.";

        printString(str, number);

        //////////////////////////////////////////////////////////////////////////

        /**5. * Написать метод, который определяет, является ли год високосным,
         * и возвращает boolean (високосный - true, не високосный - false).
         * Каждый 4-й год является високосным,
         * кроме каждого 100-го,
         * при этом каждый 400-й – високосный.**/

        System.out.println("Введите год для проверки: ");
        int year = scan.nextInt();

        boolean checkYear = chekLeapYear(year);

        if(checkYear)
            System.out.println("Введенный год является високосным!");
        else
            System.out.println("Введенный год НЕ является високосным.");

    }

    public static boolean checkSum(int numberA, int numberB) {

        int sum = numberA +numberB;

        if(sum >= 10 && sum <=20)
            return true;
        else
            return false;

    }

    public static void checkNumberAndPrint(int number) {

        String str = "";

        if(number < 0)
            str = "меньше";
        else
            str = "больше";

        System.out.println(String.format("Введенное число %d %s нуля.",number,str));
    }

    public static boolean checkNumber(int number) {

        if(number < 0)
            return true;
        else
            return false;

    }

    public static void printString(String str,int number) {

        for(int i = 0; i < number; i++ ){

            System.out.println(String.format(str,(number-1)-i));

        }
    }

    public static boolean chekLeapYear(int year) {

        int check4 = year % 4;
        int check100 = year % 100;
        int check400 = year % 400;

        if(check4 == 0 && check100 != 0 || check4 == 0 && check400 == 0)
            return true;
        else
            return false;

    }

}
