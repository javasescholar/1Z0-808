package oca.exam.ch01.defaultaccess.pkg2;

// trying to import class from different package which has package access, results in compilation error
import oca.exam.ch01.defaultaccess.pkg1.PackageAccess1;
public class PackageAccess2 extends PackageAccess1{
	// access of class with package access, which is declared in same package works just fine.
	PackageAccess3 pa3;
}
