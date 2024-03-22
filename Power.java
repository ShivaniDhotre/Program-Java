import java.util.*;

class Program1
{
    static int Powerss(int x,int y)
    {
        int iCnt = 0;
        int iMul = 1;
        for(iCnt =1; iCnt<= y; iCnt++)
        {
            iMul = iMul * x;
        }
        return iMul;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0,iNo2 = 0,iAns = 0;
        
        System.out.println("Enter The First Number");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter The Second Number");
        iNo2 = sobj.nextInt();
        
        iAns = Powerss(iNo1,iNo2);
        
        System.out.println("Power Is: " +iAns);
        
        
    }
}