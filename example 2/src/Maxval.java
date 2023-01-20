import java.util.Scanner;

public class Maxval {
	 
	  public static void main(String[] args) 
	  {
	        
		    Scanner sc= new Scanner(System.in);
	        System.out.println("Enter size of the array:");
	        int n=sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter array values: ");
	        for(int i=0;i<n;i++) {
	            a[i]=sc.nextInt();
	        }
	        int max=a[0];

	        for(int i=0;i<n;i++) {
	            if(a[i]>max)
	                max=a[i];
	        }

	        System.out.println("Max element is: " +max);

	    }
}
