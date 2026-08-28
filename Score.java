public class Score {
    private int score;

    public Score(){
        score=50;
    }

    public Score(int e){
        score=e;
    }

    public void scoreIncrease(int e){
        score+=e;
    }

    public void scoreDecrease(int e){
        score-=e;
    }

    public int scoreReport(){
        return score;
    }
}
