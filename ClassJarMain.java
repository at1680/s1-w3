public class ClassJarMain{
    public static void main(String[] args){
        CandyJar gummies = new CandyJar();
        CandyJar chocolate = new CandyJar();

        chocolate.setCandy(50);

        gummies.eatCandy(35);

        chocolate.eatCandy(23);

        gummies.refillCandy(78);

        chocolate.refillCandy(54);

        gummies.printState();

        chocolate.printState();

    }
    

    


}