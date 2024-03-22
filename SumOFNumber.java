import java.util.*;

class Program1
{
    static int SumOfNumber(int iVal)
    {
        int iDigit = 0,iSum = 0;
        
        if(iVal < 0)
        {
            iVal = -iVal;
        }
        while(iVal > 0)
        {
            iDigit = iVal % 10;
            iSum = iSum + iDigit;
            iVal = iVal / 10;
        
        }
        
        return iSum;
    }
    public static void main(String atg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        iAns = SumOfNumber(iNo);
        
        System.out.println("Sum Of Number Is:-" +iAns);
        
    }
}