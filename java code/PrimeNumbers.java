import java.util.*;

public class PrimeNumbers
{
    public static void main(String []args)
    {
        ArrayList<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        int test = 3;
        int count = 1;
        while (prime.size()<=10001)
        {
            boolean isPrime=true;
            for(int index=0;index<prime.size();index++)
            {
                
                if(test%prime.get(index)== 0)
                {
                    isPrime=false;
                }
            }
            if(isPrime==true)
            {
                prime.add(count,test);
                count++;
            }
            test+=2;
        }    
        System.out.println(prime.get(10000));
    }   
}