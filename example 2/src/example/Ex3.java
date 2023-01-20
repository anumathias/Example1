package example;

public class Ex3 {
	public static void main(String[] args) {
        int b[][][]= {{{10,20,30},{23,45,67}},{{15,16,29}},{{22,66}}};
        System.out.println("General loop");
        for(int i=0;i<b.length;i++) {
            for(int j=0;j<b.length;j++)
            for(int k=0;k<b.length;k++){
            System.out.println(b[i][j][k]);
        }
        }
        System.out.println("enhanced loop");
        for(int v[][]:b)
            for(int m[]:v)
                for(int c:m)
                    System.out.println(c);
	}
}
