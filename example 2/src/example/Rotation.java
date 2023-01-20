package example;
import java.util.*;
public class Rotation {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the number of rotations:");
        int d=s.nextInt();

        for(int k=0;k<d;k++) {
            int f=a[0];
        for(int j=0;j<n-1;j++)
        {
            a[j]=a[j+1];
        }
        a[n-1]=f;
        }
        System.out.println("Array after"+" "+d+" "+"rotations:");
        for(int t=0;t<n;t++) {
            System.out.println(a[t]);
        }
    }

}

