package je11_FlowControl_Repetition;

public class ExampleFor {
    public static void main(String[] args) {
        for(int littleBear = 1; littleBear <= 20; littleBear++) {
            System.out.println(littleBear + "Little Bear(s).");

            String students[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
            for(int x=0; x<students.length; x++) {
                System.out.println("The student in index x=" + x + "is" + students);

                //For each
                for(String student: students) {
                    System.out.println(student);
                }
            }
        }
    }
}

//Outra forma que podemos fazer

/*
int litteBears = 1;
for(; littleBears <= 20; ) {
    System.out.println(littleBear + "Little Bear(s).");
    littleBear++;
}
* */