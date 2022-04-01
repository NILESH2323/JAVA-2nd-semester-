import java.util.Scanner;
class DistanceBtwPoints
{
    double x1,x2,y1,y2;

    public void Display()
	{
		 
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("Enter x1 point: ");
	   
                 x1=sc.nextDouble();
	    
                 System.out.println("Enter y1 point: ");
	   
                 y1=sc.nextDouble();
 
	         System.out.println("Enter x2 point: ");
	   
                 x2=sc.nextDouble();
 
	         System.out.println("Enter y2 point: ");
	   
                 y2=sc.nextDouble();
        }

    public double Distance()
      {
         double dis;
         dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
         return dis;
      }
}

class CalculateDistance
{
	public static void main(String args[])
	
	{        
                 
             	 DistanceBtwPoints D1=new DistanceBtwPoints();         
                            
                 D1.Display();
	  	    	    	 	    
  	         System.out.println("Distance between points is: ");
                
                 double k=D1.Distance();
                 
                 System.out.println(k);
 
	}
 
}

