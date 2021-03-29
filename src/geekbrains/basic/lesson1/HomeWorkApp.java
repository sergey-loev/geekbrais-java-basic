package geekbrains.basic.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }

    public static void checkSumSign() {
        int a = -4;
        int b = 10;

        if (a + b == 0) {
            System.out.println("Сумма ровна нулю");
        }else if (a + b > 0 ) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void  printColor() {
        int  value = 102;

        if (value <= 0) {
            System.out.println("Красный");
        }else if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        }else if(value > 100){
            System.out.println("Зеленый");
        }

    }

    public static void  compareNumbers() {
        int a = 45;
        int b = 9;

        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }

    }
}
