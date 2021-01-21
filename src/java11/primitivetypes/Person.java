package java11.primitivetypes;

public class Person {
    static String name = "UNKNOWN";  // Class Variable
    String instanceName = "UNKNOWN"; // Instance Variable;
    String age = "25";  // Instance Variable initialized;

    // No Args Constructor
    public Person() {

    }

    // Single Parameter Constructor.
    public Person(String age) {
        // Constructors are perfect examples of how a method parameter
        // name can have same name as class or instance variable name.

        // In this constructor,  the Person instance age does not get
        // set at all, because age not qualified by 'this'.
        // This is a common mistake and may be tested on exam
        age = age;
    }

    // Two Args Constructor
    public Person(String name, String age) {
        // constructor parameters are named and typed the same as the
        // class variable 'name' and the instance variable 'age'

        // Correctly setting object's age using 'this' qualifier
        this.age = age;

        // instanceName is an instance variable and has different
        // name from the parameter which will be assigned to it, so
        // this not required, but good practice to use it

        // Also setting static variable name in same assignment
        // statement
        this.instanceName = Person.name = name;
    }
    // Simple setter for age
    public void setAge(String age) {
        // method sets instance variable age to the parameter passed.
        this.age = age;
    }

    // Simple setter for instanceName
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

	@Override
	public String toString() {
		return "Person [instanceName=" + instanceName + ", age=" + age + ", Person.name="+ Person.name + "]";
	}
    
    
}
