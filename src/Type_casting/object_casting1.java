package Type_casting;

class animal {
	
	void m1() {
		System.out.println("this is m1");
	}
}

class dog extends animal{
	void m2() {
		System.out.println("this is m2");
	}
}

class cat extends dog{
	void m3() {
		System.out.println("this is m3");
	}
}

//animal -- dog -- cat 




public class object_casting1 {
	
	public static void main(String[] args) {
		
		//no casting 
		cat c = new cat();
		c.m1();
		c.m2();
		c.m3();
		
		
		System.out.println("-------------------------------");
		
	//  parent     child
		dog dg = new cat();
		cat ct = (cat) dg;
		ct.m1();
		ct.m2();
		ct.m3();
		
		System.out.println("-------------------------------");
		//build-in object 
		
		Object o= new String("sahil");
		String s = (String) o;
		/*a    b       c    d
		 * rule 1: c & d should have some relationship as object is parent of all class so this rule -- passed 
		 * rule 2: a & c should have same or parent-child relationship so in this case it is same so this rule -- passed
		 * rule 3: underlying object of d should be equal or child to c in this case it is same so this rule -- passed 
		 * */
		
		System.out.println(s);
		
	}

}
