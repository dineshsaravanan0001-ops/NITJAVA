import java.util.Scanner;

public class operation {
    public static void main (String[] args)
    {
    Scanner scan=new Scanner(System.in);
    char ch=scan.next().charAt(0);
    if(ch>='A' && ch<='Z')
    {
        System.out.println(ch+" is Uppercase");
    }
    else if(ch>'a' && ch<'z')
    {
        System.out.println(ch+" is lowercase");
    }
    else if (ch>0 && ch<9)
    {
     System.out.println(ch+" 
     is digit");
    }
    else
    {
        System.out.println(ch+"is special charecter");
    }
}
}
    j