import java.util.*;
public class Numbers {
    	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("No.of.Elements:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter Elements:");
      for(int j=0;j<n;j++)
    	  arr[j]=sc.nextInt();
      int i=0,count=0;
      try {
      for(i=0;i<n;i++)
    	  
      {
    	  for(int j=i+1;j<n;j++)
    	  if(arr[i]==arr[j]) 
    	  {
    		  count=1;
    		  break;
    	  }
    	  if(count==1)
    		  break; 
      }
      if(count==1)
    	  count=count/0;
      else
    	  System.out.print("No Duplicate Numbers Found");
	}
      catch(Exception e) {
    	  System.out.printf("Error  : Duplicate Number found %d", arr[i]);      }
		  sc.close();
      
	}
}