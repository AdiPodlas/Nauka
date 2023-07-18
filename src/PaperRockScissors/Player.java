package PaperRockScissors;

import PaperRockScissors.Enums.Move;

public interface Player {
    Move getMove();
    default void test(){
        System.out.println("TEST");

    }
}