import java.util.*;

class Program1

{
    static void Table(int iVal)
    {
        int iCnt = 0,iTable =0;
        for(iCnt =1; iCnt <= 10;iCnt++)
        {
            iTable = iVal * iCnt;
            System.out.println(iTable);
        }
        
    }
    public static void main(String arg[])
    {
    Scanner sobj = new Scanner(System.in);
    int iNo = 0;
    
    System.out.println("Enter The Number ");
    iNo = sobj.nextInt();
    
    Table(iNo);
    }
}