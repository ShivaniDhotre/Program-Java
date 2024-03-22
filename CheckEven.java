import java.util.*;

class Program1
{
    public static boolean CheckEven(int iVal)
    {
        
          if((iVal % 2) == 0)
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
        
        bAns = CheckEven(iNo);
        
        if (bAns==true)
        {
            System.out.println("Number Is Even");
            
        }
        else
        {
            System.out.println("Number Is Not Even");
        }
    }
}