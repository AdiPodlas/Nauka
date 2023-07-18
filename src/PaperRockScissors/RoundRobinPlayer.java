package PaperRockScissors;

import PaperRockScissors.Enums.Move;

class RoundRobinPlayer implements Player {
    private int moveIndex;

    public Move getMove() {
        Move[] moves = Move.values();
        Move move = moves[moveIndex];
        moveIndex = (moveIndex + 1) % moves.length;
        return move;
    }
}
