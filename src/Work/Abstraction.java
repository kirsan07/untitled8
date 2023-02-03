package Work;
public class Abstraction {
    public static void main(String[] args) {
        Addition addition = new Addition(9,7);
        System.out.println(addition.perform());
        Multiplication multiplication = new Multiplication(5,9);
        System.out.println(multiplication.perform());
    }
}
