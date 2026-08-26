public class CandyJar{  
    private int amount;
    
    public CandyJar(){
        amount = 10;
    }

    public void setCandy(int e){
        amount = e;
    }    

    public void eatCandy(int e){
        amount-=e;
    }

    public void refillCandy(int e){
        amount+=e;
    }

    public void printState(){
        System.out.println("The amount of candy left is: " + amount);
    }
}