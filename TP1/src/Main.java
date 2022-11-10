public class Main {
    public static void main(String[] args) {

        Point<Integer> point1 = new Point<Integer>();
        Point<Integer> point2 = new Point<Integer>(1, 2);
        Point<Integer> point3 = new Point<Integer>(1, 2);
        Point<Integer> point4 = new Point<Integer>(2, 1);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);

        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point3));
        System.out.println(point2.equals(point4));
    }
}