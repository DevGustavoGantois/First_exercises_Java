package je10_FlowControl_Conditional;

public class FlowControlTernaries {
    public static void main(String[] args) {
        int note = 7;
        String result = note >=7 ? "Approved" : note>=5 && note < 7 ? "Falied" : "";
        System.out.println(result);
    }

    static void FlowIntermediate() {
        System.out.println("Recuperation");
        System.out.println("Study a little more.");
    }
}
