package PaperRockScissors;

public interface Player {
    Move getMove();
    default void rememberOpponentMove(Move move) {
    }
}