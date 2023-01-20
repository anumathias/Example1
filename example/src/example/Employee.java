package example;
public class Employee {

    
    int eid=1;
    String ename="sabya";
    double ebasic=120000;

    double enet;

    double epf=670;
    double premium=150;
    double totalDed;

    void calcDed() {
        totalDed=epf+premium;

    }

    void calNetSal() {
        enet=ebasic-totalDed;
    }

    void dispEmpDetails() {
        System.out.println("Employee id: "+ enet);
        System.out.println("Employee name: "+ ename);
        System.out.println(totalDed);
        System.out.println(enet);

    }


    public static void main(String[] args) {
        Employee e= new Employee();
        e.calcDed();
        e.calNetSal();
        e.dispEmpDetails();

    }

}