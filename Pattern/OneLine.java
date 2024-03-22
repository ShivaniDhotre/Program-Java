/*
Enter The Number :5
*  *  *  *  *  

*/


import java.util.*;

class Program1
{
    public static void Display(int iVal)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt<=iVal;iCnt++)
        {
            System.out.print("*  ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;
        
        System.out.println("Enter The Number :");
        iNo1 = sobj.nextInt();
        
        Display(iNo1);
    }
}