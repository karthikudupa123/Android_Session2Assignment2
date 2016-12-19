public class Assgn2_2
{
 public static void main(String [] args)
  {
   int size,count;
   size=5;
   for(int row=0;row<size;row++)
   {
     count=0;
    for(int col=0;col<size;col++)
     {
      if(row==col && row+col==size-1)
        {
         System.out.print("*");
         break;
         } 
      else if(row==col || row+col==size-1)
        {
         System.out.print("*");
         count++;
        }
        else if(count<2)
        {
         System.out.print("_");
         }
        else
        {
         System.out.print(" ");
         }
       }
       System.out.println();
    }
  }
}

  

