package example;

public class Equals
{public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String("Hello");
    String s3 = "Hello";
    System.out.println((s1==s2));
    System.out.println(s1.equals(s3));

}
}
