public class MeF1 {
    public static void main(String[] args) {
        printPrimeNumber(23,50);

        isGreeting();
        isGreetings(" get out and play");
    }

    public static boolean isPrime(int x){
        for (int i= 2; i <= x/2; i++ )
            if (x % i == 0 )
                return false;
        return true;
    }

    public static void printPrimeNumber(int v, int q) {
        for (int j = v; j <= q; j++)
            if (isPrime(j))
                System.out.println(j + "");
    }


    // method overloading
    public static void isGreeting(){
        System.out.print("morning mum ");
    }

    public static void isGreetings(String j ){
        System.out.print("markos" + j);
    }
}
