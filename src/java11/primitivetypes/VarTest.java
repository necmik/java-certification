package java11.primitivetypes;

public class VarTest {
    public static void main(String[] args) {
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);
        
        var myFloat = 11.5f;
        System.out.println(myFloat);
        
        //var myArray = {"A", "B"};
    }
}