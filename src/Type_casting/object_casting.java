package Type_casting;

//parent class 
class Parent {
	
	void m1() {
		System.out.println("this is m1");
	}
	
}

//child class 
class child extends Parent{
	
	void m2()
	{
		System.out.println("this is m2");
	}
}




public class object_casting {
	
	public static void main(String[] args) {
		
		
		//normal scenario 
		//create object of child class and access all no casting done 
//		child c = new child();
//		c.m1();
//		c.m2();
		
		//upcasting scenario 
		//for above example parent is larger class and child is smaller 
		//it is done automatically
//		Parent p = new child();
//		p.m1();
//		//p.m2(); //not accessible as we have created reference variable of Parent class and accessing the child methods 
		
		
		//downcasting sceenario 
		//for above we have parent as larger and child as smaller 
		//it is to be done manually 
//		Parent p1 = new Parent();
//		child c1 = (child)p1;   
//		c1.m1();
//		c1.m2();  //it is also throwing exception 
		
		Parent p1= new child();
		child c1 = (child) p1;
	//	a     b       c     d
		/*
		 * Rule-1 : conversion is valid or not means type c & d must have some relationship[parent-child or child-parent]
		 * Rule-2 : assignment is valid or not means c should be same as a or a should be parent of c 
		 * Rule-3 : underlying object of d should be equal or parent of c class 
		 * i.e p1 underlying object means new child() should be equal to c or parent of c
		 * */
		c1.m1();
		c1.m2();
		
		
	}

}
