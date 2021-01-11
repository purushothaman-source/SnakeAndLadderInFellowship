package com.javaprograms;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder game");
        final int INITIAL_POSITION = 0;
        final int NO_OF_PLAYERS = 1;
        int dieMove = rollDie();

        Random random = new Random();
        int option = random.nextInt(3);
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;
        int currentPosition = INITIAL_POSITION;

        switch (option) {
            case NO_PLAY:
                currentPosition += 0;
                break;
            case LADDER:
                currentPosition = currentPosition + dieMove;
                break;
            case SNAKE:
                if ((currentPosition - dieMove) <= 0)
                    currentPosition = 0;
                else
                    currentPosition = currentPosition - dieMove;
                break;
        }
    }

    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
