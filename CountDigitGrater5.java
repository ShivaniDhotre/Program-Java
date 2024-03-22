import java.util.*;

class Program1
{
    public static int CountG(int iVal)
    {
        int iDigit = 0,iCnt =0;
        
        while(iVal > 0)
        {
            iDigit = iVal % 10;
            if(iDigit >= 5)
            {
                iCnt++;
            }
            iVal = iVal/10;
        }
        return iCnt;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        System.out.println("Enter The  Number: ");
        iNo = sobj.nextInt();
        
        
        
        iAns = CountG(iNo);
        
        System.out.println("Digits Greater Than 5 Are: " +iAns);
        
    }
}