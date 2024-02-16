import java.awt.*;

public class MeF4 {
    public static void main(String[] args) {
        String stri1 = new String("hello");
        String stri2 = new String("hello");

        System.out.println(stri1.equals(stri2)); //compare the content

        Point point1 = new Point(1, 2); // new for creating of new object
        Point point2 = new Point(1,2);

        System.out.println(point1.equals(point2)); // compare the content not adree
    }
}
