package oca.exam.ch01.accesscontrol.pkg1;

import oca.exam.ch01.accesscontrol.pkg2.ClassB;

public class PublicMemberAccess extends ClassA{

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		//access to public method invoking a method using a reference of the class 
		System.out.println(cb.coolMethod());
		
		// instantiate this class witch is subclass of ClassA
		PublicMemberAccess ma = new PublicMemberAccess();
		ma.someMethod();
		
		//call inherited method from another class
		CanICallCoolMethodInA cica = new CanICallCoolMethodInA();
		cica.letsSee();
	}
	
	public void someMethod() {
		// since we are subclass of ClassA, we inherit it's accessible methods and can invoke it
		System.out.println(this.coolMethod());
		// same as above, just note that we can call inherited member even without having to preface it with a reference
		System.out.println(coolMethod());
	}
	
}

class CanICallCoolMethodInA{
	public void letsSee() {
		PublicMemberAccess ma = new PublicMemberAccess();
		// since coolMethod() in ClassA is inherited in MethodAccess class, we can call it like this
		ma.coolMethod();
	}
}

