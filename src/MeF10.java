import java.awt.*;

public class MeF10 {
    public static void main(String[] args) {
        //array reference in methods
        Point pay = getPoint(); // access the points form the getPoint method
        System.out.println(pay);
    }

    public static Point getPoint() {
        return new Point(1,3); // initialize the points
    }
}
