public class ScoreMain {
    public static void main(String[] args){
        Score player1 = new Score();
        Score player2 = new Score(100);
    
        player1.scoreIncrease(50);

        player2.scoreDecrease(50);;

        System.out.println(player1.scoreReport());

        System.out.println(player2.scoreReport());

    }
}
