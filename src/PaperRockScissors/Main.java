package PaperRockScissors;

import PaperRockScissors.Enums.BattleResult;
import PaperRockScissors.Enums.Move;

public class Main {

    public static void main(String[] args) {
        Player player1 = new StaticPlayer(Move.SCISSORS);
        Player player2 = new HumanPlayer();

        player1.test();
        player2.test();


        Battle battle = new Battle();
        BattleResult result = battle.fight(player1, player2);
        System.out.println("Wynik pojedynku: " + result);

        BattleResult tournamentResult = battle.tournament(player1, player2, 5);
        System.out.println("Wynik turnieju: " + tournamentResult);
    }
}
