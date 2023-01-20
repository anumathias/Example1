package example;

public class Strlen {
	public static void main(String[] args) {
        String s = "this is a demo program it helps to get the concept";
        System.out.println("Starts with i: ");
        for( String p : s.split(" "))
            if(p.startsWith("i"))
                System.out.println(p);
        System.out.println("Length of words is 2: ");
        for( String c : s.split(" "))
            if(c.length() == 2)
                System.out.println(c);


    }
}
