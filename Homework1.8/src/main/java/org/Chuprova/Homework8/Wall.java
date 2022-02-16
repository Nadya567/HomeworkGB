package org.Chuprova.Homework8;

public class Wall {

    int height = 2;
    public void JumpWall(int n, int k)
    {
        System.out.println("Участник " + n + " прыгнул " + k + " метров");
        if(n >= k)
        {
            System.out.println("Участник " + n + " перепрыгнул ");
        }

    }
}
