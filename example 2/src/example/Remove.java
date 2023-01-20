package example;
import java.util.Arrays;
public class Remove {
	
	
	 
	public static void main(String[] args) {
	   int[] my_array = {11,30,45,35,55,24,67,99};
	   
	   System.out.println("Original Array : "+Arrays.toString(my_array));     
	   
	 
	   int removeArrayElement = 3;

	   for(int i = removeArrayElement; i < my_array.length -1; i++){
	        my_array[i] = my_array[i + 1];
	      }
	   System.out.println("After removing the element:");
	for(int i=0;i<my_array.length-1;i++)
		
	{
		System.out.print(my_array[i]+" ");
	}
		
	   
	 }
	 }

