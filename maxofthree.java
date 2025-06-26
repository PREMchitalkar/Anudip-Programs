 import java.util.*;
 
public class maxofthree{   
     
     public static void main(String []args)
     {
            int a=0,b=0,c=0;
            int largest=0;
            
            Scanner X = new Scanner(System.in);
             
            System.out.print("Enter First No. :");
            a = X.nextInt(); 

            System.out.print("Enter Second No. :");
            b = X.nextInt();
             
            System.out.print("Enter Third No. :");
            c = X.nextInt(); 
             
            if( a>b && a>c)
                largest = a;
            else if(b>a && b>c)
                largest = b;
            else
                largest = c;
             
            System.out.println("Lagest Number is : "+largest);
     }
}