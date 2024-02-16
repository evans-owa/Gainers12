public class MeF2 {
    public static void main(String[] args) {
        double[] minAges = new double[20];
        minAges[0] = 20.5;
        minAges[1] =30.6;
        minAges[3] =30.6;
        minAges[5] =30.6;
        minAges[19] =30.6;
//        System.out.println(minAges);

        for (int i=1; i<=minAges.length-1; i++)
            System.out.print(minAges[i] + " ");
    }

}
