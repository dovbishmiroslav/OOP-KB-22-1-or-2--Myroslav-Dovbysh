public class task3Test {
    public static void main(String[] args) {
        Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        System.out.println("Площа: " + t.area());
        System.out.println("Центроїд: " + t.centroid());
    }
}

