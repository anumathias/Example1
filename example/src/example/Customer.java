package example;

public class Customer {
	int cid;
	String cname;
	double cdiscount=3;
	double cbill;
	double camount=1000;
	double cdisc,v;
	double cfbill;

	public Customer(int cid, String cname, double cdiscount, double cbill, double camount, double cdisc, double cfbill, double v) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cdiscount = cdiscount;
		this.cbill = cbill;
		this.camount = camount;
		this.cdisc = cdisc;
		this.cfbill = cfbill;
		this.v = v;
	}
     
    	
    	  public Customer() {
   
    	       
    	    }
    	    void calcDisc() {
    	    	
    	        v= (cdiscount/100)*camount;
    	

	}
    	    void finalBill() {
    	    	 cfbill=camount-v;
    	         System.out.println("customer  final bill="+cfbill);
    	         
    	    }

     void dispDetails()
     {
    	System.out.println("Customer Details");
 		System.out.println("customer id: " + 201);;
 		System.out.println("customer name="+"Anusha");
 		System.out.println("customer discount="+3);
 		//System.out.println("customer total  bill="+2000);
 		System.out.println("customer  amount="+10000);
 		calcDisc();
 		finalBill();
 		
 		
     }
	public static void main(String[] args) {
		Customer c= new Customer();
        c.dispDetails();
       

	}
}
