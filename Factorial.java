import java.util.*;

class Program1
{
    public static int Factorials(int iVal)
    {
        int iFact = 1;
        int i = 0;
        for(i =1;i<=iVal;i++)
        {
            iFact = iFact * i;
        }
        return iFact;
    }
    public static void main(String atg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        iAns = Factorials(iNo);
        
        System.out.println("Factorial Is: " +iAns);
        
    }
}