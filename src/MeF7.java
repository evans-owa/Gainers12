import java.util.Arrays;

public class MeF7 {
    public static void main(String[] args) {

        //searching a number in an array
        int[] number = {5, 2, 6, 1, 3, 9, 4, - 1};
        Arrays.sort(number);

        System.out.print("it exist in index : ");
        System.out.println(Arrays.binarySearch(number,5));

//        System.out.print("Gives the -1 index because the element is not available :");
//        System.out.println(Arrays.binarySearch(number, -7)); //-1 index

        for (int i = 0; i<=number.length-1; i++)
            System.out.print(number[i] + " ");

        System.out.println();

        String[] name = {"evans","owino", "amrkos","keilo"};
        Arrays.sort(name);

        System.out.print("name is at index: ");
        System.out.println(Arrays.binarySearch(name, "evans"));

        for (int i =0; i<= name.length-1; i++)
            System.out.print(name[i] + " ");
    }
}
