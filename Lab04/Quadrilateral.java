public class Quadrilateral extends Figure {
    private Point A, B, C, D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;

        if (area() == 0) {
            throw new IllegalArgumentException("Quadrilateral is degenerate");
        }
    }

    @Override
    public double area() {
        // розбиваємо на 2 трикутники
        Triangle t1 = new Triangle(A, B, C);
        Triangle t2 = new Triangle(A, C, D);
        return t1.area() + t2.area();
    }

    @Override
    public Point centroid() {
        // середнє по вершинах (спрощено, зазвичай приймають)
        double x = (A.getX() + B.getX() + C.getX() + D.getX()) / 4;
        double y = (A.getY() + B.getY() + C.getY() + D.getY()) / 4;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + A + " B" + B + " C" + C + " D" + D + "]";
    }
}