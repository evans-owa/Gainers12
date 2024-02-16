import java.util.Arrays;

public class MeF5 {
    public static void main(String[] args) {
        // sorting arrAY
        int[] numbers = {4,5,2,52,5,2,-1};
        Arrays.sort(numbers);

        for (int i = 0; i<=numbers.length-1; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();
        char[] letter = {'w', 'e', 't', 'f', 't', 's', 'p', 'A', 'G','J'};
        Arrays.sort(letter);

        for (int i = 0; i <= letter.length-1; i++)
            System.out.print(letter[i] + " ");
    }
}
