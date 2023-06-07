public class PyramidPattern  
{    
    public static void main(String args[])   
    {    
    
        int i, j, row = 5;       
        
        for (i=0; i<row; i++)   
        {  
            //create a loop for spaces   
            for (j=row-i; j>1; j--)   
            {  
            //prints space between two stars  
            System.out.print(" ");   
            }   
            //loop for stars
            for (j=0; j<=i; j++ )   
            {   
            //prints star      
            System.out.print("* ");   
            }   
            //prints line after a row
            System.out.println();   
        }   
    }   
}  
