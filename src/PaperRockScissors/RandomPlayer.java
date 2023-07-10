package PaperRockScissors;

import java.util.Random;

class RandomPlayer implements Player {
    private final Random random;

    public RandomPlayer() {
        random = new Random();
    }

    public Move getMove() {
        Move[] moves = Move.values();
        return moves[random.nextInt(moves.length)];
    }
}
