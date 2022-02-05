package org.Chuprova.Homework8;

import java.util.Random;

public class MainClass {



    int[] wallHeight = new int[5];
    int[] trackDistance = new int[5];

    public static void main(String[] args)
    {


        int[] members = new int[6];
        int[] obstacles = new int[6];

        FillArrays(members, obstacles);
        TestingMembers(members, obstacles);
    }

    public static void FillArrays(int[] members, int[] obstacles)
    {
        Random random = new Random();
        for(int i = 0; i < 6; i++)
        {
            members[i] = random.nextInt(3);
            obstacles[i] = random.nextInt(2);
        }
    }

    public static void TestingMembers(int[] members, int[] obstacles)
    {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Wall wall = new Wall();
        RunningTrack runningTrack = new RunningTrack();

        for(int i = 0; i < 6; i++)
        {
            if(members[i] == 0)
            {
                if(obstacles[i] == 0)
                {
                    human.Run(human.dist, runningTrack.distance);
                }
                else
                {
                    human.Jump(human.height, wall.height);
                }

            }

            if(members[i] == 1)
            {
                if(obstacles[i] == 0)
                {
                    cat.Run(cat.dist, runningTrack.distance);
                }
                else
                {
                    cat.Jump(cat.height, wall.height);
                }

            }

            if(members[i] == 2)
            {
                if(obstacles[i] == 0)
                {
                    robot.Run(robot.dist, runningTrack.distance);
                }
                else
                {
                    robot.Jump(robot.height, wall.height);
                }

            }
        }
    }


}
