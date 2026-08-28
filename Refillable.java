public class Refillable {
    private int amount;
    private int totalUsed;
    private int totalTimesUsedHappens;

    public Refillable(){
        amount=10;
        totalUsed=0;
    }

    public Refillable(int e){
        amount=e;
        totalUsed=0;
    }

    public void useUp(int e){
        amount-=e;
        totalUsed+=e;
        totalTimesUsedHappens++;
    }

    public void addTo(int e){
        amount+=e;
    }
    
    public int amountLeft(){
        return amount;
    }

    public double averageUse(){
        return totalUsed*1.0/totalTimesUsedHappens;
    }
}
