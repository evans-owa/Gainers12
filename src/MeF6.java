import java.util.Arrays;

public class MeF6 {
    public static void main(String[] args) {
        int[] kiny = {4,51,62,3,6,5,2,54,-1,20};
        Arrays.sort(kiny, 4,7);

        for (int i = kiny[0]; i<=kiny.length-1; i++ )
            System.out.print(kiny[i] + " ");

        System.out.println(); //

//        sorting strings
        String[] stir = {"evans", "mark", "dhiamo", "mumo", "adaid"};
        Arrays.sort(stir);

        for (int i = 0; i<=stir.length-1; i++)
            System.out.print(stir[i] + " ");
    }
}
