package example;

import java.util.Scanner;

;


 
     class P1{
    	 void details() {
    	 System.out.println("the persons name is :");
    	 System.out.println("the persons age is :");
    	 System.out.println("the persons phone number is :");
    	 System.out.println("the persons parent is :");
         System.out.println("the persons id is :");
    	 }	 
     }	
     class Student extends Person{
    	 void details() {
    	 System.out.println("the persons name is : Anusha");
    	 System.out.println("the persons age is : 22");
    	 System.out.println("the persons phone number is : 7896756445");
    	 System.out.println("the persons parent is : Louis Mathias");
    	 System.out.println("the persons id is : 124");
    	 }
		
	}
     class Emp extends Person{
    	 void details() {
    		 System.out.println("the persons name is : Sharon");
        	 System.out.println("the persons age is : 27");
        	 System.out.println("the persons phone number is : 9989635228");
        	 System.out.println("the persons parent is : Sandya");
        	 System.out.println("the persons id is : 134");
    	 }
     }
     class Person{
    	 public static void main(String[]args) {
    		 Scanner sc=new Scanner(System.in);
    		 System.out.println("Enter Student or employee :");
    		 String n=sc.nextLine();
    		 Emp e = new Emp();
    		 Student s= new Student();
    		 if(n.equals("Student"))
    		 {
    			 
     	        s.details();
     	       
     	       
    		 }
    		 else {
    			 e.details();
    		 }
    	        
     }
    	 
     }
     
