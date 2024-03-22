import java.util.*;

class Program1
{
    static int Pallindrome(int iVal)
    {
        int iDigit = 0,iRev = 0;
        
        if(iVal < 0)
        {
            iVal = -iVal;
        }
        while(iVal > 0)
        {
            iDigit = iVal % 10;
            
            iRev = (iRev*10)+iDigit;
            iVal = iVal / 10;
        
        }
        
        return iRev;
    }
    public static void main(String atg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iAns = 0;
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        iAns = Pallindrome(iNo);
        
        System.out.println("Pallindrome Is: " +iAns);
        
    }
}