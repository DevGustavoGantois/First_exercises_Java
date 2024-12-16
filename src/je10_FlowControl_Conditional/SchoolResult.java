package je10_FlowControl_Conditional;

public class SchoolResult {
    public static void main(String[] args) {
        int note = 6;

        if(note >= 7) {
            System.out.println("Approved");
        } else if (note >= 5 && note < 7) {
            System.out.println("Recuperation");
        }
        else {
            System.out.println("Falied");
        }

    }
    static void IntermediateFlow() {
        System.out.println("Recuperation.");
        System.out.println("Study a little more.");
    }
}
