package org.Chuprova.Homework8;

public class RunningTrack {

    int distance = 150;
    public void RunTrack(int n, int k)
    {
        System.out.println("Участник " + n + " пробежал " + k + " метров");
        if(n >= k)
        {
            System.out.println("Участник " + n + " пробежал ");
        }

    }
}
