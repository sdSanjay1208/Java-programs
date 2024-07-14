import java.util.*;
import java.lang.Exception;
class Vowels
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        try 
        {
            for(int i=0;i<=str.length();i++)
            {
                char v=str.charAt(i);
                if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
                {
                    System.out.println("String contains vowels.");           
                   break;   
                }
            }  
        } catch (Exception e) 
        {
            System.out.println("Error: String does not contain any vowels");
        }
        sc.close();
    }
}
