/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

/**
 *
 * @author Sandeep
 */
import java.io.*;
public class SwitchCases 
{
    public static void main(String args[])
    {
        int A,B,X,sum,difference,product,ch;
        float remainder;
        DataInputStream d= new DataInputStream(System.in);
        
        try
        {
            do
            {
            System.out.println("Enter First Value: ");
            A=Integer.parseInt(d.readLine());
            System.out.println("Enter Second Value: ");
            B=Integer.parseInt(d.readLine());
            
            System.out.println("Enter 1 to Add: ");
            System.out.println("Enter 2 to Subtract: ");
            System.out.println("Enter 3 to Multiply: ");
            System.out.println("Enter 4 to Divide: ");
            X=Integer.parseInt(d.readLine());
            
            switch(X)
            {
                case 1:
                    sum=A+B;
                    System.out.println("The Sum of "+A+" and "+B+" is "+sum);
                    break;
                    
                case 2:
                    difference=A-B;
                    System.out.println("The Difference of "+A+" and "+B+" is "+difference);
                    break;
                    
                case 3:
                    product=A*B;
                    System.out.println("The Product of "+A+" and "+B+" is "+product);
                    break;
                    
                case 4:
                    remainder=(float)A/(float)B;
                    System.out.println("The Remainder of "+A+" and "+B+" is "+remainder);
                    break;
            } 
            System.out.println("Press 1 to continue");
            ch=Integer.parseInt(d.readLine());
          }while(ch==1);
       }
        
        catch(Exception e)
                    {}
    }
}
