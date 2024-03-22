import java.util.*;

class Program1
{ 
    static boolean IsPrime(int iVal)
    {
        int iCnt = 0;
        boolean bFlag = true;
        
        if (iVal <= 1)
        {
            return false;
        }
        
        for(iCnt = 2;iCnt<=iVal/2;iCnt++)
        {
            if((iVal%iCnt)==0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bAns = false;
        
        System.out.println("Enter The Number ");
        iNo = sobj.nextInt();
        
        bAns = IsPrime(iNo);
        
        if(bAns == true )
        {
            System.out.println("Number Is Prime ");
        }
        else
        {
            System.out.println("Number Is Not prime ");
        }
    }
}