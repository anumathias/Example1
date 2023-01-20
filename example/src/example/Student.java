package example;

public class Student {
	
	String sid;
	String sname;
	int smarks=90;
	String sbranch;
	String sgrade;

	
	public Student(String sid, String sname, String sbranch) {
		super();
		this.sid = sid;
		this.sname = sname;
		
		this.sbranch = sbranch;
	}
	void calGrade()
	{
		if(smarks>80) {
            this.sgrade="A";
        }
		else if((smarks<60)&&(smarks>40)) {
            this.sgrade="B";
        }
        else{
            this.sgrade="C";
        }
		}
//		
	
	
	void dispStdDetails()
	{
		System.out.println("Student Details");
		System.out.println("student student id="+sid);
		System.out.println("student name="+sname);
		System.out.println("students marks="+smarks);
		System.out.println("student branch="+sbranch);
		System.out.println("student grade="+this.sgrade);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("111","Samarthya","C");
        s1.calGrade();
        s1.dispStdDetails();

	}
	
			
}

