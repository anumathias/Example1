package example;

public class Ex2 {


	public static void main(String[] args) {
        int b[] []= {{10,20,30},{23,45,67}};
        System.out.println("General loop");
        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b.length;j++) {
            System.out.println(b[i][j]);
        }
        }
        System.out.println("Enhanced loop:");
        for(int v[]: b)
            for(int k:v)
            System.out.println(k);

	}
}
