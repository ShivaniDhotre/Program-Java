import java.util.*;

class Program1
{
    public static void Factorials(int iVal)
    {
       // int iFact = 1;
        int i =0;
        if(iVal==0)
        {
            System.out.println("Your Enter Value Is 0 Please Enter Another Value");
        }
        if(iVal < 0)
        {
            iVal = -iVal;
        }
        for(i = 1;i<iVal;i++)
        {
            if((iVal%i)==0)
            {
                System.out.println(i);
               // iFact = iFact * i;
            }
        }
       // return iFact;
    }
    public static void  main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        Factorials(iNo);
        
       // System.out.println("Factorial IS:-" +iAns);
    }
}