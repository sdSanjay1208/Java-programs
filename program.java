import java.io.*;
class program{
    public static void main (String args[]) {
        int a = 10, b=2;
        int c = 0,d=10;
 /*        try{
            int arr [] = null;
            System.out.println(arr[1]); 
            c =a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
        }
        catch(NullPointerException e){
            int arr[] = {1,2,3,4};
            System.out.println(arr[2]);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("write your code here");
        }
        File file = new File("abc.txt");
        try{
            FileInputStream fs = new FileInputStream(file);
        }
        catch(FileNotFoundException e){
            //e.printStackTrace();
            System.out.println("Please enter valid file name:");
        }
        
        System.out.println(c);
        System.out.println("End of the code...");*/
        try {
            int arr[] = {1,2,3,4};
            System.out.println(arr[3]);

            try {
                int arr1 [] = null;
                System.out.println(arr1[3]);
                try {
                    c=a/b;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception");
                }
                finally{
                    int m=0,n=1;
                    for(int i=1;i<=d;i++)
                    {
                        System.out.printf("%d ",n);
                        int x=m;
                        m=n;
                        n=x+n;

                    }

                }
                
            } catch (NullPointerException e) {
                System.out.println("Null Exception");
                
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index");
        }
    }
}