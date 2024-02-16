import java.util.Scanner;

public class MeF11 {
    public static void main(String[] args) {
        int[] number = getFigure();
        printFigure(number);

        int [] figure = inputNumber();
        printInput(figure);
    }

    public static int[] getFigure(){
        return new int[] {3,4,2,5,6,3};
    }

    public static void printFigure(int[] number){
        for (int i=0; i<=number.length-1; i++)
            System.out.print(number[i] + " ");
    }

    public static int[] inputNumber(){
        Scanner num = new Scanner(System.in);
        int[] kwe = new int[]{num.nextInt()};
        return kwe;
    }
    public static void printInput(int[] insert){
        for (int i = 0; i<=insert.length-1; i++)
            System.out.print(insert[i]+ " ");
    }

}
