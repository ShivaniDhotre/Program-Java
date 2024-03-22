import java.util.*;

class Program1
{
    public static boolean CheckPerfect(int iVal)
    {
        int iCnt = 0,iSum = 0;
        
        if(iVal < 0)
        {
            iVal = -iVal;
        }
        for(iCnt =1; iCnt<=(iVal/2); iCnt++)
        {
            if((iVal%iCnt)==0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum==iVal)
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
        
        bAns = CheckPerfect(iNo);
        
        if (bAns==true)
        {
            System.out.println("Number Is Perfect");
            
        }
        else
        {
            System.out.println("Number Is Not Perfect");
        }
    }
}