package oca.java.se8.programmer1.module02;

/**
 * Java execution model
 * ----------------------------------------
 * Compiled language - source code is compiled using compilers into machine code that executes directly on the target CPU.
 * Interpreted language - source code is interpreted by interpreters, and generally they are reading the source code at execution time.
 *
 * Java source code is compiled only once into platform independent Java byte code which is not specific to a particular processor or operating system.
 * That byte code can be interpreted on any platform that has a compliant Java virtual machine, and it's much more efficient than simple interpretation of textual source code would be.
 * Byte code is than executed by JVM (simulated machine) - a program that simulates what a real piece of CPU hardware does.
 * JVM performs byte code optimization e.g. frequently executed code regions (hot spots) JVM can convert from platform-independent byte code into native machine code for the host CPU.
 *
 * Threading and garbage collection
 * ----------------------------------------
 * Java was born with a platform independent threading model, and primitives to control it, built into the language from the start.
 *
 * Multi-threaded common issues can arise in cases when two threads share a variable - those bugs will typically be non-deterministic, i.e. not be able to reproduce problem repeatedly.
 * Common way to avoid those problems is creating programs that share only immutable data (data that cannot be changed), which if done correctly, don't suffer from these problems.
 *
 * Heap is the term used to refer to the general area of memory available for allocation used by programs.
 * Coupling means that changes in one part of the system require changes in another part.
 * The garbage collector, i.e. GC takes most of the responsibility for releasing memory and creates a simple, easy-to-use model for the programmer.
 * GC collector is run periodically determines what part of memory is no longer used by any part of the program and reclaimes it back to the heap.
 *
 * Object orientation and encapsulation
 * ----------------------------------------
 * Java is object-oriented.
 * Limit the consequences of change. Ideally, any change we make should involve modifying a single source code unit.
 * Encapsulation - all the variables that represent the object's state will be private. Encapsulation allows the state of the object, its variables, to be visible outside the class only indirectly through methods.
 */
public class Features {
}
