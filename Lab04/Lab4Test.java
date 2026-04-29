public class Lab4Test {
    public static void main(String[] args) {

        Triangle t = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3)
        );

        Quadrilateral q = new Quadrilateral(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 3),
                new Point(0, 3)
        );

        Circle c = new Circle(new Point(0, 0), 5);

        System.out.println(t);
        System.out.println("Area: " + t.area());
        System.out.println("Centroid: " + t.centroid());

        System.out.println();

        System.out.println(q);
        System.out.println("Area: " + q.area());
        System.out.println("Centroid: " + q.centroid());

        System.out.println();

        System.out.println(c);
        System.out.println("Area: " + c.area());
        System.out.println("Centroid: " + c.centroid());
    }
}