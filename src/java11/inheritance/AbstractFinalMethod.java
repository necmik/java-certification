package java11.inheritance;

public class AbstractFinalMethod extends AbstractC{

	@Override
	public void overrideMe() {
		// TODO Auto-generated method stub
		
	}
	
	private void privMethod() {
		super.finalMethod();
	}

}

abstract class AbstractC {
	public abstract void overrideMe();
	
	public final void finalMethod() {
		
	}
	
	private void privMethod() {
		
	}
}
