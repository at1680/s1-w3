public class CokeCoolerMain {
    public static void main(String[] args){
        CokeCooler coke = new CokeCooler();
        CokeCooler pepsi = new CokeCooler();

        coke.setCokes(150);

        pepsi.drinkCoke(50);

        coke.drinkCoke(50);

        pepsi.refillCoke(35);

        coke.refillCoke(45);

        System.out.println(pepsi.cokeCount());

        System.out.println(coke.cokeCount());
    }
}
