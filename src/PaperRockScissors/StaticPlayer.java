package PaperRockScissors;

import PaperRockScissors.Enums.Move;

class StaticPlayer implements Player {
    private final Move move;

    public StaticPlayer(Move move) {
        this.move = move;
    }


    public Move getMove() {
        return move;
    }

    @Override
    public void test() {
        System.out.println("Static Test");
    }
}

