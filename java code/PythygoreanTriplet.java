
public class PythygoreanTriplet
{
    public static void main(String args[])
    {
        for(int a=1; a<500;a++)
        {
            for(int b=a;b<(250000-Math.pow(a,2));b++)
            {
                if(Math.sqrt(a*a+b*b)==Math.round(Math.sqrt(a*a+b*b)) && (a+b+(int)Math.round(Math.sqrt(a*a+b*b)))==1000)
                {
                    System.out.println(a+" "+b+" "+(int)Math.round(Math.sqrt(a*a+b*b)));
                }
            }
        }
    }
}
