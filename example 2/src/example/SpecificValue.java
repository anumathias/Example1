package example;



public class SpecificValue {
	   public static void main(String args[]){
	      int[] myArray = {342, 67, 39, 10};
	      int num = 66;
	      int v=0;
	      for(int i = 0; i<myArray.length; i++){
	         if(num == myArray[i]){
	            v=1;
	         }
	      } 
	        	if(v==1) {
	        		System.out.println("Array contains the element");
	        		
	        	}
	        	else {
	        		System.out.println("Array doesnot contain the element");
	        	}
	         
	      }
	   }
	
	