/*import java.util.*;
public class solution {
    public static void main(String[] args) {
        // Declare and initialize an array
        Scanner scan= new Scanner(System.in);
        int[] numbers = new int[5];
        // Using a for loop to print all elements
        for (int i = 0; i < numbers.length; i++) 
            {
            numbers[i]=scan.nextInt();
            }
           }
}

*/


import java.util.*;
public class solution{
    public void  evennumbers(int num){
        if (num%2==0)
        {
            System.out.println(num+" is even");
        }
        else {
               System.out.println(num+" is odd");

        }
            
    }

    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        solution obj=new solution();
        int num=scan.nextInt();
        obj.Evennumbers(num);     
        }
    }
