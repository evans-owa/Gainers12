import java.awt.*;
import java.util.Arrays;

public class MeF3 {
    public static void main(String[] args) {
        // comparing arrays

        int[] ageCompare = {4, 5, 5, 6, 8, 7, 5, -1};
        int[] ageCompare1 = {4, 5, 5, 6, 8, 7, 5, -1};
        int[] ageCompare2 = {7, 3, 6, 0, 1, 4, 6, 1};

        System.out.println( Arrays.equals(ageCompare, ageCompare1)); // true
        System.out.println(Arrays.equals(ageCompare1, ageCompare2)); // false


        //for stings
        String[] String  = {"g", "re", "te", "que"};
        String[] String1  = {"g", "re", "te", "que"};
        String[] String2 = {"me", "bakeshop", "markos"};

        System.out.println(Arrays.equals(String,String1));
        System.out.println(Arrays.equals(String1, String2));

        Point[] point = {new Point(1, 2), new Point(1,2)};
        Point[] point1 = {new Point(1, 2), new Point(1,2)};
        Point[] point2 = {new Point(3,5), new Point(4,5)};

        System.out.println(Arrays.equals(point,point1));
        System.out.println(Arrays.equals(point1, point2)); // compare contex

        }
    }
