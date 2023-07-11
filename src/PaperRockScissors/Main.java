package PaperRockScissors;

public class Main {

    public static void main(String[] args) {
        Player player1 = new StaticPlayer(Move.ROCK);
        Player player2 = new RandomPlayer();

        Battle battle = new Battle();
        BattleResult result = battle.fight(player1, player2);
        System.out.println("Wynik pojedynku: " + result);

        BattleResult tournamentResult = battle.tournament(player1, player2, 5);
        System.out.println("Wynik turnieju: " + tournamentResult);
    }
}
