package com.javaprograms;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("welcome to snake and ladder game");
        final int INITIAL_POSITION=0;
        final int NO_OF_PLAYERS=1;
        int dieMove=rollDie();
    }
    public static int rollDie() {
        Random random =new Random();
        return random.nextInt(6)+1;
    }
}
