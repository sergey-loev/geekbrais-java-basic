package geekbrains.basic.lesson4;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    public static int mapSize = 5;
    public static int dotsToWin = 4;

    public static final char eamptyField = '*';
    public static final char dotX = 'X';
    public static final char dotO = 'O';

    public static char[][] map;

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(dotX)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(dotO)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра закончена");

    }

    public static boolean checkWin(char sign) {

        if(checkMainLine(sign)||checkExtraLine(sign)) return true;

        return false;
    }

    public static boolean checkMainLine(char sign){

        int checkHorizontal;
        int checkVertical;
        int checkMainDiagonal = 0;
        int checkSideDiagonal = 0;
        boolean isWin = false;

        for(int i = 0; i< map.length; i++) {

            checkHorizontal = 0;
            checkVertical = 0;

            if (map[i][i] == sign) checkMainDiagonal++;
            else checkMainDiagonal = 0;

            if (map[i][(map.length - 1) - i] == sign) checkSideDiagonal++;
            else checkSideDiagonal = 0;

            for (int j = 0; j < map.length; j++) {

                if (map[i][j] == sign) checkHorizontal++;
                else checkHorizontal = 0;

                if (map[j][i] == sign) checkVertical++;
                else checkVertical = 0;

                if (checkHorizontal == dotsToWin || checkVertical == dotsToWin || checkMainDiagonal == dotsToWin || checkSideDiagonal == dotsToWin) return true;

            }
        }

        return false;

    }

    public static boolean checkExtraLine(char sign){

        if(checkExtraLine(0, 1, 1, 1, sign)
         ||checkExtraLine(1, 0, 1, 1, sign)
         ||checkExtraLine(3, 0,-1, 1, sign)
         ||checkExtraLine(4, 1,-1, 1, sign)) return true;

        return false;

    }

    public static boolean checkExtraLine(int startX, int startY, int dX, int dY, char sign){

        for(int i = 0; i < dotsToWin; ++i) {
            if (map[startX + i*dX][startY + i*dY] != sign) return false;
        }

        return true;

    }

    public static boolean isMapFull() {

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == eamptyField) return false;
            }
        }
        return true;

    }

    public static void aiTurn() {

        int x = 0, y = 0, xWin = 0, yWin = 0;
        boolean needBlock = false;
        boolean needWin = false;

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map.length; j++)
            {
                if (map[i][j] == eamptyField)
                {
                    map[i][j] = dotX;
                    if (checkWin(dotX)) {
                        x = i;
                        y = j;
                        needBlock = true;
                    }else if (checkWin(dotO)) {
                        xWin = i;
                        yWin = j;
                        needWin = true;
                    }
                    map[i][j] = eamptyField;
                }
            }
        }


       if(needWin){
           System.out.println("Компьютер походил в точку " + (xWin + 1) + " " + (yWin + 1));
           map[xWin][yWin] = dotO;
       }else if(needBlock){
           System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
           map[x][y] = dotO;
       }else {
           do {
               x = rand.nextInt(mapSize);
               y = rand.nextInt(mapSize);
           } while (!isCellValid(x, y));
           System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
           map[y][x] = dotO;
       }
    }

    public static void humanTurn() {

        int i, j;
        String x, y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.next();
            y = scanner.next();
        } while (!isCellValid(x, y));

        i = Integer.parseInt(x)-1;
        j = Integer.parseInt(y)-1;

        map[i][j] = dotX;
    }

    public static boolean isCellValid(String x, String y) {
        int i,j;
        try {
            i = Integer.parseInt(x)-1;
            j = Integer.parseInt(y)-1;
        } catch (NumberFormatException e) {
            return false;
        }
        if (i < 0 || i >= mapSize || j < 0 || j >= mapSize) return false;
        if (map[i][j] == eamptyField) return true;
        return false;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= mapSize || y < 0 || y >= mapSize) return false;
        if (map[y][x] == eamptyField) return true;
        return false;
    }

    public static void initMap() {
        map = new char[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = eamptyField;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= mapSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < mapSize; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < mapSize; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}