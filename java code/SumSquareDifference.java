
public class sum_square_difference
{
    public static void main(String []args)
    {
        int[] array1 = new int[100];
        for(int i = 1; i<=100; i++){
            array1[i-1]=i;
        }
        long sumsquare = sumsquare(array1);
        long squaresum = squaresum(array1);
        System.out.println(squaresum-sumsquare);
    }
    public static long sumsquare(int[] array)
    {
        long sumsquare = 0L;
        for(int j=0;j<array.length;j++){
            sumsquare += Math.pow(array[j],2);
        }    
        return sumsquare;
    }
    public static long squaresum(int[] array)
    {
        double squaresum = 0L;
        for(int k=0;k<array.length;k++)
        {
            squaresum += array[k];
        }
        return (long)Math.pow(squaresum,2);
    }    
}
