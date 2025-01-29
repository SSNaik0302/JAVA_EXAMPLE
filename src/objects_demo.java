
public class objects_demo {

	//class variables
	int stud_id;
	String stud_name;
	String stud_course;
	int stud_fees;
	
	//class method 
	public void display() {
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(stud_course);
		System.out.println(stud_fees);
	}
	
	public static void main(String[] args) {	
		objects_demo o1 = new objects_demo();
		o1.stud_id = 101;
		o1.stud_name = "sahil";
		o1.stud_course = "CS";
		o1.stud_fees = 10000;
		o1.display();
	}
}
