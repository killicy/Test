public class Stuff {
    public int y;
    public static int z = 5;

    public static int foo() {
        return z;
    }
    public int doubleIt(int x) {
        this.y = x * 2;
        return this.y;
    }
}
