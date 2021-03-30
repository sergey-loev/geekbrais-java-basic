package geekbrains.basic.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        //1
        System.out.println("Задание №1");
        int[] arr = {1,0,0,1,1,1,0,1,0,0};
        inversionArray(arr);
        //2
        System.out.println("\nЗадание №2");
        сreateArray(100);
        //3
        System.out.println("\nЗадание №3");
        сheckAndChange();
        //4
        System.out.println("\nЗадание №4");
        fillingMatrix(5);
        //5
        System.out.println("\nЗадание №5");
        int[] newArr = initialArray(15,9);
        //вывод массива который вернул метод.
        String arrInString= "";
        arrInString = arrInString + newArr[0];
        for(int i=1 ; i < newArr.length ; i++){
            arrInString = arrInString + "," + newArr[i];
        }
        System.out.println("Returned Arr = ["+ arrInString + "]");
        //6*
        System.out.println("\nЗадание №6");
        minAndMax();
        //7**
        System.out.println("\nЗадание №7");
        int[] checkArr = {3,2,5,1,4,4,3};
        boolean check = checkBalance(checkArr);
        System.out.println("Есть место где левая и правая часть равны: " + check);
        //8***
        System.out.println("\nЗадание №8");
        int[] newarr = {1,2,3,4,5,6,7,8,9,0};
        int shift = -13;
        shiftArray(newarr, shift);
    }

    static void inversionArray(int[] arr) {

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i<10 ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr    = ["+ arrInString + "]");

        for(int i=0 ; i<10 ; i++){
            if (arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }

        arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i<10 ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("newArr = ["+ arrInString + "]");

    }

    static void сreateArray(int arrLength) {
        int[] arr = new int[arrLength];

        for(int i = 0; i < arrLength; i++){
            arr[i] = i+1;
        }

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("Arr = ["+ arrInString + "]");

    }

    static void сheckAndChange() {

        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr    = ["+ arrInString + "]");

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i]*2;
            }
        }

        arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("newArr = ["+ arrInString + "]");

    }

    static void fillingMatrix(int matrixLength) {

        int[][] matrix = new int[matrixLength][matrixLength];


        for(int i = 0; i < matrixLength; i++){
            for(int j = 0; j < matrixLength; j++) {
                matrix[i][j] = 0;
            }
        }

        String arrInString= "";
        System.out.println("MATRIX:");
        int i=0;
        int j=0;
        for(i=0 ; i < matrixLength ; i++){
            arrInString= "";
            arrInString = arrInString + matrix[i][0];
            for(j = 1; j < matrixLength; j++) {
            arrInString = arrInString + "," + matrix[i][j];
            }
            System.out.println("["+ arrInString + "]");
        }

        for(i=0 ; i < matrixLength ; i++){
            for(j = 0; j < matrixLength; j++) {
               if(i==j){
                   matrix[i][j] = 1;
               }else if(i== matrixLength - 1 -j){
                   matrix[i][j] = 1;
                }
            }
        }

        System.out.println("NEW MATRIX:");
        i=0;
        j=0;
        for(i=0 ; i < matrixLength ; i++){
            arrInString= "";
            arrInString = arrInString + matrix[i][0];
            for(j = 1; j < matrixLength; j++) {
                arrInString = arrInString + "," + matrix[i][j];
            }
            System.out.println("["+ arrInString + "]");
        }
    }

    static int[] initialArray(int len, int initialValue) {

        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }

        return arr;
    }

    static void minAndMax() {

        int[] arr = {12,43,24,65,43,123,35,8,98};

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr    = ["+ arrInString + "]");

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("MIN = [" + min + "]");
        System.out.println("MAX = [" + max + "]");

    }

    static boolean checkBalance(int[] arr) {

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr    = ["+ arrInString + "]");

        boolean check = false;
        int chekPlace = 0;
        int leftPart = arr[0];

        for(int i=1 ; i < arr.length ; i++){
            int rightPart = 0;
            for(int j = i ; j < arr.length ; j++){
                rightPart = rightPart + arr[j];
            }
            if(leftPart == rightPart){
                check = true;
                chekPlace = i;
                break;
            }
            leftPart = leftPart + arr[i];
        }
        if(check) {
            arrInString = "";
            arrInString = arrInString + arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (i == chekPlace) {
                    arrInString = arrInString + "|||" + arr[i];
                } else {
                    arrInString = arrInString + "," + arr[i];
                }
            }
            System.out.println("Chek place = [" + arrInString + "]");
        }
        return check;
    }

    static void shiftArray(int[] arr, int shift) {

        String arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr    = [" + arrInString + "]");
        //Добавил деление по модулю для избежания избыточности сдвига если сдвиг происходит на количество позиций больше длины массива
        shift = shift % arr.length;

        if(shift < 0){
            shift = arr.length + shift;
        }

        while(shift > 0) {

            int lastElement = arr[arr.length - 1];

            for (int i = 0; i < arr.length; i++) {

                int currentElement = arr[i];
                arr[i] = lastElement;
                lastElement = currentElement;

            }

            shift--;

        }

        arrInString= "";
        arrInString = arrInString + arr[0];
        for(int i=1 ; i < arr.length ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("newArr = ["+ arrInString + "]");
    }

}
