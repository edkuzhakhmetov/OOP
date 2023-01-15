public class Point3d extends Point {
    int z;

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x +
                ";" + y +
                ";" + z +
                '}';
    }
}
