package PaperRockScissors;

import PaperRockScissors.Enums.BattleResult;
import PaperRockScissors.Enums.Move;

class Battle {
    public BattleResult fight(Player player1, Player player2) {
        Move moveA = player1.getMove();
        Move moveB = player2.getMove();

        if (moveA == moveB) {
            return BattleResult.DRAW;
        } else if ((moveA == Move.ROCK && moveB == Move.SCISSORS) ||
                (moveA == Move.PAPER && moveB == Move.ROCK) ||
                (moveA == Move.SCISSORS && moveB == Move.PAPER)) {
            return BattleResult.PLAYER_A;
        } else {
            return BattleResult.PLAYER_B;
        }
    }

    public BattleResult tournament(Player playerA, Player playerB, int numBattles) {
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < numBattles; i++) {
            BattleResult result = fight(playerA, playerB);
            if (result == BattleResult.PLAYER_A) {
                scoreA++;
            } else if (result == BattleResult.PLAYER_B) {
                scoreB++;
            }
        }

        if (scoreA > scoreB) {
            return BattleResult.PLAYER_A;
        } else if (scoreB > scoreA) {
            return BattleResult.PLAYER_B;
        } else {
            return BattleResult.DRAW;
        }
    }
}
