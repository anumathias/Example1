package example;


	class Banks {
	    void Amount() {
	        System.out.println("Car amount is 500000");
	    }
	} 

	class Hdfc extends Banks{
	    void Amount() {
	        System.out.println("Phone Amount at HDFC is 22000");
	    }
	}

	class Icici extends Banks{
	    void Amount() {
	        System.out.println("Phone Amount at ICICI is 25000");
	    }
	}

	public class Bank
	{

	       public static void main(String args[]) {
	           Hdfc h= new Hdfc();
	           h.Amount();
	           Icici i= new Icici();
	           i.Amount();
	       }

	}

