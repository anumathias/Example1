package example;
 class Cars{
    void features() {
        System.out.println("Num of seats: 5, 7");
        System.out.println("Fuel Efficiency: 24.12");
        System.out.println("Touch Screen : Fully Automatic, Normal");
    }
}
class Nano extends C1{

    void features() {
        System.out.println("Features of nano");
        System.out.println("Num of seats: 5, 7");
        System.out.println("Fuel Efficiency: 24.12");
        System.out.println("Gear : Normal");
    }

}

class i10 extends C1{
    void features() {
        System.out.println("Features of i10");
        System.out.println("Num of seats: 4");
        System.out.println("Fuel Efficiency: 30.33");
        System.out.println("Gear : Fully Automatic");
    }
}

public class C1{

    public static void main(String[]args) {
        Nano n = new Nano();
        n.features();
        i10 i = new i10();
        i.features();

    }

}

