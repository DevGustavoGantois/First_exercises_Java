package je10_FlowControl_Conditional;

public class MeasurementSystem {
    public static void main(String[] args) {
        //Caso não tiver o break a sequencia será continuada para verificar t0dos os casos.
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("SMALL");
                break;
            }
            case "M": {
                System.out.println("MEDIUM");
                break;
            }
            case "B": {
                System.out.println("BIGGER");
                break;
            }
            default:
                System.out.println("UNDEFINED");
        }
    }
}
