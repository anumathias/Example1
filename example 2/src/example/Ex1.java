package example;

public class Ex1 {

	public static void main(String[] args) {
	        int a[]= {10,20,30};
	        System.out.println("General loop");
	        for(int i=0;i<a.length;i++) {
	            System.out.println(a[i]);
	        }
	        System.out.println("Enhanced loop:");
	        for(int v: a)
	            System.out.println(v);

	    }

	}


