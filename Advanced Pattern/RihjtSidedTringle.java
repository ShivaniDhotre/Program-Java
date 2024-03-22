/* 

          *
        * * 
      * * * 
    * * * * 
  * * * * * 
  
  
 */
 
 
 import java.util.*;

class Program1
{
    public static void Display(int n)
    {
        int i = 0,j =0;
        for(i =1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        
        System.out.print("Enter The Number: ");
        iNo = sobj.nextInt();
        
        Display(iNo);
    }
}