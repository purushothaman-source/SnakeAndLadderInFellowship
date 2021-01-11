package com.javaprograms;

import java.util.Random;

public class SnakeAndLadder {
    static int choice = 0;

    public static void main(String[] args) {
        System.out.println("WELCOME TO SNAKE AND LADDER GAME");
        int player1rolled = 0;
        int player2rolled = 0;
        int player1Position = 0;
        int player2Position = 0;

        while (true) {
            player1Position = snakeAndLadderGame(player1Position);
            player1rolled++;
            if (player1Position == 100) {
                System.out.println(
                        "PLAYER1POSITION :" + player1Position + ">>>>>>>  " + "PLAYER2POSITION :" + player2Position);
                System.out.println("PLAYER1 WON BY ROLLED : " + player1rolled + " times");
                break;
            }

            while (choice == 1) {

                player1Position = snakeAndLadderGame(player1Position);
                player1rolled++;
            }
            if (player1Position == 100) {
                System.out.println(
                        "PLAYER1POSITION :" + player1Position + ">>>>>>>  " + "PLAYER2POSITION :" + player2Position);
                System.out.println("PLAYER1 WON BY ROLLED : " + player1rolled + " times");
                break;
            }

            player2Position = snakeAndLadderGame(player2Position);
            if (player2Position == 100) {
                System.out.println(
                        "PLAYER1POSITION :" + player1Position + ">>>>>>>  " + "PLAYER2POSITION :" + player2Position);
                System.out.println("PLAYER2 WON BY ROLLED : " + player2rolled + " times");
                break;
            }
            player2rolled++;

            while (choice == 1) {

                player2Position = snakeAndLadderGame(player2Position);
                player2rolled++;

            }
            if (player2Position == 100) {
                System.out.println(
                        "PLAYER1POSITION :" + player1Position + ">>>>>>>  " + "PLAYER2POSITION :" + player2Position);
                System.out.println("PLAYER2 WON BY ROLLED : " + player2rolled + " times");
                break;
            }


        }


    }

    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int snakeAndLadderGame(int playerposition) {
        Random random = new Random();
        final int NO_PLAY = 0;
        final int LADDER = 1;
        final int SNAKE = 2;
        choice = random.nextInt(3);
        int dieMove = rollDie();
        switch (choice) {
            case NO_PLAY:
                playerposition += 0;
                break;
            case LADDER:
                if ((playerposition + dieMove) > 100)
                    playerposition = playerposition ;
                else
                    playerposition = playerposition + dieMove;
                break;
            case SNAKE:
                if ((playerposition - dieMove) < 0)
                    playerposition = 0;
                else
                    playerposition = playerposition - dieMove;
                break;
        }
        return playerposition;

    }

}
