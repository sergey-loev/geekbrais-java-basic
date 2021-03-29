package geekbrains.basic.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,1,0,0};
        inversionArray(arr);

    }

    static void inversionArray(int[] arr) {

        String arrInString= "";
        for(int i=0 ; i<10 ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr = ["+ arrInString + "]");

        for(int i=0 ; i<10 ; i++){
            if (arr[i]==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
        }

        arrInString= "";
        for(int i=0 ; i<10 ; i++){
            arrInString = arrInString + "," + arr[i];
        }
        System.out.println("arr = ["+ arrInString + "]");

    }

}
