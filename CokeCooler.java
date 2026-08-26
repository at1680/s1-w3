public class CokeCooler {
    private int amount;

    public CokeCooler(){
        amount = 100;
    }

    public void setCokes(int e){
        amount = e;
    }

    public void drinkCoke(int e){
        amount-=e;
    }

    public void refillCoke(int e){
        amount+=e;
    }

    public int cokeCount(){
        return amount;
    }
}
