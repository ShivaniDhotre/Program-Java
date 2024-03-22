import java.util.*;

class Program1
{
    public static int Minimum(int iVal1,int iVal2)
    {
        int iResult = 0;
        
        if(iVal1 < iVal2)
        {
            iResult = iVal1;
        }
        else
        {
            iResult = iVal2;
        }
        return iResult;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0,iNo2 = 0,iAns = 0;
        
        System.out.println("Enter The First Number ");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter The Second Number ");
        iNo2 = sobj.nextInt();
        
        iAns = Minimum(iNo1,iNo2);
        
        System.out.println("Minimum Number Is: " +iAns);
        
    }
}