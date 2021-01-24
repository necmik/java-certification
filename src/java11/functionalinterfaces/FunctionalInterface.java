package java11.functionalinterfaces;

interface Doable {
	void doIt();
}

public class FunctionalInterface {

	private interface Shapeable {
		void shapeIt();
	}
	
	public static void main(String[] args) {
		Doable d = new Doable() {
			@Override
			public void doIt() {
				System.out.println("Anonymous class invoking doIt()");
				
			}
		};
		//Lambda expression
		Doable d2 = () -> System.out.println("Lambda Expression invoking doIt()");
		
		Shapeable s = new Shapeable() {
			
			@Override
			public void shapeIt() {
				System.out.println("Anonymous class invoking shapeIt()");
				
			}
		};
		
		//Lambda expression
		Shapeable s2 = () -> System.out.println("Lambda Expression invoking shapeIt()");
		
		doItWithDoable(d);
		doItWithShapeable(s);
		
		doItWithDoable(d2);
		doItWithShapeable(s2);
	}
	
	private static void doItWithDoable(Doable d) {
		System.out.println("doItWithDoable executes d.doIt()");
		d.doIt();
	}
	
	private static void doItWithShapeable(Shapeable s) {
		System.out.println("doItWithShapeable executes s.shapeIt()");
		s.shapeIt();
	}
}
