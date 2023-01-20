
public class Moon {
	double moonweight;
	double earthweight=9.81;
		double manweight=56;
	

	
		public Moon() {
			
			}
		void gravity() {
			moonweight=((manweight/earthweight))*1.622;
			System.out.println("moonweight:"+moonweight);
		}
			void dispDetails() {
				System.out.println("earthweight:"+earthweight);
				
				System.out.println("manweight:"+manweight);
				
				
			}
		
		public static void main(String args[]) {
			Moon m= new Moon();
		    m.dispDetails();
		    m.gravity();
		
			
			
		}

		
		
	}
	
 
 
	
