package Work;
public abstract class Operetion {
    protected int firstArg;
    protected int secondArg;
    public Operetion(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }
    public abstract int perform();
}
