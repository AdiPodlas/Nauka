package PaperRockScissors;

class StaticPlayer implements Player {
    private final Move move;

    public StaticPlayer(Move move) {
        this.move = move;
    }

    public Move getMove() {
        return move;
    }
}