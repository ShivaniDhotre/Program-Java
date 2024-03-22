
/*


Enter The Row: 
4
Enter The Col: 4
1
12
123
1234

*/




import java.util.*;

class Program1
{
    public static void Display(int iRow,int iCol)
    {
        int i =0,j= 0;
         if(iRow != iCol)
          {
                return;
         }
    
       
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                 if(i>=j)
                {
                    System.out.print( j +" " );
                }
               
                
                
                
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0,iNo2 = 0;
        
        System.out.println("Enter The Row: ");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter The Col: ");
        iNo2 = sobj.nextInt();
        
        Display(iNo1,iNo2);
    }
}