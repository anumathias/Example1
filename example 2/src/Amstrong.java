
public class Amstrong {

	public static void main(String[] args) {
		
		        int number = 567, Number, r, result = 0;

		        Number = number;

		        while (Number != 0)
		        {
		            r = Number % 10;
		            result= result+(r*r*r);
		            Number /= 10;
		        }

		        if(result == number)
		            System.out.println(number + " is an Armstrong number.");
		        else
		            System.out.println(number + " is not an Armstrong number.");

	}

}
