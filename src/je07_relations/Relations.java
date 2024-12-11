package je07_relations;

public class Relations {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;

        int ageIza = 1;
        boolean OfLegalAge = ageIza >= 18;
        //System.out.println("Iza is legal of age?" + OfLegalAge);
        System.out.println("Iza is legal of age?" + (OfLegalAge ? "Yes" : "No"));
        if(number1 > number2) {
            System.out.println("Number 1 is bigger than number 2 ");
        }

        if(number1 < number2) {
            System.out.println("Number 1 is smaller or equals number 2");
        }

        if(number1 >= number2) {
            System.out.println("Number 1 is bigger or equals number 2");
        }

        if(number1 <= number2) {
            System.out.println("Number 1 is smaller or equals number 2");
        }

        if (number1 != number2) {
            System.out.println("Number 1 is different from number 2");
        }


    }
}
