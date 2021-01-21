package java11.inheritance;

//Implicit super constructor myClass() is not visible for default constructor. Must define an explicit constructor
/*
public class ExtendPrivateConstructor extends myClass{

}
*/

public class ExtendPrivateConstructor {
	
}

class myClass {
	private myClass() {
		
	}
}
