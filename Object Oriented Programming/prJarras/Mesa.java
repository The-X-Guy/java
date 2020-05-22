public class Mesa {
    protected Jarra j1;
    protected Jarra j2;

    public Mesa (int j1, int j2) {
        this.j1 = new Jarra(j1);
        this.j2 = new Jarra(j2);
    }

    public String toString () {
        return "\nJarra 1: " + this.j1 + "\nJarra 2: " + this.j2;
    }
}