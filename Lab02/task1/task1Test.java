public class task1Test {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        Point intersectionPoint = line1.intersection(line2);
        System.out.println(intersectionPoint);
    }
}