package org.Chuprova.Homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static int size = 3;
    public static int dotToWin = 3;
    public static char dotO = '0';
    public static char dotX = 'X';
    public static char dotEmpty = '*';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args){
        MapInitialize();
        MapPrint();

        while (true)
        {
            HumanTurn();
            MapPrint();

            if(CheckWin(dotX))
            {
                System.out.println("Вы победили!");
                break;
            }

            if(MapFull())
            {
                System.out.println("Ничья!");
                break;
            }

            AITurn();
            MapPrint();

            if(CheckWin(dotO))
            {
                System.out.println("Искусственный интеллект победил");
                break;
            }

            if(MapFull())
            {
                System.out.println("Ничья!");
                return;
            }
        }

        System.out.println("Игра закончена!");
    }

    public static void MapInitialize()
    {
        map = new char[size][size];
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map.length; j++)
            {
                map[i][j] = dotEmpty;
            }
        }
    }

    public  static  void MapPrint()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  static  void HumanTurn()
    {
        int x;
        int y;

        do
        {
            System.out.println("Введите координаты клетки через пробел: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!IsCellValid(x, y));
        map[x][y] = dotX;

    }

    public static void AITurn()
    {
        int x;
        int y;

        do
        {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        }
        while(!IsCellValid(x, y));

        System.out.println("Искусственный интеллект сходил в клетку " + (x + 1) + " " + (y + 1));
        map[x][y] = dotO;
    }

    public static boolean IsCellValid(int x, int y)
    {
        if(x < 0 || x > size || y < 0 || y > size)
        {
            return false;
        }

        if(map[x][y] == dotEmpty)
        {
            return true;
        }

        return false;
    }

    public static boolean CheckWin(char symb)
    {
        for(int i = 0; i < size; i++)
        {
            if((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) ||
            (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) ||
                    (map[i][i] == symb && map[i + 1][i + 1] == symb && map[i + 2][i + 2] == symb) ||
                    (map[2][i] == symb && map[1][i] == symb && map[0][i] == symb))
                return true;
        }
        return false;

        /*if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;

        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;

        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;*/
    }

    public static boolean MapFull()
    {
        for (int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(map[i][j] == dotEmpty)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
