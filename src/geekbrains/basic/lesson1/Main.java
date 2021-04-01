package geekbrains.basic.lesson1;

public class Main {

    public static void main(String[] args) {
        int m = 5;
        int n = 6;

        fillTheMatrix(m, n);
    }

    public static void fillTheMatrix(int m, int n) {
        /**Создадим зарание массив из количества
         * элементов равного количеству элементов в двумерном массиве*/
        int[] arrNumbers = createNewArr(m * n);
        /**Создадим пустой двумерный массив*/
        int[][] arr = new int[m][n];
        /**Положение начального элемента*/
        int k = 0;
        int l = 0;
        /**выбираем начальное направление движения,
         * запоминаем имя переменной измерения,
         * запоминаем количество шагов до цели*/
        String goToThe = "right";
        int numberChek = n;
        String numberChekVarName = "n";

        for(int number : arrNumbers) {

            if (number == numberChek) {
                /**меняем направление движения уменьшаем m/n*/
                if (goToThe == "right") {
                    goToThe = "down";
                    m--;
                } else if (goToThe == "down") {
                    goToThe = "left";
                    n--;
                }else if (goToThe == "left") {
                    goToThe = "up";
                    m--;
                } else {
                    goToThe = "right";
                    n--;
                }
                /**Меняем чекпоинт запоминаем измерение обхода*/
                if (numberChekVarName == "m") {
                    numberChek = numberChek + n;
                    numberChekVarName = "n";
                } else {
                    numberChek = numberChek + m;
                    numberChekVarName = "m";
                }
            }
            /**Заполняем массив по направлению движения*/
            if (goToThe == "right") {
                arr[k][l] = number;
                l++;
            }
            if (goToThe == "down") {
                arr[k][l] = number;
                k++;
            }
            if (goToThe == "left") {
                arr[k][l] = number;
                l--;
            }
            if (goToThe == "up") {
                arr[k][l] = number;
                k--;
            }
            /**Пошаговый вывод матрицы в консоль*/
            printArr(arr);

        }

    }

    public static void printArr ( int[][] arr){

        String arrInString = "";
        System.out.println("MATRIX:");

        for (int i = 0; i < arr.length; i++) {
            arrInString = "";
            if(arr[i][0]<10)
                arrInString = arrInString + " " + arr[i][0];
            else
                arrInString = arrInString + arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] < 10)
                    arrInString = arrInString + ", " + arr[i][j];
                else
                    arrInString = arrInString + "," + arr[i][j];
            }
            System.out.println("[" + arrInString + "]");
        }

    }

    public static int[] createNewArr ( int length){

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = i + 1;

        return arr;

    }

}