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
	Bouncable3 b3;
	// look for some more example on interfaces
	Bouncable4 b4;
	// look for some more example on interfaces
	Bouncable5 b5;
	// look for some more example on interfaces
	Bouncable6 b6;
	
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

// examples of interface constants
// every interface variable must be public static final
interface Bouncable4 {
	// static final added implicitly
	public int i1 = 1;
	
	// public static final added implicitly
	int i2 = 2;
	
	// public final added implicitly
	static int i3 = 3;
	
	// public static added implicitly
	final int i4 = 4;
	
	// static added implicitly
	public final int i5 = 5;
	
	// public added implicitly
	static final int i6 = 6;
	
	// all modifiers are added explicitly
	public static final int i7 = 7;
	
	// public static final are added implicitly
	int i8 = 8;
}

//examples of interface default methods
interface Bouncable5 {
	
	// default method must have implementation, and is implicitly public
	default int i1() {return 1;}
	
	// you don't need to mark default method public explicitly, it's done by Java compiler
	public default int i2() {return 2;}
	
	// default interface methods cannot be marked with static,strictfp,final,abstract 
	static default int i3(){return 3;}
	
	// default interface methods must have body
	default int i4();
}

//examples of interface static methods
interface Bouncable6 {

	// static method must have implementation, and is implicitly public
	static int i1() {return 1;}
	
	// you don't need to mark static method public explicitly, it's done by Java compiler
	public static void i2(){}

	// static interface methods cannot be marked as default,strictfp,final,abstract
	final static void i3(){}
	
	// static interface methods must have body
	static int i4();

	
}