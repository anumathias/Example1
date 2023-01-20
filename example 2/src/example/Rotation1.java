package example;

import java.util.Scanner;

public class Rotation1 {

	     public static void main(String[] args) {
	            // TODO Auto-generated method stub
	            Scanner sc=new Scanner(System.in);
	            String s1=sc.nextLine();
	            String s2=sc.nextLine();
	            char[] array=s1.toCharArray();
	            int s1Len=s1.length();
	            char temp;
	            for(int i=0;i<2;i++) {
	                temp=array[0];
	                for(int j=0;j<s1Len-1;j++) {
	                    array[j]=array[j+1];
	                }
	                array[s1Len-1]=temp;
	            }
	            String r="";
	            for(char s:array) {
	                r=r+s;
	            }



	     
	      System.out.println(r.equals(s2));
	        }





	}

