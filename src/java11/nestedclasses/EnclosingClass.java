package java11.nestedclasses;

public class EnclosingClass {
	
	String outerName = "outerName";
	
	static String outerStaticName = "outerStaticName";
	
	private int num  =10;
	
	public void accessInner() {
		System.out.println(InnerMemberClass.constant);
	}
	
	public static class NestedStaticClass {
		public static String staticName = "NestedStaticClass.staticName";
		
		public String instanceName = "NestedStaticClass.instanceName";
		
		public static String getStaticName() {
			return "getStaticName()" + NestedStaticClass.staticName;
 		}
		
		public String getInstanceName() {
			System.out.println(outerStaticName);
			//System.out.println(outerName); Cannot make a static reference to the non-static field outerName
			return "getInstanceName() = " + this.instanceName;
		}
	}
	
	public class InnerMemberClass {
		
		/* The method doSomething cannot be declared static; static methods can only be declared in a static or top level type
		public static void doSomething() {
			
		}
		*/
		
		public static final int constant = 50;
		
		public void printNum() {
			EnclosingClass.this.num = 15;
			System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(EnclosingClass.NestedStaticClass.getStaticName());
		
		EnclosingClass ec = new EnclosingClass();
		NestedStaticClass nc = new EnclosingClass.NestedStaticClass();
		nc.getInstanceName();
		
		EnclosingClass.InnerMemberClass ic = new EnclosingClass().new InnerMemberClass();
		EnclosingClass.InnerMemberClass ic2 = ec.new InnerMemberClass();
		ic2.printNum();
	}

}
