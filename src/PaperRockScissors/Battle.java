package PaperRockScissors;

class Battle {
    public BattleResult fight(Player player1, Player player2) {
        Move moveA = player1.getMove();
        Move moveB = player2.getMove();

        if (moveA == moveB) {
            return BattleResult.DRAW;
        } else if ((moveA == Move.ROCK && moveB == Move.SCISSORS) |
                (moveA == Move.PAPER && moveB == Move.ROCK) |
                (moveA == Move.SCISSORS && moveB == Move.PAPER)) {
            return BattleResult.PLAYER1;
        } else {
            return BattleResult.PLAYER2;
        }
    }

    public BattleResult tournament(Player playerA, Player playerB, int numBattles) {
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < numBattles; i++) {
            BattleResult result = fight(playerA, playerB);
            if (result == BattleResult.PLAYER1) {
                scoreA++;
            } else if (result == BattleResult.PLAYER2) {
                scoreB++;
            }
        }

        if (scoreA > scoreB) {
            return BattleResult.PLAYER1;
        } else if (scoreB > scoreA) {
            return BattleResult.PLAYER2;
        } else {
            return BattleResult.DRAW;
        }
    }
}
