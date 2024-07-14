import java.util.*;
class micro implements Runnable
{
	public void run()
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			int row=sc.nextInt();
			int col=sc.nextInt();
			int[][] arr=new int[row][col];
			int sum=0;
			for(int i=0;i<row;i++)
				for(int j=0;j<col;j++)
				  arr[i][j]=sc.nextInt();
			sc.close();
			for(int i=0;i<row;i++)
			{
			  for(int j=0;j<col;j++)
			  {
				  if(i==0||i==row-1||i+j==row-1)
				     sum=sum+arr[i][j];
			  }
			}
			Thread.sleep(3000);
		    System.out.println("The Sum of Zig Zag pattern is "+sum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class zigzag {
	public static void main(String[] args) {
	
		Runnable mic=new micro();
		Thread f=new Thread(mic);
		f.start();
	}
}
