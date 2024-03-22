import java.util.*;

class Program1
{
    static int CountDigit(int iVal)
    {
        int iDigit = 0,iCnt=0;
        
        if(iVal < 0)
        {
            iVal = -iVal;
        }
        while(iVal > 0)
        {
            iDigit = iVal % 10;
            iCnt++;
            iVal = iVal / 10;
        
        }
        
        return iCnt;
    }
    public static void main(String atg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        iAns = CountDigit(iNo);
        
        System.out.println("Number Of Digit Is:-" +iAns);
        
    }
}