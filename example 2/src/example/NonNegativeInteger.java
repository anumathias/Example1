package example;

/**
 * @author AnushaLilyMathias
 *
 */
public class NonNegativeInteger {
	 /**
	 * @param arr
	 * @param n
	 */
	/**
	 * @param arr
	 * @param n
	 */
	static void findPair(int arr[], int n)
	    {
	     
	       
	        if (n < 2)
	        {
	            System.out.print("-1");
	            return;
	        }
	     
	        int i, first, second;
	        first = second = -1;
	     
	        
	        for (i = 0; i < n; i++)
	        {
	            if (arr[i] > first)
	            {
	                second = first;
	                first = arr[i];
	            }
	            else if (arr[i] > second)
	            {
	                second = arr[i];
	            }
	        }
	     
	        System.out.println("n = " + first +
	                           " and r = " + second);
	    }
	     
	    
	    /**
	     * @param args
	     */
	    public static void main(String args[])
	    {
	        int arr[] = { 9, 11, 6, 7, 3, 55, 8, 10 };
	        int n = arr.length;
	     
	        findPair(arr, n);
	    }
	}
	 
	

