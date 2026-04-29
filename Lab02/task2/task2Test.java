public class task2Test {
    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(0, 0), new Point(2, 2));
        Segment s2 = new Segment(new Point(0, 2), new Point(2, 0));
        Point inter = s1.intersection(s2);
        System.out.println("Довжина s1: " + s1.length());
        System.out.println("Середина s1: " + s1.middle());
        System.out.println("Перетин: " + inter);
    }
}   

