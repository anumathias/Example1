package example;

public class StringBuilder {
	public static void main(String[] args) {
        StringBuffer b = new StringBuffer();
        StringBuffer c = new StringBuffer();
        b.append("123456");
        c.append("123456123456123456");
        System.out.println(b.capacity());
        System.out.println(c.capacity());

    }
}
