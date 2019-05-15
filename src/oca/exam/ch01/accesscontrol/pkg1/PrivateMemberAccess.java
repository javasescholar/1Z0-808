package oca.exam.ch01.accesscontrol.pkg1;

import oca.exam.ch01.accesscontrol.pkg2.ClassB;

public class PrivateMemberAccess extends ClassA{

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		//access to private method invoking a method using a reference of the class is not possible 
		System.out.println(cb.coolMethod2());
		
		// instantiate this class witch is subclass of ClassA
		PrivateMemberAccess ma = new PrivateMemberAccess();
		ma.someMethod();
		
		//call inherited method from another class
		CanICallCoolMethodInA cica = new CanICallCoolMethodInA();
		cica.letsSee();
	}
	
	public void someMethod() {
		// we are subclass of ClassA, but cannot inherit it'private members
		System.out.println(this.coolMethod2());
		// same as above
		System.out.println(coolMethod2());
	}
	
}

class CanICallCoolMethodInA{
	public void letsSee() {
		PrivateMemberAccess ma = new PrivateMemberAccess();
		// we are trying to call method on PrivateMemberAccess witch don't exist, since coolMethod2 is not inherited from ClassB cause it's
		// marked with private access modifier.
		ma.coolMethod2();
	}
}

