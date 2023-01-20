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

	    public Employee(int eid, String ename, double ebasic) {
	        super();
	        this.eid = eid;
	        this.ename = ename;
	        this.ebasic = ebasic;
	    }

public static void main(String[] args) {

    
    Employee e[]= new Employee[5];
    e[0]=new Employee(11,"Vamshi",5000);
    e[1]=new Employee(12,"Jessi",400000);
    e[2]=new Employee(13,"Suzan",50000);
    e[3]=new Employee(14,"Jerusha",70000);
    e[4]=new Employee(15,"Sandeep",3000);
    for( Employee k: e) {
        if(k.ebasic>5000) {
            System.out.println(k.ename);
        }
    }


}

} 


