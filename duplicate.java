//same letter finding
/*public class duplicate {
    public static void main(String[]args){
        String s="abccbaacz";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println(s.charAt(j));
                }
            }
        }
    }
    
}
    */
//vowels finding
/*public class duplicate {
    public static void main(String[]args){
        String s="Education";
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++)
            {  
              if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
              {
                count++;
              }
            } 
            System.out.println(count);
        }
    }
        */

//reversed String
/*public class duplicate {
    public static void main(String[]args){
        String s="Reversed";
        StringBuilder sb=new StringBuilder(s);
        String reversedString =sb.reverse().toString();
        System.out.println(reversedString);
    }
}
 */
//removing space
/*public class duplicate {

public static void main(String[] args) {

String s = "Hello from java programming";
 String[] arr=s.split(" ");

StringBuilder sb=new StringBuilder();

for(int i=0;i<arr.length;i++)

{

sb.append(arr[i]);

}

System.out.println(sb);

}

}
*/    

public class duplicate {
    public static void main(String[]args){
        String s="the blue is sky";
        StringBuilder sb=new StringBuilder(s);
        String reversedString =sb.reverse().toString();
        System.out.println(reversedString);
    }
}