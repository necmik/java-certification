package java11.nestedclasses;

public class LocalClassExample {
	
	private void methodWithLocalClass() {
		
		class LocalClass {
			String name;
			
			LocalClass(String name) {
				this.name = name;
			}
			
			void performSomeAction() {
				System.out.println("LocalClass.name = " + name);
			}
		}
		
		LocalClass jeff = new LocalClass("Jeff");
		LocalClass martha = new LocalClass("martha");
		LocalClass bob = new LocalClass("bob");
		
		jeff.performSomeAction();
		martha.performSomeAction();
		bob.performSomeAction();
		
		System.out.println("Bob's name is: " + bob.name);
	}
	
	public static void main(String[] args) {
		new LocalClassExample().methodWithLocalClass();
	}

}
