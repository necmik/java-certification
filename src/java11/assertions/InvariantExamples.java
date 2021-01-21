package java11.assertions;

public class InvariantExamples {
	
	private enum PetType {
		DOG, CAT, HAMSTER, GERBIL, PARROT
	}
	
	public static void main(String[] args) {
		InvariantExamples ie = new InvariantExamples();
		for (PetType petType : PetType.values()) {
			System.out.println(ie.getPetTypeDietartyNeeds(petType));
		}
		
		for (int i=0; i<10; i=i++) {
			i+=1;
			System.out.println("AA");
		}
		
	}
	
	private String getPetTypeDietartyNeeds(PetType petType) {
		switch(petType) {
			case DOG: return "Dog...";
			case CAT: return "CAT...";
			case HAMSTER: return "HAMSTER...";
			case GERBIL: return "GERBIL...";
			default: assert false: "Formulary does not exist for " + petType;
		}
		
		return null;
	}
	
	private void throwEx() throws Exception {
		
	}
}
