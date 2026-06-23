public class loop
{
    public static void main(String[]args)
 /*   {
        for (int i=1;i<=5;i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
           }
            System.out.println();
        }
    }
}
    */

/*{
        for (int i=5;i>=1;i--)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
           }
            System.out.println();
        }
    }
}
    */
 /*{
        for (int i=1;i<=5;i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
           }
            System.out.println();
        }
    }
}
 */

/*{
        for (int i=1;i<=5;i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
           }
            System.out.println();
        }
    }
}
 */
/*{
        for (int i=1;i<=5;i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(i);
           }
            System.out.println();
        }
    }
}
 */

{
        for (int i=5;i>=1;i--)
        {
            for (int j = i; j<=5; j++)
                //space
            {
                System.out.print(" ");
            }
            //inner loop
            for (int j = 1; j<=(i*2)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}









