public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Point point1 = new Point(3,2);
        Point point2 = new Point(3,2);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        System.out.println(point1.equals(point2));
        
    }
}
