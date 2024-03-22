/*

Enter The Row: 4
Enter The Col: 4
*           
*  *        
*     *     
*  *  *  *  

*/

import java.util.*;

class Main
{
    public static void Display(int iRow,int iCol)
    {
        int i = 0 ,j = 0;
        for(i =1;i<=iRow;i++)
        {
            for(j =1;j<=iCol;j++)
            {
                if((j==1)||(i==4)||(i==j))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String arg[] )
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0,iNo2 = 0;
        
        System.out.print("Enter The Row: ");
        iNo1 = sobj.nextInt();
        
         System.out.print("Enter The Col: ");
        iNo2 = sobj.nextInt();
        
        Display(iNo1,iNo2);
        
    }
}