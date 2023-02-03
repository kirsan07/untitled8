package Work;
public class Multiplication extends Operetion{
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg,secondArg);
    }
    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}
