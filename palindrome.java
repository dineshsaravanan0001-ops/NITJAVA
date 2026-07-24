/*import java.util.*;
public class palindrome {
    public static boolean ispalindrome(String s){
        int n=s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }  
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        if(ispalindrome(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not polindrome");
        }
    }  
}
*/
class palindrom{
    public static void main(String[]args){
        String s="blue is the sky";
        String[] arr=
        StringBuilder sb=new StringBuilder(s);
        String reversedString =sb.reverse().toString();
         System.out.println(reversedString);
    }
}