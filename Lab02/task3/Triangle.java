public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (!isTriangle(a, b, c)) {
            throw new IllegalArgumentException("Точки не утворюють невироджений трикутник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isTriangle(Point a, Point b, Point c) {
        double side1 = sideLength(a, b);
        double side2 = sideLength(b, c);
        double side3 = sideLength(c, a);
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    private double sideLength(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double area() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) +
                         b.getX() * (c.getY() - a.getY()) +
                         c.getX() * (a.getY() - b.getY())) / 2.0);
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }
}