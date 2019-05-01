package oca.exam.ch01.interfaces;

// class can implement any number of interfaces
public class Interfaces implements Bouncable{

	// since it's not declared with any access modifiers it's implicitly set as public abstract
	// this is the reason why we should mark bounce() method as public
	public void bounce() {
		// Implementation goes here
	}

	// since it's not declared with any access modifiers it's implicitly set as public abstract
	// this is the reason why we should mark bounce() method as public
	public void setBounceFactor(int bf) {
		// Implementation goes here
	}
	
	// look for some more example on interfaces
	Bouncable2 b2;
	// look for some more example on interfaces
	Bouncable2 b3;
	
}

interface Bouncable {
	
	// this is implicitly converted by compiler to public abstract void bounce()
	void bounce();
	
	// this is implicitly converted by compiler to public abstract void setBounceFactor(int bf)
	void setBounceFactor(int bf);
	
}

interface Bouncable2 {
	// legal but not needed since it's implicitly added by the compiler
	abstract void bounce2();

	// legal but not needed since it's implicitly added by the compiler
	public abstract void bounce3();

	// legal but not needed since it's implicitly added by the compiler
	abstract public void bounce4();

}

// interfaces are abstract by default, so no need to mark them explicitly
abstract interface Bouncable3 {
	// interface methods are by default abstract, marking them as final would result in
	// "abstract final" and what sense does that make: must implement and cannot implement :)
	final void bounce5();

	// interface methods are by default private, marking them as private would result in 
	// "public private", haha no sense there either
	private void bounce6();
	
	// idiot, se above, "public protected" :)
	protected void bounce7();
}

