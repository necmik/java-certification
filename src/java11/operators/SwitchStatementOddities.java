package java11.operators;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Switch Statements
Sub-Topic: Out of Ordinary
*/
 
public class SwitchStatementOddities {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";
        for (var i : bytes) {  // Using LVTI here
            switch (i * 10) {  // Use an Expression
                case 1000:
                case 1030:
                case 1040:
                case 1070: 
                    caseAssignedValue = "Less than 1100";
                    break; 
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }
    }
}