package org.Chuprova;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {


    public static void main(String[] args){

        int checkStart;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите 1, если хотите сыграть, введите 0, если хотите закончить игру");
            checkStart = sc.nextInt();

            if(checkStart != 1)
            {
                break;
            }

            GuessNumber();
        }

    }

    public static void GuessNumber()
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numb = rand.nextInt(10);
        int playerNumb;

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Введите число ");
            playerNumb = sc.nextInt();

            if(playerNumb == numb)
            {
                System.out.println("Вы угадали!");
                break;
            }

            else
            {
                if (i == 2)
                {
                    System.out.println("Вы не угадали ");
                    break;
                }
                if(playerNumb < numb)
                {
                    System.out.println("Загаданное число больше, попробуйте еще раз ");
                }

                if(playerNumb > numb)
                {
                    System.out.println("Загаданное число меньше, попробуйте еще раз ");
                }
            }
        }
    }
}