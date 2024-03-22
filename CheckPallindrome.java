import java.util.*;

class Program1
{
    static boolean CheckPallindrome(int iVal)
    {
        int iDigit = 0,iRev = 0;
        int iTemp = iVal;
        while(iVal > 0)
        {
            iDigit = iVal %  10;
            iRev = (iRev * 10) + iDigit;
            iVal = iVal / 10;
            
        }
        if(iRev == iTemp)
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bAns = false;
        
        System.out.println("Enter The Number:");
        iNo = sobj.nextInt();
        
        bAns = CheckPallindrome(iNo);
        
        if(bAns == true)
        {
            System.out.println("Number IS Pallindrome");
            
        }
        else
        {
            System.out.println("Number IS Not Pallindrome");
        }

    }
}