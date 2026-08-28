public class RefillableMain {
    public static void main(String[] args){
        Refillable r = new Refillable();
        Refillable r1 = new Refillable(100);

        r.addTo(50);

        r1.useUp(25);

        System.out.println("Should be 60: " + r.amountLeft());

        System.out.println("Should be 75: " + r1.amountLeft());

        System.out.println("Should be 25: " + r1.averageUse());
    }
}
