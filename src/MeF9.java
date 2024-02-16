import java.util.Arrays;

public class MeF9 {
    public static void main(String[] args) {
        int[] number = {1,2};
        change(number); // changing numbers
        printArray(number); // displaying numbers
    }

    public static void change(int[] number){
        number[0] = 2;
        number[1] = 1;
    }
    public static void printArray(int[] number){
        for (int i = 0; i<=number.length-1; i++)
            System.out.print(number[i] + " ");
    }
}
