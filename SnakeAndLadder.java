package com.javaprograms;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder game");
        final int INITIAL_POSITION = 0;
        final int NO_OF_PLAYERS = 1;
        Random random = new Random();
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;
        int currentPosition = INITIAL_POSITION;
        int winningPosition = 100;
        int timeDiesRolled = 0;


        while (currentPosition < winningPosition) {
            int option = random.nextInt(3);
            int dieMove = rollDie();
            timeDiesRolled++;
            switch (option) {
                case NO_PLAY:
                    currentPosition += 0;
                    System.out.println(">>>>>>NoPlay");
                    break;
                case LADDER:
                    if((currentPosition+dieMove)>winningPosition)
                        currentPosition=currentPosition;
                    else{
                    currentPosition = currentPosition + dieMove;
                    System.out.println(">>>>>>U got ladder");}
                    break;
                case SNAKE:
                    if ((currentPosition - dieMove) <= 0)
                        currentPosition = 0;
                    else{
                        currentPosition = currentPosition - dieMove;
                        System.out.println(">>>>>>you bitten by snake");}
                    break;
            }
            System.out.println("PlayerPosition = " + currentPosition);
        }
        System.out.println("******PlayerRolled "+timeDiesRolled+" times to reach Winning Position*****");
    }

    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
