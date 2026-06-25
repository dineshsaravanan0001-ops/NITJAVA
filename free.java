/*import java.util.*;
public class free {
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int correct =99;
        int guess;
         do
        {
            System.out.println("Enter your guess");
           
          
            guess =scan.nextInt();
            if (guess>correct)
            {
                System.out.println("Its too high");
            }
            else if(guess<correct)
            {
                System.out.println("Its too low");
            }
       
            }while(guess!=correct);
        System.out.println("you got it "+correct);
    }
 }
 */
  
 
 import java.util.Scanner;
 public class free{
    public static void main(String[]args){
    int result;
        Scanner scan =new Scanner(System.in);
        int present=0,absent=0;
        {
        for(int i=1;i<=7;i++)
        {
        System.out.print("Enter day "+ i+"=" );
        result=scan.nextInt();
        if(result==1){
        present++;
         }
        else if (result==0)
          {  absent++;
        
        }
        else 
        {
            System.out.println("Invalid input pls try (prsent=0 or absent=1");
        }
    }

        System.out.println("Total present "+present);
        System.out.println("Total absent "+absent);
         if(present>=5)
         {
            System.out.println("Good Attendence");      
         }
        
    }

 }
}