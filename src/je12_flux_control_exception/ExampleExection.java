package je12_flux_control_exception;

public class ExampleExection {
    public static void main(String[] args) {
        Double value = Double.valueOf("1.75");
        try {
            System.out.println(value);
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number...");
        }
    }

    /*
    Formas de tratamento de excecssões

    try {
       Number valor = NumberFormat.getInstance().parse("a1.75");
       Double vd = valor.doubleValue();
       System.out.println(vd);
    } catch (ParseExpection e) {
        System.err.println("Invalid Number...")
    }

    Double.valueOf()
    * */

}
