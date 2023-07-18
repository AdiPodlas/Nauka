package PaperRockScissors;

import PaperRockScissors.Enums.Move;

import java.util.Random;

class RandomPlayer implements Player {
  private final Random random = new Random();

    public Move getMove() {
        Move[] moves = Move.values();
        return moves[random.nextInt(moves.length)];
    }
}
