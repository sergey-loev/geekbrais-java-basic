package geekbrains.basic.lesson1;

public class Main {

    public static void main(String[] args) {
        int m = 5;
        int n = 6;

        fillTheMatrix(m, n);
    }

    public static void fillTheMatrix(int m, int n) {

        int[] arrNumbers = createNewArr(m*n);

        int[][] arr = new int[m][n];
        int k = 0;
        int numberChek = m;

        for (int number:arrNumbers) {
            for(int i = 0; i < m; i++){

            }



        }



        /**for(int i = 0; i < m; i++){

            for(int j = 0; j < n;j++){

                if(i%2 == 0){
                    arr[i][j] = arrNumbers[k];
                    k++;
                }

            }




        }**/
        /**String arrInString= "";
        System.out.println("MATRIX:");

        for(int i=0 ; i < m ; i++){
            arrInString= "";
            arrInString = arrInString + arr[i][0];
            for(int j = 1; j < n; j++) {
                arrInString = arrInString + "," + arr[i][j];
            }
            System.out.println("["+ arrInString + "]");
        }*/

    }

    public static int[] createNewArr(int length) {

        int[] arr = new int[length];

        for(int i = 0; i < length; i++)
            arr[i] = i;

        return arr;

    }
}
