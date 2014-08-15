
public class largest_prime_factor
{
    public static void main(String []args)
    {
         long number=600851475143L;    
         System.out.println(largestfactor(number));
    }
    public static long largestfactor(long n)
    {
           long largest_factor=0;
           for(long i=3;i<n;i+=2)
           {
               if (n%i == 0)
               {
                   for(long j=1;j<i;j+=2)
                   {
                       if (i%j == 0)
                       {
                           continue;
                       }
                   }
                   largest_factor = i;

               }
           }
           return largest_factor;
    }         
}
