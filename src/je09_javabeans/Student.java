package je09_javabeans;

public class Student {
    private String name;
    private int age;

    // Getter para 'name'
    public String getName() {
        return name;
    }

    // Setter para 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter para 'age'
    public int getAge() {
        return age;
    }

    // Setter para 'age' com validação
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 150) {
            throw new IllegalArgumentException("Age value must be between 0 and 150.");
        }
        this.age = newAge;
    }
}

package je09_javabeans;

public class Objects {
    public static void main(String[] args) {
        Student gustavo = new Student(); // Nome da variável em camelCase
        gustavo.setName("Gustavo Gantois");
        gustavo.setAge(25); // Defina a idade como parâmetro
        System.out.println("Name: " + gustavo.getName());
        System.out.println("Age: " + gustavo.getAge());
    }
}
